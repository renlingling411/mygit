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
package com.yto.globalunion.waybill.xnExport;

import java.io.Serializable;

/**
 * @author zhenghaohong
 *
 */
public class XnInExportData implements Serializable {

    private static final long serialVersionUID = 1L;

    // request填充的数据
    private String            startDate;
    private String            endDate;

    // response的数据
    private String            date;
    private String            downstreamCompanyOrderId;
    private String            upStreamCompanyName;
    private String            senderName;
    private String            senderAddress;
    private String            senderPhone;
    private String            downstreamCompanyName;
    private String            receiverName;
    private String            receiverAddress;
    private String            receiverPhone;
    private String            goodsName;
    private String            interNumber;
    private String            value;
    private String            weight;
    private String            upstreamCompanyOrderId;
    private String            remark;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    public String getUpStreamCompanyName() {
        return upStreamCompanyName;
    }

    public void setUpStreamCompanyName(String upStreamCompanyName) {
        this.upStreamCompanyName = upStreamCompanyName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getInterNumber() {
        return interNumber;
    }

    public void setInterNumber(String interNumber) {
        this.interNumber = interNumber;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
