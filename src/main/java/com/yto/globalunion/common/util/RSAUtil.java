/*
 * 项目名: 全球大联盟
 * 文件名: RSAUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

/**
 * @author dongdongliu
 * RSA加密、解密、签名验证工具类
 */
public abstract class RSAUtil {

    private static Logger LOGGER = Logger.getLogger(RSAUtil.class);

    /**
     * 验证签名
     * @param data
     * @param publicKeyByte
     * @param sign
     * @return
     * @throws Exception 
     */
    public static boolean verify(byte[] data, String publicKeyByte, String sign) throws Exception {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyByte.getBytes("UTF-8")));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(publicKey);
        signature.update(data);
        return signature.verify(Base64.decodeBase64(sign.getBytes("UTF-8")));
    }
}
