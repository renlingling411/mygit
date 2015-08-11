/*
 * 项目名: 全球大联盟
 * 文件名: RegionClearingFeeSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.regionclearingfee.bean;

import java.util.List;

import com.yto.globalunion.basedata.company.entity.Company;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.globalprice.region.entity.Region;
import com.yto.globalunion.globalprice.regionclearingfee.entity.RegionClearingFee;

/**
 * @author dongdongwang
 *
 */
public class RegionClearingFeeSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long             serialVersionUID = 1L;
    private String                        langCode;
    private RegionClearingFee             regionClearingFee;
    private PagingBean<RegionClearingFee> page;
    private Company                       company;
    private List<Region>                  list;

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the page
     */
    public PagingBean<RegionClearingFee> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<RegionClearingFee> page) {
        this.page = page;
    }

    public RegionClearingFee getRegionClearingFee() {
        return regionClearingFee;
    }

    public void setRegionClearingFee(RegionClearingFee regionClearingFee) {
        this.regionClearingFee = regionClearingFee;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Region> getList() {
        return list;
    }

    public void setList(List<Region> list) {
        this.list = list;
    }

}
