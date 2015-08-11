/*
 * 项目名: 全球大联盟
 * 文件名: DhlPrintResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author hengchen
 *
 */
public class DhlPrintResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    private BillInfo          billInfo;
    private Boolean           isSuccess;
    private String            messages;

    /**
     * @return the billInfo
     */
    public BillInfo getBillInfo() {
        return billInfo;
    }

    /**
     * @param billInfo the billInfo to set
     */
    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }

    /**
     * @return the isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * @param isSuccess the isSuccess to set
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(String messages) {
        this.messages = messages;
    }

}
