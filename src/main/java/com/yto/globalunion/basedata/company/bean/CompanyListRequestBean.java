/*
 * 项目名: 全球大联盟
 * 文件名: CompanyListRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.company.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author siyuanfu
 *
 */
public class CompanyListRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private String            langCode;
    private Long              userId;
    private String            companyCode;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

}
