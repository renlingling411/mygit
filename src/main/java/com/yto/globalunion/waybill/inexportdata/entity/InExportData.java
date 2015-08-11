/*
 * 项目名: 全球大联盟
 * 文件名: InExportData.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportdata.entity;

import java.io.Serializable;

/**
 * 
 * @author bindizhang
 *
 */
public class InExportData implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    // response的数据
    private String            date;
    private String            upstreamCompany;
    private String            downstreamCompany;
    private Long              packageNum;
    private Double            packageWeight;
    private String            upstreamCompanyOrderId;
    private String            downstreamCompanyOrderId;
    private String            receiverCity;
    // request填充的数据
    private String            startDate;
    private String            endDate;
    private String            dimension;               // 统计维度
    private String            weightStart;
    private String            weightEnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Long packageNum) {
        this.packageNum = packageNum;
    }

    public Double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUpstreamCompany() {
        return upstreamCompany;
    }

    public void setUpstreamCompany(String upstreamCompany) {
        this.upstreamCompany = upstreamCompany;
    }

    public String getDownstreamCompany() {
        return downstreamCompany;
    }

    public void setDownstreamCompany(String downstreamCompany) {
        this.downstreamCompany = downstreamCompany;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the weightStart
     */
    public String getWeightStart() {
        return weightStart;
    }

    /**
     * @param weightStart the weightStart to set
     */
    public void setWeightStart(String weightStart) {
        this.weightStart = weightStart;
    }

    /**
     * @return the weightEnd
     */
    public String getWeightEnd() {
        return weightEnd;
    }

    /**
     * @param weightEnd the weightEnd to set
     */
    public void setWeightEnd(String weightEnd) {
        this.weightEnd = weightEnd;
    }

}
