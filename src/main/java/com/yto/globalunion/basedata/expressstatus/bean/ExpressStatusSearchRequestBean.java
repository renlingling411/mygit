/*
 * 项目名: 全球大联盟
 * 文件名: ExpressstatusSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.expressstatus.bean;

import com.yto.globalunion.basedata.expressstatus.entity.ExpressStatus;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author longwang
 *
 */
public class ExpressStatusSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long         serialVersionUID = 1L;
    private String                    langCode;
    private ExpressStatus             expressstatus;
    private PagingBean<ExpressStatus> page;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public ExpressStatus getExpressstatus() {
        return expressstatus;
    }

    public void setExpressstatus(ExpressStatus expressstatus) {
        this.expressstatus = expressstatus;
    }

    public PagingBean<ExpressStatus> getPage() {
        return page;
    }

    public void setPage(PagingBean<ExpressStatus> page) {
        this.page = page;
    }

}
