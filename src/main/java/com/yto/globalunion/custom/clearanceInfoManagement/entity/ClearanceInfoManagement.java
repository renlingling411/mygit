/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoManagement.java
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
 * @author bindizhang
 *
 */
public class ClearanceInfoManagement implements Serializable {

    private static final long serialVersionUID = 1L;
    // request的参数
    private String            upstreamCompanyCode;
    private String            downstreamCompanyCode;
    private String            downstreamCompanyOrderId;
    private String            startDate;
    private String            endDate;
    // response的参数
    private String            createDate;
    private String            innerItemTranslate;
    private String            weight;
    private String            senderName;
    private String            receiverName;
    private Long              id;
    // 共用的参数
    private String            batchId;
    private String            upstreamCompanyOrderId;

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
     * @return the upstreamCompanyCode
     */
    public String getUpstreamCompanyCode() {
        return upstreamCompanyCode;
    }

    /**
     * @param upstreamCompanyCode the upstreamCompanyCode to set
     */
    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    /**
     * @return the downstreamCompanyCode
     */
    public String getDownstreamCompanyCode() {
        return downstreamCompanyCode;
    }

    /**
     * @param downstreamCompanyCode the downstreamCompanyCode to set
     */
    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
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
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * @return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName the receiverName to set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

}
