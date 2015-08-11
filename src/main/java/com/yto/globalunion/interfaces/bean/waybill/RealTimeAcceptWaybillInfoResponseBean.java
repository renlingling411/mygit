/*
 * 项目名: 全球大联盟
 * 文件名: RealTimeAcceptWaybillInfoRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.waybill;

import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.ResponseBean;
import com.yto.globalunion.interfaces.entity.WaybillResponseMessage;

/**
 * @author penglan
 *
 */
public class RealTimeAcceptWaybillInfoResponseBean extends ResponseBean implements INewJobResponse {

    private static final long      serialVersionUID = 1L;
    private String                 responseMsg;
    private WaybillResponseMessage responseMessage;
    private IRequest[]             jobRequests;

    /**
     * @return the responseMsg
     */
    public String getResponseMsg() {
        return responseMsg;
    }

    /**
     * @param responseMsg the responseMsg to set
     */
    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    /**
     * @return the responseMessage
     */
    public WaybillResponseMessage getResponseMessage() {
        return responseMessage;
    }

    /**
     * @param responseMessage the responseMessage to set
     */
    public void setResponseMessage(WaybillResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * @param jobIRequests the jobIRequests to set
     */
    public void setJobRequests(IRequest[] jobRequests) {
        this.jobRequests = jobRequests;
    }

    @Override
    public IRequest[] getJobRequests() {
        return this.jobRequests;
    }

    // 异常不作处理
    @Override
    public void handleError() {
    }
}
