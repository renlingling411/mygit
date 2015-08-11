/*
 * 项目名: 全球大联盟
 * 文件名: Item.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportbill.entity;

import java.io.Serializable;

/**
 * 
 * @author bindizhang
 *
 */
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            name;
    private String            num;
    private String            value;
    private String            remark;

    public Item() {
    }

    /**
     * @param name
     * @param num
     * @param value
     */
    public Item(String name, String num, String value, String remark) {
        super();
        this.name = name;
        this.num = num;
        this.value = value;
        this.remark = remark;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param num
     *            the num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

}
