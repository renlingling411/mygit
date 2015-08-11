/*
 * 项目名: 全球大联盟
 * 文件名: OrderInfoQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.bill.payorincome.entity.OrderInfo;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author zhenghaohong
 *
 */
public class OrderInfoQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long     serialVersionUID = 1L;

    private String                langCode;
    private PagingBean<OrderInfo> page;
    private String                companyCode;
    private String                id;
    private String                companyId;
    
    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public PagingBean<OrderInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<OrderInfo> page) {
        this.page = page;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    
}
