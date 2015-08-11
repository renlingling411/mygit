/*
 * 项目名: 全球大联盟
 * 文件名: orderIssueQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderIssue.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.orderIssue.entity.OrderIssue;

/**
 * @author hengchen
 *
 */
public class OrderIssueQueryResponseBean extends ResponseBaseBean {

    private static final long      serialVersionUID = 1L;
    private PagingBean<OrderIssue> page;
    private String                 upstreamCompanyName;
    private String                 upstreamCompanyOrderId;
    private String                 downstreamCompanyName;
    private String                 downstreamCompanyOrderId;
    private String                 receiverName;
    private String                 orderState;

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
     * @return the page
     */
    public PagingBean<OrderIssue> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<OrderIssue> page) {
        this.page = page;
    }

}
