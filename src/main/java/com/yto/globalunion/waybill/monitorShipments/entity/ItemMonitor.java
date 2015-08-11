/*
 * 项目名: 全球大联盟
 * 文件名: ItemMonitor.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.monitorShipments.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author tingtingwu
 *
 */
public class ItemMonitor implements Serializable {
    private static final long      serialVersionUID = 1L;
    private String                 upstreamCompanyOrderId;  // 上游公司运单号
    private String                 upstreamCompanyCode;     // 上游公司编号
    private String                 downstreamCompanyOrderId; // 下游公司运单号
    private String                 downstreamCompanyCode;   // 下游公司编号
    private String                 upCompanyName;           // 上游公司名
    private String                 downCompanyName;         // 下游公司名
    private String                 senderName;              // 发件人姓名
    private String                 orderState;              // 运单状态
    private List<MonitorShipments> messageList;             // 每个上游或下游运单号对应的具体赱件集合

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
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName
     *            the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the upstreamCompanyOrderId
     */
    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    /**
     * @param upstreamCompanyOrderId
     *            the upstreamCompanyOrderId to set
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
     * @param upstreamCompanyCode
     *            the upstreamCompanyCode to set
     */
    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    /**
     * @return the downstreamCompanyOrderId
     */
    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    /**
     * @param downstreamCompanyOrderId
     *            the downstreamCompanyOrderId to set
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
     * @param downstreamCompanyCode
     *            the downstreamCompanyCode to set
     */
    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
    }

    /**
     * @return the upCompanyName
     */
    public String getUpCompanyName() {
        return upCompanyName;
    }

    /**
     * @param upCompanyName
     *            the upCompanyName to set
     */
    public void setUpCompanyName(String upCompanyName) {
        this.upCompanyName = upCompanyName;
    }

    /**
     * @return the downCompanyName
     */
    public String getDownCompanyName() {
        return downCompanyName;
    }

    /**
     * @param downCompanyName
     *            the downCompanyName to set
     */
    public void setDownCompanyName(String downCompanyName) {
        this.downCompanyName = downCompanyName;
    }

    /**
     * @return the messageList
     */
    public List<MonitorShipments> getMessageList() {
        return messageList;
    }

    /**
     * @param messageList
     *            the messageList to set
     */
    public void setMessageList(List<MonitorShipments> messageList) {
        this.messageList = messageList;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((upstreamCompanyCode == null) ? 0 : upstreamCompanyCode.hashCode());
        result = prime * result + ((upstreamCompanyOrderId == null) ? 0 : upstreamCompanyOrderId.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemMonitor other = (ItemMonitor) obj;
        if (upstreamCompanyCode.equals(other.upstreamCompanyCode) && upstreamCompanyOrderId.equals(other.upstreamCompanyOrderId)) {
            return true;
        }
        return false;
    }
}
