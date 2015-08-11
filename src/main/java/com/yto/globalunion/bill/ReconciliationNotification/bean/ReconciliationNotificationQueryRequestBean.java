/*
 * 项目名: 全球大联盟
 * 文件名: ReconciliationNotificationQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.ReconciliationNotification.bean;

import com.yto.globalunion.bill.ReconciliationNotification.entity.ReconciliationNotification;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author dongdongwang
 *
 */
public class ReconciliationNotificationQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long                      serialVersionUID = 1L;
    private String                                 langCode;
    private Long                                   companyId;
    private PagingBean<ReconciliationNotification> page;

    public PagingBean<ReconciliationNotification> getPage() {
        return page;
    }

    public void setPage(PagingBean<ReconciliationNotification> page) {
        this.page = page;
    }

    public String getLangCode() {
        return langCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

}
