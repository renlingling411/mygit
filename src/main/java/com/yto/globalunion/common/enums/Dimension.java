/*
 * 项目名: 全球大联盟
 * 文件名: Dimension.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.enums;

/**
 * @author bindizhang
 *
 */
public enum Dimension {
    /**
     * 每日
     */
    DAILY("daily"),
    /**
     * 每月
     */
    MONTHLY("monthly");

    private String dimension;

    private Dimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dimension);
    }
}
