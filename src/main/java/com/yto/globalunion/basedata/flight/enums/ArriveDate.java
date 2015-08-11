/*
 * 项目名: 全球大联盟
 * 文件名: ArriveDate.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.flight.enums;

/**
 * @author penglan
 *
 */
public enum ArriveDate {
    TODAY("0", "今天"), TOMORROW("1", "今天"), YESTERDAY("-1", "昨天"), ;
    private String code;
    private String desc;

    /**
     * @param code
     * @param desc
     */
    private ArriveDate(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    public static String[] getAllArriveDate() {
        String[] dates = new String[ArriveDate.values().length];
        int index = 0;
        for (ArriveDate date : ArriveDate.values()) {
            dates[index++] = date.getCode();
        }

        return dates;
    }

}
