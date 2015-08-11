/*
 * 项目名: 全球大联盟
 * 文件名: WaybillRealTimeResponse.java
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
import java.util.ArrayList;
import java.util.List;

/**
 * @author penglan
 *
 */
public class WaybillResponseMessage implements Serializable {
    private static final long          serialVersionUID = 1L;
    private String                     seqNo;
    private String                     sendTimeStamp;
    private List<WaybillResponseOrder> responseOrders   = new ArrayList<>();
    private boolean                    needInit         = true;

    /**
     * @return the seqNo
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * @return the sendTimeStamp
     */
    public String getSendTimeStamp() {
        return sendTimeStamp;
    }

    /**
     * @param sendTimeStamp the sendTimeStamp to set
     */
    public void setSendTimeStamp(String sendTimeStamp) {
        this.sendTimeStamp = sendTimeStamp;
    }

    /**
     * @return the responseOrders
     */
    public List<WaybillResponseOrder> getResponseOrders() {
        return responseOrders;
    }

    /**
     * @param responseOrders the responseOrders to set
     */
    public void setResponseOrders(List<WaybillResponseOrder> responseOrders) {
        this.responseOrders = responseOrders;
    }

    /**
     * @return the needInit
     */
    public boolean isNeedInit() {
        return needInit;
    }

    /**
     * @param needInit the needInit to set
     */
    public void setNeedInit(boolean needInit) {
        this.needInit = needInit;
    }

}
