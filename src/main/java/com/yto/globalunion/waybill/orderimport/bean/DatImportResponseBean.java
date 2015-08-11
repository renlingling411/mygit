/**
 * Project Name: common
 * File Name: DatImportResponseBean.java
 * Class Name: DatImportResponseBean
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.yto.globalunion.waybill.orderimport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ErrorDetailBean;
import com.yto.globalunion.common.bean.ExcelImportResponseBean;
import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author zhenghaohong
 *
 */
public class DatImportResponseBean extends ExcelImportResponseBean implements INewJobResponse {

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
