/*
 * 项目名: 全球大联盟
 * 文件名: InExportBill.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportbill.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author bindizhang
 *
 */
public class InExportBill implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upstreamCompanyCode;
    private String            upstreamCompanyId;
    private String            downstreamCompanyCode;
    private String            downstreamCompanyId;
    private String            isProblemItem;
    private String            createDate;
    private String            startDate;
    private String            endDate;

    /*
     * 订单的详细信息
     */
    /* 寄件人信息 */
    private String            senderName;
    private String            senderPostcode;
    private String            senderPhone;
    private String            senderMobile;
    private String            senderAddress;

    /* 收件人信息 */
    private String            receiverName;
    private String            receiverPostcode;
    private String            receiverPhone;
    private String            receiverMobile;
    private String            receiverAddress;

    private String            packWeight;
    private String            packLength;
    private String            packWidth;
    private String            packHeight;
    private String            packVolume;
    /* 內件信息 */
    private List<Item>        innerInfo;
    private String            goodsValue;
    private String            remark;
    private String            currencyName;
    /* 换单日期 */
    private String            convertedDate;
    /* 是否打印过， Y/N */
    private String            printed;
    // bug fix, 因为downstreamCompanyCode被设值为company name了，为了最小改动，引入一个新的变量
    private String            downstreamCompanyCodeForPrint;
    // user的公司
    private String            userCompany;

    private Long              packSpecial;//Incoterm: DDU (0)/ DDP (1)
    private String            agencyFund;//代收金额

    /**
     * @return the userCompany
     */
    public String getUserCompany() {
        return userCompany;
    }

    /**
     * @param userCompany the userCompany to set
     */
    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
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
     * @param upstreamCompanyCode
     *            the upstreamCompanyCode to set
     */
    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    /**
     * @return the upstreamCompanyId
     */
    public String getUpstreamCompanyId() {
        return upstreamCompanyId;
    }

    /**
     * @param upstreamCompanyId
     *            the upstreamCompanyId to set
     */
    public void setUpstreamCompanyId(String upstreamCompanyId) {
        this.upstreamCompanyId = upstreamCompanyId;
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
     * @return the downstreamCompanyId
     */
    public String getDownstreamCompanyId() {
        return downstreamCompanyId;
    }

    /**
     * @param downstreamCompanyId
     *            the downstreamCompanyId to set
     */
    public void setDownstreamCompanyId(String downstreamCompanyId) {
        this.downstreamCompanyId = downstreamCompanyId;
    }

    /**
     * @return the isProblemItem
     */
    public String getIsProblemItem() {
        return isProblemItem;
    }

    /**
     * @param isProblemItem
     *            the isProblemItem to set
     */
    public void setIsProblemItem(String isProblemItem) {
        this.isProblemItem = isProblemItem;
    }

    /**
     * @return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     *            the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     *            the startDate to set
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
     * @param endDate
     *            the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * @return the senderPostcode
     */
    public String getSenderPostcode() {
        return senderPostcode;
    }

    /**
     * @param senderPostcode
     *            the senderPostcode to set
     */
    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    /**
     * @return the senderPhone
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * @param senderPhone
     *            the senderPhone to set
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
     * @param senderMobile
     *            the senderMobile to set
     */
    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    /**
     * @return the senderAddress
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * @param senderAddress
     *            the senderAddress to set
     */
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    /**
     * @return the receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName
     *            the receiverName to set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return the receiverPostcode
     */
    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    /**
     * @param receiverPostcode
     *            the receiverPostcode to set
     */
    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode;
    }

    /**
     * @return the receiverPhone
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * @param receiverPhone
     *            the receiverPhone to set
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
     * @param receiverMobile
     *            the receiverMobile to set
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * @return the receiverAddress
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * @param receiverAddress
     *            the receiverAddress to set
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * @return the packWeight
     */
    public String getPackWeight() {
        return packWeight;
    }

    /**
     * @param packWeight
     *            the packWeight to set
     */
    public void setPackWeight(String packWeight) {
        this.packWeight = packWeight;
    }

    /**
     * @return the packLength
     */
    public String getPackLength() {
        return packLength;
    }

    /**
     * @param packLength
     *            the packLength to set
     */
    public void setPackLength(String packLength) {
        this.packLength = packLength;
    }

    /**
     * @return the packWidth
     */
    public String getPackWidth() {
        return packWidth;
    }

    /**
     * @param packWidth
     *            the packWidth to set
     */
    public void setPackWidth(String packWidth) {
        this.packWidth = packWidth;
    }

    /**
     * @return the packHeight
     */
    public String getPackHeight() {
        return packHeight;
    }

    /**
     * @param packHeight
     *            the packHeight to set
     */
    public void setPackHeight(String packHeight) {
        this.packHeight = packHeight;
    }

    /**
     * @return the packVolume
     */
    public String getPackVolume() {
        return packVolume;
    }

    /**
     * @param packVolume
     *            the packVolume to set
     */
    public void setPackVolume(String packVolume) {
        this.packVolume = packVolume;
    }

    /**
     * @return the innerInfo
     */
    public List<Item> getInnerInfo() {
        return innerInfo;
    }

    /**
     * @param innerInfo the innerInfo to set
     */
    public void setInnerInfo(List<Item> innerInfo) {
        this.innerInfo = innerInfo;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the convertedDate
     */
    public String getConvertedDate() {
        return convertedDate;
    }

    /**
     * @param convertedDate
     *            the convertedDate to set
     */
    public void setConvertedDate(String convertedDate) {
        this.convertedDate = convertedDate;
    }

    /**
     * @return the printed
     */
    public String getPrinted() {
        return printed;
    }

    /**
     * @param printed
     *            the printed to set
     */
    public void setPrinted(String printed) {
        this.printed = printed;
    }

    /**
     * @return the goodsValue
     */
    public String getGoodsValue() {
        return goodsValue;
    }

    /**
     * @param goodsValue the goodsValue to set
     */
    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    /**
     * @return the currencyName
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * @param currencyName the currencyName to set
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * @return the downstreamCompanyCodeForPrint
     */
    public String getDownstreamCompanyCodeForPrint() {
        return downstreamCompanyCodeForPrint;
    }

    /**
     * @param downstreamCompanyCodeForPrint the downstreamCompanyCodeForPrint to set
     */
    public void setDownstreamCompanyCodeForPrint(String downstreamCompanyCodeForPrint) {
        this.downstreamCompanyCodeForPrint = downstreamCompanyCodeForPrint;
    }

    public Long getPackSpecial() {
        return packSpecial;
    }

    public void setPackSpecial(Long packSpecial) {
        this.packSpecial = packSpecial;
    }

    public String getAgencyFund() {
        return agencyFund;
    }

    public void setAgencyFund(String agencyFund) {
        this.agencyFund = agencyFund;
    }
}
