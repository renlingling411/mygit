/*
 * 项目名: 全球大联盟
 * 文件名: OrderEntryAndImport.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.entity;

import java.io.Serializable;

/**
 * Description：运单信息录入和导入实体类
 * @author hengchen
 *
 */
public class OrderEntryAndImport implements Serializable {
    private static final long serialVersionUID = 1L;
    // 日期
    private String            date;
    // 上游公司名称
    private String            upStreamCompany;
    // 上游公司运单号
    private String            upStreamCompanyId;
    // 下游公司名称
    private String            downStreamCompany;
    // 下游公司运单号
    private String            downStreamCompanyId;
    // 是否问题件
    private String            isShipment;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the upStreamCompany
     */
    public String getUpStreamCompany() {
        return upStreamCompany;
    }

    /**
     * @param upStreamCompany the upStreamCompany to set
     */
    public void setUpStreamCompany(String upStreamCompany) {
        this.upStreamCompany = upStreamCompany;
    }

    /**
     * @return the upStreamCompanyId
     */
    public String getUpStreamCompanyId() {
        return upStreamCompanyId;
    }

    /**
     * @param upStreamCompanyId the upStreamCompanyId to set
     */
    public void setUpStreamCompanyId(String upStreamCompanyId) {
        this.upStreamCompanyId = upStreamCompanyId;
    }

    /**
     * @return the downStreamCompany
     */
    public String getDownStreamCompany() {
        return downStreamCompany;
    }

    /**
     * @param downStreamCompany the downStreamCompany to set
     */
    public void setDownStreamCompany(String downStreamCompany) {
        this.downStreamCompany = downStreamCompany;
    }

    /**
     * @return the downStreamCompanyId
     */
    public String getDownStreamCompanyId() {
        return downStreamCompanyId;
    }

    /**
     * @param downStreamCompanyId the downStreamCompanyId to set
     */
    public void setDownStreamCompanyId(String downStreamCompanyId) {
        this.downStreamCompanyId = downStreamCompanyId;
    }

    /**
     * @return the isShipment
     */
    public String getIsShipment() {
        return isShipment;
    }

    /**
     * @param isShipment the isShipment to set
     */
    public void setIsShipment(String isShipment) {
        this.isShipment = isShipment;
    }

}
