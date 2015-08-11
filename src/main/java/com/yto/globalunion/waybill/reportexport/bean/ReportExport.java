/*
 * 项目名: 全球大联盟
 * 文件名: ReportExport.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.reportexport.bean;

import java.io.Serializable;

/**
 * Description 进/出港运单报表导出实体类
 * @author hengchen
 *
 */
public class ReportExport implements Serializable {
    private static final long serialVersionUID = 1L;
    // 日期
    private String            date;
    // 上游公司
    private String            upstreamCompany;
    // 下游公司
    private String            dowmstreamCompany;
    // 出口公司
    private String            exportCompany;
    // 出口派送公司
    private String            exportDeliverCompany;
    // 快件数量
    private Long              amount;
    // 快件重量
    private Double            weight;
    // 上游公司运单号
    private String            upStreamOrderId;
    // 下游公司运单号
    private String            dowmStreamOrderId;
    // 目的地
    private String            destination;

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
     * @return the upstreamCompany
     */
    public String getUpstreamCompany() {
        return upstreamCompany;
    }

    /**
     * @param upstreamCompany the upstreamCompany to set
     */
    public void setUpstreamCompany(String upstreamCompany) {
        this.upstreamCompany = upstreamCompany;
    }

    /**
     * @return the dowmstreamCompany
     */
    public String getDowmstreamCompany() {
        return dowmstreamCompany;
    }

    /**
     * @param dowmstreamCompany the dowmstreamCompany to set
     */
    public void setDowmstreamCompany(String dowmstreamCompany) {
        this.dowmstreamCompany = dowmstreamCompany;
    }

    /**
     * @return the exportCompany
     */
    public String getExportCompany() {
        return exportCompany;
    }

    /**
     * @param exportCompany the exportCompany to set
     */
    public void setExportCompany(String exportCompany) {
        this.exportCompany = exportCompany;
    }

    /**
     * @return the exportDeliverCompany
     */
    public String getExportDeliverCompany() {
        return exportDeliverCompany;
    }

    /**
     * @param exportDeliverCompany the exportDeliverCompany to set
     */
    public void setExportDeliverCompany(String exportDeliverCompany) {
        this.exportDeliverCompany = exportDeliverCompany;
    }

    /**
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return the upStreamOrderId
     */
    public String getUpStreamOrderId() {
        return upStreamOrderId;
    }

    /**
     * @param upStreamOrderId the upStreamOrderId to set
     */
    public void setUpStreamOrderId(String upStreamOrderId) {
        this.upStreamOrderId = upStreamOrderId;
    }

    /**
     * @return the dowmStreamOrderId
     */
    public String getDowmStreamOrderId() {
        return dowmStreamOrderId;
    }

    /**
     * @param dowmStreamOrderId the dowmStreamOrderId to set
     */
    public void setDowmStreamOrderId(String dowmStreamOrderId) {
        this.dowmStreamOrderId = dowmStreamOrderId;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

}
