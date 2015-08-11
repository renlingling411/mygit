/**
 * Project Name: common
 * File Name: XnExportDataQueryResponseBean.java
 * Class Name: XnExportDataQueryResponseBean
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.yto.globalunion.waybill.xnExport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.xnExport.XnInExportData;

/**
 * @author zhenghaohong
 *
 */
public class XnExportDataQueryResponseBean extends ResponseBaseBean {

    private static final long          serialVersionUID = 1L;
    private PagingBean<XnInExportData> page;
    private List<XnInExportData>       billList;

    public PagingBean<XnInExportData> getPage() {
        return page;
    }

    public void setPage(PagingBean<XnInExportData> page) {
        this.page = page;
    }

    public List<XnInExportData> getBillList() {
        return billList;
    }

    public void setBillList(List<XnInExportData> billList) {
        this.billList = billList;
    }

}
