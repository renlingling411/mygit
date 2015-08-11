/*
 * 项目名: 全球大联盟
 * 文件名: RealTimeAcceptShipmentsRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.shipments;

import java.util.List;

import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author penglan
 *
 */
public class RealTimeYTOAcceptShipmentsResponseBean extends ResponseBaseBean implements INewJobResponse {

    private static final long         serialVersionUID = 1L;
    private String                    seqNo;
    private String                    logisticProviderID;
    private String                    txLogisticID;
    private IRequest[]                jobRequests;
    private List<ShipmentYtoResponse> ytoResponses;

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
     * @return the ytoResponses
     */
    public List<ShipmentYtoResponse> getYtoResponses() {
        return ytoResponses;
    }

    /**
     * @param ytoResponses the ytoResponses to set
     */
    public void setYtoResponses(List<ShipmentYtoResponse> ytoResponses) {
        this.ytoResponses = ytoResponses;
    }

    // 异常不作处理
    @Override
    public void handleError() {
    }

	public String getLogisticProviderID() {
		return logisticProviderID;
	}

	public void setLogisticProviderID(String logisticProviderID) {
		this.logisticProviderID = logisticProviderID;
	}

	public String getTxLogisticID() {
		return txLogisticID;
	}

	public void setTxLogisticID(String txLogisticID) {
		this.txLogisticID = txLogisticID;
	}

}
