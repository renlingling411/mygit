/*
 * 项目名: 全球大联盟
 * 文件名: OrderInfoExcelResponseBean.java
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

import com.yto.globalunion.common.bean.ErrorDetailBean;
import com.yto.globalunion.common.bean.ExcelImportResponseBean;
import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author hengchen
 *
 */
public class OrderInfoExcelResponseBean extends ExcelImportResponseBean implements INewJobResponse {

    private static final long     serialVersionUID = 1L;

    private List<BillInfo>        list;

    private List<ErrorDetailBean> errorDetailBeans;

    private IRequest[]            jobRequests;

    /**
     * @return the list
     */
    public List<BillInfo> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BillInfo> list) {
        this.list = list;
    }

    /**
     * @return the errorDetailBeans
     */
    public List<ErrorDetailBean> getErrorDetailBeans() {
        return errorDetailBeans;
    }

    /**
     * @param errorDetailBeans the errorDetailBeans to set
     */
    public void setErrorDetailBeans(List<ErrorDetailBean> errorDetailBeans) {
        this.errorDetailBeans = errorDetailBeans;
    }

    @Override
    public void handleError() {
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
