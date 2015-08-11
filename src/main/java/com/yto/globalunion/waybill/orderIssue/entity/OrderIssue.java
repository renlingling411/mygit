/*
 * 项目名: 全球大联盟
 * 文件名: orderIssue.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderIssue.entity;

import java.io.Serializable;

/**
 * @author hengchen
 *
 */
public class OrderIssue implements Serializable {
    private static final long serialVersionUID = 1L;
    // 上报时间
    private String            issueReplyDate;
    // 开始时间
    private String            startDate;
    // 结束时间
    private String            endDate;
    // 问题件单号
    private String            issueNumber;
    // 上游公司名称
    private String            upstreamCompanyName;
    // 上游公司运单号
    private String            upstreamCompanyOrderId;
    // 上游公司编号
    private String            upstreamCompanyCode;
    // 下游公司名称
    private String            downstreamCompanyName;
    // 下游公司运单号
    private String            downstreamCompanyOrderId;
    // 下游公司编号
    private String            downstreamCompanyCode;
    // 最后回复时间
    private String            lastReplyDate;
    // 问题件描述
    private String            issueDescription;
    // 问题件记录人
    private String            issueUser;
    // 收件人
    private String            receiverName;
    // 最后状态
    private String            orderState;

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

    /**
     * @return the orderState
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * @param orderState the orderState to set
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
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
     * @return the issueReplyDate
     */
    public String getIssueReplyDate() {
        return issueReplyDate;
    }

    /**
     * @param issueReplyDate the issueReplyDate to set
     */
    public void setIssueReplyDate(String issueReplyDate) {
        this.issueReplyDate = issueReplyDate;
    }

    /**
     * @return the issueNumber
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * @param issueNumber the issueNumber to set
     */
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     * @return the upstreamCompanyName
     */
    public String getUpstreamCompanyName() {
        return upstreamCompanyName;
    }

    /**
     * @param upstreamCompanyName the upstreamCompanyName to set
     */
    public void setUpstreamCompanyName(String upstreamCompanyName) {
        this.upstreamCompanyName = upstreamCompanyName;
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
     * @return the downstreamCompanyName
     */
    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    /**
     * @param downstreamCompanyName the downstreamCompanyName to set
     */
    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
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
     * @return the lastReplyDate
     */
    public String getLastReplyDate() {
        return lastReplyDate;
    }

    /**
     * @param lastReplyDate the lastReplyDate to set
     */
    public void setLastReplyDate(String lastReplyDate) {
        this.lastReplyDate = lastReplyDate;
    }

    /**
     * @return the issueDescription
     */
    public String getIssueDescription() {
        return issueDescription;
    }

    /**
     * @param issueDescription the issueDescription to set
     */
    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    /**
     * @return the issueUser
     */
    public String getIssueUser() {
        return issueUser;
    }

    /**
     * @param issueUser the issueUser to set
     */
    public void setIssueUser(String issueUser) {
        this.issueUser = issueUser;
    }

}
