/*
 * 项目名: 全球大联盟
 * 文件名: WaybillPrintResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.print;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author Ying Situ
 *
 */
public class WaybillPrintResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private BillInfo          billInfo;
    private List<BillInfo>    billInfoList;
    private boolean           success;
    private String            errorMessage;

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
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the billInfoList
     */
    public List<BillInfo> getBillInfoList() {
        return billInfoList;
    }

    /**
     * @param billInfoList the billInfoList to set
     */
    public void setBillInfoList(List<BillInfo> billInfoList) {
        this.billInfoList = billInfoList;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
