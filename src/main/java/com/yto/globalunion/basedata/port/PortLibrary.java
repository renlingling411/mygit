/*
 * 项目名: 全球大联盟
 * 文件名: PortLibrary.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.port;

import java.util.HashMap;
import java.util.Map;

/**
 * @author penglan
 *
 */
public enum PortLibrary {
    // 口岸类型
    PORT_TYPE_ONE_ZH_CN("一类", "1"), PORT_TYPE_ONE_EN_US("type of one", "1"), PORT_TYPE_TWO_ZH_CN("二类", "2"), PORT_TYPE_TWO_EN_US("type of two", "2"),
    // 允许外籍
    ALLOW_FOREIGN_AGREE_ZH_CN("有效", "1"), ALLOW_FOREIGN_AGREE_EN_US("agree", "1"), ALLOW_FOREIGN_DISAGREE_ZH_CN("无效", "2"), ALLOW_FOREIGN_DISAGREE_EN_US("disagree", "2"),
    // 使用状态
    USE_STATE_VALID_ZH_CN("允许", "1"), USE_STATE_VALID_EN_US("valid", "1"), USE_STATE_INVALID_ZH_CN("不允许", "2"), USE_STATE_INVALID_EN_US("invalid", "2"),
    // 口岸种类
    PORT_KIND_AIR_ZH_CN("航空口岸", "1"), PORT_KIND_AIR_EN_US("air port", "1"), PORT_KIND_SEA_ZH_CN("海/河运口岸", "2"), PORT_KIND_SEA_EN_US("sea/river port", "2"), ;
    private String desc;
    private String key;

    private PortLibrary(String desc, String key) {
        this.desc = desc;
        this.key = key;
    }

    private static final Map<String, String> LIBRARY = new HashMap<>();
    static {
        for (PortLibrary portLibrary : PortLibrary.values()) {
            LIBRARY.put(portLibrary.desc, portLibrary.key);
        }
    }

    public static String getKeyByDesc(String desc) {
        return LIBRARY.get(desc);
    }
}
