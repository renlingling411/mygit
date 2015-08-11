/*
 * 项目名: 全球大联盟
 * 文件名: InExportDataQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportdata.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.inexportdata.entity.InExportData;

/**
 * 
 * @author bindizhang
 *
 */
public class InExportDataQueryResponseBean extends ResponseBaseBean {

    private static final long        serialVersionUID = 1L;
    private PagingBean<InExportData> page;
    private List<InExportData>       billList;

    /**
     * @return the billList
     */
    public List<InExportData> getBillList() {
        return billList;
    }

    /**
     * @param billList
     *            the billList to set
     */
    public void setBillList(List<InExportData> billList) {
        this.billList = billList;
    }

    public PagingBean<InExportData> getPage() {
        return page;
    }

    public void setPage(PagingBean<InExportData> page) {
        this.page = page;
    }
}
