/*
 * 项目名: 全球大联盟
 * 文件名: WaybillResponseOrder.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.entity;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class WaybillResponseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            ClientID;             // vip客户标识(客户编号)
    private String            LogisticProviderID;   // LogisticProviderID
    private String            OrderID;              // 上游公司运单号
    private String            ResultFlag;
    private String            ErrCode;
    private String            ErrMsg;

    /**
     * @return the clientID
     */
    public String getClientID() {
        return ClientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    /**
     * @return the logisticProviderID
     */
    public String getLogisticProviderID() {
        return LogisticProviderID;
    }

    /**
     * @param logisticProviderID the logisticProviderID to set
     */
    public void setLogisticProviderID(String logisticProviderID) {
        LogisticProviderID = logisticProviderID;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    /**
     * @return the resultFlag
     */
    public String getResultFlag() {
        return ResultFlag;
    }

    /**
     * @param resultFlag the resultFlag to set
     */
    public void setResultFlag(String resultFlag) {
        ResultFlag = resultFlag;
    }

    /**
     * @return the errCode
     */
    public String getErrCode() {
        return ErrCode;
    }

    /**
     * @param errCode the errCode to set
     */
    public void setErrCode(String errCode) {
        ErrCode = errCode;
    }

    /**
     * @return the errMsg
     */
    public String getErrMsg() {
        return ErrMsg;
    }

    /**
     * @param errMsg the errMsg to set
     */
    public void setErrMsg(String errMsg) {
        ErrMsg = errMsg;
    }

}
