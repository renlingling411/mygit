/*
 * 项目名: 全球大联盟
 * 文件名: C5EntryBill.java
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
 * @author penglan
 *
 */
public class C5EntryBill implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private boolean           add;                            // 状态，true表示新增，false表示更新
    private String            qikeNo           = "7076259101"; // 契客代号，固定值

    private String            checkNo          = "";          // 托运单号，可为空
    private String            upstreamOrderNo;                // 上游运单号

    private String            senderName;
    private String            senderAddress;
    private String            senderPhone;
    private String            senderMobile;

    private String            receiverName;
    private String            receiverAddress;
    private String            receiverPhone;
    private String            receiverMobile;

    private String            pinMing          = "";

    private double            agencyFound;                    // 代收货款
    private String            remark;                         // 备注
    private String            memberNo         = "";          // 会员编号

    private String            specification    = "1";         // 规格 1-60cm
                                                               // 2-90cm 3-120cm
                                                               // 4-150cm
    private String            temperature      = "1";         // 温度：1-常溫 2-冷藏
                                                               // 3-冷凍
    private String            distance         = "1";         // 距离： 0-本縣市
                                                               // 1-外縣市 2- 離島
    private String            isBroken         = "N";
    private String            precision        = "N";         // 精密
    private String            shipmentDate;                   // 出货日期
    private String            assignDate       = "";          // 预定配送日期
    private String            assignTime       = "4";         // 配送时间:1-中午前
                                                               // 2-12~17時
                                                               // 3-17~20時
                                                               // 4-不指定

    /**
     * @return the qikeNo
     */
    public String getQikeNo() {
        return qikeNo;
    }

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
     * @return the add
     */
    public boolean isAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(boolean add) {
        this.add = add;
    }

    /**
     * @param qikeNo the qikeNo to set
     */
    public void setQikeNo(String qikeNo) {
        this.qikeNo = qikeNo;
    }

    /**
     * @return the checkNo
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * @param checkNo the checkNo to set
     */
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    /**
     * @return the upstreamOrderNo
     */
    public String getUpstreamOrderNo() {
        return upstreamOrderNo;
    }

    /**
     * @param upstreamOrderNo the upstreamOrderNo to set
     */
    public void setUpstreamOrderNo(String upstreamOrderNo) {
        this.upstreamOrderNo = upstreamOrderNo;
    }

    /**
     * @return the isBroken
     */
    public String getIsBroken() {
        return isBroken;
    }

    /**
     * @param isBroken the isBroken to set
     */
    public void setIsBroken(String isBroken) {
        this.isBroken = isBroken;
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
     * @return the senderAddress
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * @param senderAddress the senderAddress to set
     */
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    /**
     * @return the senderPhone
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * @param senderPhone the senderPhone to set
     */
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    /**
     * @return the senderMobile
     */
    public String getSenderMobile() {
        return senderMobile;
    }

    /**
     * @param senderMobile the senderMobile to set
     */
    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
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
     * @return the receiverAddress
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * @param receiverAddress the receiverAddress to set
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * @return the receiverPhone
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * @param receiverPhone the receiverPhone to set
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * @return the receiverMobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * @param receiverMobile the receiverMobile to set
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * @return the agency_found
     */
    public double getAgencyFound() {
        return agencyFound;
    }

    /**
     * @param agency_found the agency_found to set
     */
    public void setAgencyFound(double agencyFound) {
        this.agencyFound = agencyFound;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the memberNo
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * @param memberNo the memberNo to set
     */
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    /**
     * @return the specification
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * @param specification the specification to set
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the distance
     */
    public String getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * @return the precision
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(String precision) {
        this.precision = precision;
    }

    /**
     * @return the shipmentDate
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * @param shipmentDate the shipmentDate to set
     */
    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    /**
     * @return the assignDate
     */
    public String getAssignDate() {
        return assignDate;
    }

    /**
     * @param assignDate the assignDate to set
     */
    public void setAssignDate(String assignDate) {
        this.assignDate = assignDate;
    }

    /**
     * @return the assignTime
     */
    public String getAssignTime() {
        return assignTime;
    }

    /**
     * @param assignTime the assignTime to set
     */
    public void setAssignTime(String assignTime) {
        this.assignTime = assignTime;
    }

    /**
     * @return the pinMing
     */
    public String getPinMing() {
        return pinMing;
    }

    /**
     * @param pinMing the pinMing to set
     */
    public void setPinMing(String pinMing) {
        this.pinMing = pinMing;
    }

}
