/*
 * 项目名: 全球大联盟
 * 文件名: CompanyQueryResponseBean.java
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
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 * @author siyuanfu
 *
 */
public class CompanyQueryResponseBean extends ResponseBaseBean {
    private static final long   serialVersionUID = 1L;
    private PagingBean<Company> page;
    private String              telephoneNumber;
    private String              isExist;
    private String              isStatusExist;
    private Company             company;

    public String getIsStatusExist() {
        return isStatusExist;
    }

    public void setIsStatusExist(String isStatusExist) {
        this.isStatusExist = isStatusExist;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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
