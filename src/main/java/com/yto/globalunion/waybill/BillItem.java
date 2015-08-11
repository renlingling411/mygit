/*
 * 项目名: 全球大联盟
 * 文件名: BillItem.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class BillItem implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            itemName;
    private int               itemNum;
    private double            itemWeight;
    private double            itemValue;
    private String            itemNameTranslate;
    private Long              orderId;
    private String            itemRemark;

    /**
     * @return the itemRemark
     */
    public String getItemRemark() {
        return itemRemark;
    }

    /**
     * @param itemRemark the itemRemark to set
     */
    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemNum
     */
    public int getItemNum() {
        return itemNum;
    }

    /**
     * @param itemNum the itemNum to set
     */
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    /**
     * @return the itemWeight
     */
    public double getItemWeight() {
        return itemWeight;
    }

    /**
     * @param itemWeight the itemWeight to set
     */
    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    /**
     * @return the itemValue
     */
    public double getItemValue() {
        return itemValue;
    }

    /**
     * @param itemValue the itemValue to set
     */
    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * @return the itemNameTranslate
     */
    public String getItemNameTranslate() {
        return itemNameTranslate;
    }

    /**
     * @param itemNameTranslate the itemNameTranslate to set
     */
    public void setItemNameTranslate(String itemNameTranslate) {
        this.itemNameTranslate = itemNameTranslate;
    }

    /**
     * @return the orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

}
