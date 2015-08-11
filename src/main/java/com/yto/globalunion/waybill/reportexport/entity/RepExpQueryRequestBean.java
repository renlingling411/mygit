/*
 * 项目名: 全球大联盟
 * 文件名: RepExpQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.reportexport.entity;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.reportexport.bean.ReportExport;

/**
 * Description 进/出港订单信息导出模块
 * @author hengchen
 *
 */
public class RepExpQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long        serialVersionUID = 1L;
    // 语言代码
    private String                   langCode;
    // 分页信息
    private PagingBean<ReportExport> page;
    // 口岸信息
    private ReportExport             reportExport;

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the page
     */
    public PagingBean<ReportExport> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<ReportExport> page) {
        this.page = page;
    }

    /**
     * @return the reportExport
     */
    public ReportExport getReportExport() {
        return reportExport;
    }

    /**
     * @param reportExport the reportExport to set
     */
    public void setReportExport(ReportExport reportExport) {
        this.reportExport = reportExport;
    }

}
