/*
 * 项目名: 全球大联盟
 * 文件名: IoUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;

/**
 * @author murphy
 *
 */
public interface IoUtil {
    static final Logger LOGGER = Logger.getLogger(IoUtil.class);

    static String readAndClose(InputStream inputStream) {
        try {
            return IOUtils.toString(inputStream);
        } catch (IOException e) {
            LOGGER.warn(e.getMessage(), e);
            throw new YtoBusinessException(e, ErrorCode.IO_EXCEPTION);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    /**
     * 读取模板
     * @param clazz
     * @param path
     * @return
     */
    public static String getFileContent(Class<?> clazz, String path) {
        if (clazz == null || path == null) {
            throw new YtoBusinessException("获取模板时传入参数不正确", ErrorCode.DEFAULT_ERROR);
        }
        try (InputStream is = clazz.getResourceAsStream(path)) {
            return IoUtil.readAndClose(is);
        } catch (IOException e) {
            LOGGER.warn("获取模板失败", e);
            throw new YtoBusinessException("获取模板失败", e, ErrorCode.IO_EXCEPTION);
        }
    }
    
    /**
     * String转换为inputStream
     * @param str
     * @return
     */
    public static InputStream stringToInputStream(String str,String encode) {
        try {
            return new ByteArrayInputStream(str.getBytes(encode));
        } catch (UnsupportedEncodingException e) {
            LOGGER.warn(e.getMessage(), e);
            throw new YtoBusinessException(e.getMessage(), ErrorCode.UNSUPPORTED_ENCODING_EXCEPTION);
        }
    }
}
