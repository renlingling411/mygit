/*
 * 项目名: 全球大联盟
 * 文件名: ReceiveMethod.java
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
 * @author murphy
 *
 */
public enum SendReceiveMethod {
    FTP("2"), HTTP("1"), UNSUPPORTED("-1");

    private static final Map<String, SendReceiveMethod> MAP = new HashMap<>();
    static {
        for (SendReceiveMethod rm : SendReceiveMethod.values()) {
            MAP.put(rm.value, rm);
        }
    }
    private String                                      value;

    private SendReceiveMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SendReceiveMethod getReceiveMethod(String value) {
        if (MAP.containsKey(value)) {
            return MAP.get(value);
        }
        return UNSUPPORTED;
    }
}
