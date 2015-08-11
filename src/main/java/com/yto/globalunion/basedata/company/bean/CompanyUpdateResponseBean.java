/*
 * 项目名: 全球大联盟
 * 文件名: CompanyUpdateResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.bean;

import java.util.ArrayList;
import java.util.List;

import com.yto.globalunion.basedata.company.entity.Company;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author siyuanfu
 *
 */
public class CompanyUpdateResponseBean extends ResponseBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;

    private Company           company;
    private String langCode;
    private List<String>      companyNumbers = new ArrayList<String>();;

    public List<String> getCompanyNumbers() {
        return companyNumbers;
    }

    public void setCompanyNumbers(List<String> companyNumbers) {
        this.companyNumbers = companyNumbers;
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
    
    

}
