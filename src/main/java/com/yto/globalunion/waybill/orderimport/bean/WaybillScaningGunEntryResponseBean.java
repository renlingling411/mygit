/*
 * 项目名: 全球大联盟
 * 文件名: WaybillScaningGunEntryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.orderimport.entity.C5EntryBill;

/**
 * @author penglan
 *
 */
public class WaybillScaningGunEntryResponseBean extends ResponseBaseBean implements INewJobResponse {

    private static final long serialVersionUID = 1L;
    private List<C5EntryBill> c5EntryBill;
    private IRequest[]        jobRequests;

    /**
     * @return the bills
     */
    public List<C5EntryBill> getBills() {
        return c5EntryBill;
    }

    /**
     * @param bills the bills to set
     */
    public void setBills(List<C5EntryBill> bills) {
        this.c5EntryBill = bills;
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

}
