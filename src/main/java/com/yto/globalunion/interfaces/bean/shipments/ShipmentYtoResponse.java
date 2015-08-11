/*
 * 项目名: 全球大联盟
 * 文件名: YtoResponse.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.shipments;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class ShipmentYtoResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            logisticProviderID;
    private String            txLogisticID;
    private boolean           success;
    private String            reason;

    /**
     * @return the logisticProviderID
     */
    public String getLogisticProviderID() {
        return logisticProviderID;
    }

    /**
     * @param logisticProviderID the logisticProviderID to set
     */
    public void setLogisticProviderID(String logisticProviderID) {
        this.logisticProviderID = logisticProviderID;
    }

    /**
     * @return the txLogisticID
     */
    public String getTxLogisticID() {
        return txLogisticID;
    }

    /**
     * @param txLogisticID the txLogisticID to set
     */
    public void setTxLogisticID(String txLogisticID) {
        this.txLogisticID = txLogisticID;
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
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

}
