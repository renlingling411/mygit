/**
 * Project Name: common
 * File Name: XnExportDataSearchRequestBean.java
 * Class Name: XnExportDataSearchRequestBean
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.yto.globalunion.waybill.xnExport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.xnExport.XnInExportData;

/**
 * @author zhenghaohong
 *
 */
public class XnExportDataSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long          serialVersionUID = 1L;
    private String                     langCode;
    private XnInExportData             xnExportData;
    private PagingBean<XnInExportData> page;
    private List<XnInExportData>       billList;

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public XnInExportData getXnExportData() {
        return xnExportData;
    }

    public void setXnExportData(XnInExportData xnExportData) {
        this.xnExportData = xnExportData;
    }

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
