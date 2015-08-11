/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoDetails.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoManagement.entity;

import java.io.Serializable;

/**
 * desc:报关清单详情页面返回实体类
 * @author bindizhang
 *
 */
public class ClearanceInfoDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    private String            upstreamCompany;
    private String            downstreamCompany;
    private String            upstreamCompanyOrderId;
    private String            downstreamCompanyOrderId;
    private String            subOrderId;
    private String            batchId;
    private String            innerItemTranslate;
    private Double            totalWeight;
    private Long              totalNum;
    private Long              totalSubOrderNum;
    private Long              orderId;

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
     * @return the downstreamCompany
     */
    public String getDownstreamCompany() {
        return downstreamCompany;
    }

    /**
     * @param downstreamCompany the downstreamCompany to set
     */
    public void setDownstreamCompany(String downstreamCompany) {
        this.downstreamCompany = downstreamCompany;
    }

    /**
     * @return the upstreamCompanyOrderId
     */
    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    /**
     * @param upstreamCompanyOrderId the upstreamCompanyOrderId to set
     */
    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    /**
     * @return the downstreamCompanyOrderId
     */
    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    /**
     * @param downstreamCompanyOrderId the downstreamCompanyOrderId to set
     */
    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    /**
     * @return the subOrderId
     */
    public String getSubOrderId() {
        return subOrderId;
    }

    /**
     * @param subOrderId the subOrderId to set
     */
    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the innerItemTranslate
     */
    public String getInnerItemTranslate() {
        return innerItemTranslate;
    }

    /**
     * @param innerItemTranslate the innerItemTranslate to set
     */
    public void setInnerItemTranslate(String innerItemTranslate) {
        this.innerItemTranslate = innerItemTranslate;
    }

    /**
     * @return the totalWeight
     */
    public Double getTotalWeight() {
        return totalWeight;
    }

    /**
     * @param totalWeight the totalWeight to set
     */
    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * @return the totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    /**
     * @param totalNum the totalNum to set
     */
    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * @return the totalSubOrderNum
     */
    public Long getTotalSubOrderNum() {
        return totalSubOrderNum;
    }

    /**
     * @param totalSubOrderNum the totalSubOrderNum to set
     */
    public void setTotalSubOrderNum(Long totalSubOrderNum) {
        this.totalSubOrderNum = totalSubOrderNum;
    }

}
