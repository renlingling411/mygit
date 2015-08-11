/*
 * 项目名: 全球大联盟
 * 文件名: EncodingFormat.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siyuanfu
 *
 */
public enum EncodingFormat {
    UTF8("UTF-8"), UTF16("UTF-16"), BIG5("BIG5"), UNSUPPORTED("UNSUPPORTED");

    private static final Map<String, EncodingFormat> MAP = new HashMap<>();
    static {
        for (EncodingFormat ef : EncodingFormat.values()) {
            MAP.put(ef.value, ef);
        }
    }
    private String                                value;

    private EncodingFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EncodingFormat getEncodingFormat(String value) {
        if (MAP.containsKey(value)) {
            return MAP.get(value);
        }
        return UNSUPPORTED;
    }
}
