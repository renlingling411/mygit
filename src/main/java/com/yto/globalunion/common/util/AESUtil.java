/*
 * 项目名: 全球大联盟
 * 文件名: AESUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/**
 * @author dongdongliu
 * AES加密解密工具类
 */
public abstract class AESUtil {
    private static Logger LOGGER           = Logger.getLogger(AESUtil.class);
    private static String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    // private static String CIPHER_ALGORITHM="AES/ECB/NoPadding";
    // private static String CIPHER_ALGORITHM="AES/OFB/NoPadding";
    /**
     * 加密
     * @param content
     * @param aseKey
     * @return
     * @throws Exception 
     */
    public static String encryptAES(String content, String aesKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes("UTF-8")), "AES");
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encriptContent = cipher.doFinal(content.getBytes("UTF-8"));
        return new String(Base64.encodeBase64(encriptContent));
    }

    /**
     * 解密
     * @param content
     * @param aseKey
     * @return
     * @throws Exception 
     */
    public static String descrptAES(String content, String aesKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes("UTF-8")), "AES");
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return new String(cipher.doFinal(Base64.decodeBase64(content.getBytes("UTF-8"))), "UTF-8");
    };
}
