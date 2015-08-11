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
 * Description:
 *
 * @author bindizhang
 *
 */
public class InExportExportData implements Serializable {

    private static final long serialVersionUID = -5369345984450631630L;
    // request信息
    private String            upstreamCompany;
    private String            downstreamCompany;
    private String            upstreamCompanyOrderId;
    private String            downstreamCompanyOrderId;
    private String            startDate;
    private String            endDate;

    // user的公司
    private String            userCompany;
    /* 寄件人信息 */
    private String            senderName;
    private String            senderPostcode;
    private String            senderMobile;
    private String            senderPhone;
    private String            senderCountry;
    private String            senderProvince;
    private String            senderCity;
    private String            senderDistrict;
    private String            senderAddress;
    private String            senderAddressTranslate;
    private String            senderAllAddressTranslate;

    /* 收件人信息 */
    private String            receiverName;
    private String            receiverPostcode;
    private String            receiverPhone;
    private String            receiverMobile;
    private String            receiverCountry;
    private String            receiverProvince;
    private String            receiverCity;
    private String            receiverDistrict;
    private String            receiverAddress;
    private String            receiverAddressTranslate;
    private String            receiverAllAddressTranslate;

    private String            packWeight;
    private String            innerNum;
    private String            comment;

    /**
     * @return the senderAllAddressTranslate
     */
    public String getSenderAllAddressTranslate() {
        return senderAllAddressTranslate;
    }

    /**
     * @param senderAllAddressTranslate the senderAllAddressTranslate to set
     */
    public void setSenderAllAddressTranslate(String senderAllAddressTranslate) {
        this.senderAllAddressTranslate = senderAllAddressTranslate;
    }

    /**
     * @return the receiverAllAddressTranslate
     */
    public String getReceiverAllAddressTranslate() {
        return receiverAllAddressTranslate;
    }

    /**
     * @param receiverAllAddressTranslate the receiverAllAddressTranslate to set
     */
    public void setReceiverAllAddressTranslate(String receiverAllAddressTranslate) {
        this.receiverAllAddressTranslate = receiverAllAddressTranslate;
    }

    /**
     * @return the receiverCountry
     */
    public String getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * @param receiverCountry the receiverCountry to set
     */
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    /**
     * @return the receiverProvince
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * @param receiverProvince the receiverProvince to set
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    /**
     * @return the receiverCity
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * @param receiverCity the receiverCity to set
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * @return the receiverDistrict
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * @param receiverDistrict the receiverDistrict to set
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    /**
     * @return the senderCountry
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * @param senderCountry the senderCountry to set
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /**
     * @return the senderProvince
     */
    public String getSenderProvince() {
        return senderProvince;
    }

    /**
     * @param senderProvince the senderProvince to set
     */
    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    /**
     * @return the senderCity
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * @param senderCity the senderCity to set
     */
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    /**
     * @return the senderDistrict
     */
    public String getSenderDistrict() {
        return senderDistrict;
    }

    /**
     * @param senderDistrict the senderDistrict to set
     */
    public void setSenderDistrict(String senderDistrict) {
        this.senderDistrict = senderDistrict;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
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

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddressTranslate() {
        return senderAddressTranslate;
    }

    public void setSenderAddressTranslate(String senderAddressTranslate) {
        this.senderAddressTranslate = senderAddressTranslate;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddressTranslate() {
        return receiverAddressTranslate;
    }

    public void setReceiverAddressTranslate(String receiverAddressTranslate) {
        this.receiverAddressTranslate = receiverAddressTranslate;
    }

    public String getPackWeight() {
        return packWeight;
    }

    public void setPackWeight(String packWeight) {
        this.packWeight = packWeight;
    }

    public String getInnerNum() {
        return innerNum;
    }

    public void setInnerNum(String innerNum) {
        this.innerNum = innerNum;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

}
