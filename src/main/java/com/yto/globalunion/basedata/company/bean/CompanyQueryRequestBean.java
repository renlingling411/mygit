/*
 * 项目名: 全球大联盟
 * 文件名: CompanyQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.bean;

import com.yto.globalunion.basedata.company.entity.Company;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 * @author siyuanfu
 *
 */
public class CompanyQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private PagingBean<Company> page;
    private Company             company;
    private String[][]          excelData;

    public String[][] getExcelData() {
        return excelData;
    }

    public void setExcelData(String[][] excelData) {
        this.excelData = excelData;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

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
    public PagingBean<Company> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<Company> page) {
        this.page = page;
    }

}
