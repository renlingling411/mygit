/*
 * 项目名: 全球大联盟
 * 文件名: ReconciliationNotificationUpdateRequestBean.java
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

/**
 * @author dongdongwang
 *
 */
public class ReconciliationNotificationUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long          serialVersionUID = 1L;
    private String                     id;
    private ReconciliationNotification reconciliationNotification;
    private String                     langCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReconciliationNotification getReconciliationNotification() {
        return reconciliationNotification;
    }

    public void setReconciliationNotification(ReconciliationNotification reconciliationNotification) {
        this.reconciliationNotification = reconciliationNotification;
    }

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

}
