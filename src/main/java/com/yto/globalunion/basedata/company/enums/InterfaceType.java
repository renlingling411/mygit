/*
 * 项目名: 全球大联盟
 * 文件名: InterfaceType.java
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
public enum InterfaceType {
    TR("TR"), // 走件信息接收
    TS("TS"), // 走件信息推送
    MR("MR"), // 运单信息接收
    MS("MS"), // 运单信息推送
    UNSUPPORTED("UNSUPPORTED");

    private static final Map<String, InterfaceType> MAP = new HashMap<>();
    static {
        for (InterfaceType ef : InterfaceType.values()) {
            MAP.put(ef.value, ef);
        }
    }
    private String                                  value;

    private InterfaceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static InterfaceType getInterfaceType(String value) {
        if (MAP.containsKey(value)) {
            return MAP.get(value);
        }
        return UNSUPPORTED;
    }
}
