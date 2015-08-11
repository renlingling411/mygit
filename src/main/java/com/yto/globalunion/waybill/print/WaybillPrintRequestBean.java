/*
 * 项目名: 全球大联盟
 * 文件名: WaybillPrintRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.print;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author Ying Situ
 *
 */
public class WaybillPrintRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private Long              billId;
    private String            langCode;
    private String            mailNo;
    private String            bigPen;
    private String            receiverPostCode;
    private String            receiverPostcode7Dash;
    private String            customerId;

    private Long[]            billIdList;
    private String[]          mailNoList;
    private String[]          bigPenList;
    private String[]          receiverPostCodeList;
    private String[]          receiverPostcode7DashList;
    private String[]          customerIdList;
    private String[]          receiverAddressAfterPrintList;
    private String[]          ordersIdList;
    private String[]          downOrderIdList;

    /**
     * @return the ordersIdList
     */
    public String[] getOrdersIdList() {
        return ordersIdList;
    }

    /**
     * @param ordersIdList the ordersIdList to set
     */
    public void setOrdersIdList(String[] ordersIdList) {
        this.ordersIdList = ordersIdList;
    }

    /**
     * @return the downOrderIdList
     */
    public String[] getDownOrderIdList() {
        return downOrderIdList;
    }

    /**
     * @param downOrderIdList the downOrderIdList to set
     */
    public void setDownOrderIdList(String[] downOrderIdList) {
        this.downOrderIdList = downOrderIdList;
    }

    /**
     * @return the billId
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * @param billId the billId to set
     */
    public void setBillId(Long billId) {
        this.billId = billId;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the mailNo
     */
    public String getMailNo() {
        return mailNo;
    }

    /**
     * @param mailNo the mailNo to set
     */
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    /**
     * @return the bigPen
     */
    public String getBigPen() {
        return bigPen;
    }

    /**
     * @param bigPen the bigPen to set
     */
    public void setBigPen(String bigPen) {
        this.bigPen = bigPen;
    }

    /**
     * @return the billIdList
     */
    public Long[] getBillIdList() {
        return billIdList;
    }

    /**
     * @param billIdList the billIdList to set
     */
    public void setBillIdList(Long[] billIdList) {
        this.billIdList = billIdList;
    }

    /**
     * @return the mailNoList
     */
    public String[] getMailNoList() {
        return mailNoList;
    }

    /**
     * @param mailNoList the mailNoList to set
     */
    public void setMailNoList(String[] mailNoList) {
        this.mailNoList = mailNoList;
    }

    /**
     * @return the bigPenList
     */
    public String[] getBigPenList() {
        return bigPenList;
    }

    /**
     * @param bigPenList the bigPenList to set
     */
    public void setBigPenList(String[] bigPenList) {
        this.bigPenList = bigPenList;
    }

    /**
     * @return the receiverPostCode
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * @param receiverPostCode the receiverPostCode to set
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    /**
     * @return the receiverPostcode7Dash
     */
    public String getReceiverPostcode7Dash() {
        return receiverPostcode7Dash;
    }

    /**
     * @param receiverPostcode7Dash the receiverPostcode7Dash to set
     */
    public void setReceiverPostcode7Dash(String receiverPostcode7Dash) {
        this.receiverPostcode7Dash = receiverPostcode7Dash;
    }

    /**
     * @return the receiverPostCodeList
     */
    public String[] getReceiverPostCodeList() {
        return receiverPostCodeList;
    }

    /**
     * @param receiverPostCodeList the receiverPostCodeList to set
     */
    public void setReceiverPostCodeList(String[] receiverPostCodeList) {
        this.receiverPostCodeList = receiverPostCodeList;
    }

    /**
     * @return the receiverPostcode7DashList
     */
    public String[] getReceiverPostcode7DashList() {
        return receiverPostcode7DashList;
    }

    /**
     * @param receiverPostcode7DashList the receiverPostcode7DashList to set
     */
    public void setReceiverPostcode7DashList(String[] receiverPostcode7DashList) {
        this.receiverPostcode7DashList = receiverPostcode7DashList;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerIdList
     */
    public String[] getCustomerIdList() {
        return customerIdList;
    }

    /**
     * @param customerIdList the customerIdList to set
     */
    public void setCustomerIdList(String[] customerIdList) {
        this.customerIdList = customerIdList;
    }

    /**
     * @return the receiverAddressAfterPrintList
     */
    public String[] getReceiverAddressAfterPrintList() {
        return receiverAddressAfterPrintList;
    }

    /**
     * @param receiverAddressAfterPrintList the receiverAddressAfterPrintList to set
     */
    public void setReceiverAddressAfterPrintList(String[] receiverAddressAfterPrintList) {
        this.receiverAddressAfterPrintList = receiverAddressAfterPrintList;
    }

}
