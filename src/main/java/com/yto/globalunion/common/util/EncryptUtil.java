/*
 * 项目名: 全球大联盟
 * 文件名: EncryptUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;

import com.yto.globalunion.common.contants.Encoding;
import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;
import com.yto.globalunion.common.util.bean.ThreeDes;

/**
 * 加密工具类
 * @author penglan
 *
 */
public abstract class EncryptUtil {
    private static final Logger LOGGER = Logger.getLogger(EncryptUtil.class);

    public static String md5Encrypt(String data) {
        return DigestUtils.md5Hex(data);
    }
    public static void main(String[] args) {
        System.out.println(base64Encode(md5Encrypt("hello world")));
    }

    /**
     * 明文加密，返回加密后的数据
     * @param data
     * @return
     */
    public static String getEncString(String data) {
        return new ThreeDes().getEncString(data);
    }

    /**
     * 密文解密，返回明文
     * @param data
     * @return
     */
    public static String getDesString(String data) {
        return new ThreeDes().getDesString(data);
    }

    /**
     * 明文加密（通过自定义的key），返回加密后的数据
     * @param publicKey
     * @param data
     * @return
     */
    public static String getEncString(String publicKey, String data) {
        return new ThreeDes(publicKey).getEncString(data);
    }

    /**
     * 密文解密（通过自定义的key），返回明文
     * @param publicKey
     * @param data
     * @return
     */
    public static String getDesString(String publicKey, String data) {
        return new ThreeDes(publicKey).getDesString(data);
    }

    public static String base64Encode(String input) {
        try {
            return Base64.encodeBase64String(input.getBytes(Encoding.UTF_8));
        } catch (UnsupportedEncodingException e) {
            LOGGER.warn(e.getMessage(), e);
            throw new YtoBusinessException(e, ErrorCode.DEFAULT_ERROR);
        }
    }

    public static String base64Decode(String input) {
        try {
            return new String(Base64.decodeBase64(input), Encoding.UTF_8);
        } catch (UnsupportedEncodingException e) {
            LOGGER.warn(e.getMessage(), e);
            throw new YtoBusinessException(e, ErrorCode.DEFAULT_ERROR);
        }
    }

    public static String encryptOrder(String req, String paternId, String clientId) {
        // MD5加密
        MessageDigest messagedigest;
        String queryString = "";
        try {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update((req + paternId).getBytes(Encoding.UTF_8));
            byte[] abyte0 = messagedigest.digest();
            String data_digest = new String(Base64.encodeBase64(abyte0));

            // 查询
            // 正常的签名方式
            queryString = "logistics_interface=" + URLEncoder.encode(req, Encoding.UTF_8) + "&data_digest=" + URLEncoder.encode(data_digest, Encoding.UTF_8) + "&clientId=" + URLEncoder.encode(clientId, Encoding.UTF_8);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            LOGGER.error("加密订单出错：" + e);
            throw new YtoBusinessException("加密订单出错：", e, ErrorCode.ENCRYPT_ERROR);
        }
        return queryString;
    }

    public static String buildEncryptStandardSenderData(String key, String data, String companyCode) {
        String encryptData = encryptSendData(key, data);
        return new StringBuilder("logistics_interface=").append(encryptData).append("&data_digest=").append(signuatureURLSendData(companyCode, encryptData)).append("&clientID=").append(companyCode).toString();
    }

    /**
     * 按照平台标准进行加密
     * logistics_interface”字段表示要发送的XML内容。
     * 对XML内容采用DES算法进行加密(由管理员提供秘钥), 加密后利用base64算法转为ASCII字符串。

     */
    public static String encryptSendData(String key, String data) {
        if (key == null || data == null) {
            return data;
        }

        String encryptData = getEncString(key, data);// 进行密钥加密
        encryptData = new String(Base64.encodeBase64(encryptData.getBytes()));// 进行Base64
        return encryptData;

    }

    /**
     * 按照平台标准进行解密
     * logistics_interface”字段表示要发送的XML内容。
     * 对XML内容采用DES算法进行加密(由管理员提供秘钥), 加密后利用base64算法转为ASCII字符串。

     */
    public static String decryptSendData(String key, String encryptData) {
        if (key == null || encryptData == null) {
            return encryptData;
        }
        String decryptData = new String(Base64.decodeBase64(encryptData.getBytes()));
        decryptData = getDesString(key, decryptData);
        return decryptData;
    }

    /**
     * 按照平台标准进行数字签名(包含加密URL传输)
     * 内容加密后为： 加上一个partnered，然后再经过md5加密，同样需要对签名的字符串进行URL编码
                  注明：partnered即为公司编号。传入的是加密后的内容字符串
     */
    public static String signuatureURLSendData(String companyCode, String encryptData) {
        if (companyCode == null || encryptData == null) {
            return encryptData;
        }
        try {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update((companyCode + encryptData + companyCode).getBytes(Encoding.UTF_8));
            byte[] digestData = messagedigest.digest();
            String encodeData = new String(Base64.encodeBase64(digestData));
            encodeData = URLEncoder.encode(encodeData, Encoding.UTF_8);
            return encodeData;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            LOGGER.warn("发送数据加密：", e);
            throw new YtoBusinessException("数据加密错误", e, ErrorCode.ENCRYPT_ERROR);
        }
    }

    /**
     * 按照平台标准进行数字签名
     * 内容加密后为： 加上一个partnered，然后再经过md5加密
                  注明：partnered即为公司编号。传入的是加密后的内容字符串
     */
    public static String signuatureSendData(String companyCode, String encryptData) {
        if (companyCode == null || encryptData == null) {
            return encryptData;
        }
        try {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update((companyCode + encryptData + companyCode).getBytes(Encoding.UTF_8));
            byte[] digestData = messagedigest.digest();
            String encodeData = new String(Base64.encodeBase64(digestData));
            return encodeData;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            LOGGER.warn("发送数据加密：", e);
            throw new YtoBusinessException("数据加密错误", e, ErrorCode.ENCRYPT_ERROR);
        }
    }

    /**
     * 推送给金刚进行加密
     * 内容加密：要加密的内容加上parentID，经过MD5加密和Base64加密，再URL编码得到data_digest
     * 返回数据:根据海外走件信息同步接口1.2.doc要求的得到最终要发送的数据返回
     * @param encryptData
     * @param parentID
     * @param clientId
     * @return
     */
    public static String encryptSendDataToYTO(String encryptData, String parentID, String clientId) {
        MessageDigest messagedigest;
        try {
            // encryptData是要发送的还未URL编码的logistics_interface数据
            // parentID是加密要用的秘钥
            String strEncode = URLEncoder.encode(encryptData + parentID, Encoding.UTF_8);
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(strEncode.getBytes());
            byte[] abyte0 = messagedigest.digest();
            String data_digest = new String(Base64.encodeBase64(abyte0));
            String lastStr = "logistics_interface=" + URLEncoder.encode(encryptData, Encoding.UTF_8) + "&data_digest=" + URLEncoder.encode(data_digest, Encoding.UTF_8) + "&client_id=" + URLEncoder.encode(clientId, Encoding.UTF_8);
            LOGGER.info("最终要推送给金刚的走件信息：" + lastStr);
            return lastStr;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            LOGGER.warn("向圆通发送走件信息加密失败：" + e.getMessage(), e);
            throw new YtoBusinessException("信息加密失败", e, ErrorCode.ENCRYPT_ERROR);
        }

    }
}
