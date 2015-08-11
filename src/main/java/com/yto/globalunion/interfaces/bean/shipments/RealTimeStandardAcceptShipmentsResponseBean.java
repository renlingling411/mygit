/*
 * 项目名: 全球大联盟
 * 文件名: RealTimeAcceptShipmentsResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.shipments;

import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author penglan
 *
 */
public class RealTimeStandardAcceptShipmentsResponseBean extends ResponseBaseBean implements INewJobResponse {

    private static final long        serialVersionUID = 1L;
    private IRequest[]               jobRequests;
    private ShipmentStandardResponse standardResponse;

    /**
     * @return the jobRequests
     */
    @Override
    public IRequest[] getJobRequests() {
        return jobRequests;
    }

    /**
     * @param jobRequests the jobRequests to set
     */
    public void setJobRequests(IRequest[] jobRequests) {
        this.jobRequests = jobRequests;
    }

    /**
     * @return the standardResponse
     */
    public ShipmentStandardResponse getStandardResponse() {
        return standardResponse;
    }

    /**
     * @param standardResponse the standardResponse to set
     */
    public void setStandardResponse(ShipmentStandardResponse standardResponse) {
        this.standardResponse = standardResponse;
    }

    // 异常不作处理
    @Override
    public void handleError() {
    }
}
