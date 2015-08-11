/*
 * 项目名: 全球大联盟
 * 文件名: BLCReceiptBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

/**
 * @author dongdongliu
 * 
 */
public class HZHGReceiptRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private String            xmlData;

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }
}
