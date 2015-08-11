/*
 * 项目名: 全球大联盟
 * 文件名: VelocityUtil.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import com.yto.globalunion.common.contants.Encoding;
import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;

/**
 * @author wenhuiwang
 *
 */
public abstract class VelocityUtil {

    private static final Logger LOGGER = Logger.getLogger(VelocityUtil.class);

    /**
     * 根据传入的vm模板String,转换成解析后的html的String
     * @param richText
     * @param output
     * @param contexts
     * @param logTag
     * @return
     */
    public static String velocityEvaluate(String richText, Map<String, Object> contexts, String logTag) {
        try (Reader r = new StringReader(richText); StringWriter w = new StringWriter()) {
            Properties p = new Properties();
            p.setProperty(Velocity.INPUT_ENCODING, Encoding.UTF_8);
            p.setProperty(Velocity.OUTPUT_ENCODING, Encoding.UTF_8);
            VelocityEngine engine = new VelocityEngine();
            engine.init(p);
            VelocityContext context = new VelocityContext(contexts);
            engine.evaluate(context, w, logTag, r);
            return w.toString();
        } catch (IOException e) {
            LOGGER.warn("velocityEvaluate error:" + e);
            throw new YtoBusinessException("velocityEvaluate error:" + logTag, e, ErrorCode.IO_EXCEPTION);
        }
    }

}
