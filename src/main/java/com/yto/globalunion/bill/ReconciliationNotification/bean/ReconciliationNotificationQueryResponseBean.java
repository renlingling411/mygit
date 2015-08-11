/*
 * 项目名: 全球大联盟
 * 文件名: ReconciliationNotificationQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.ReconciliationNotification.bean;

import java.util.List;

import com.yto.globalunion.bill.ReconciliationNotification.entity.ReconciliationNotification;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author dongdongwang
 *
 */
public class ReconciliationNotificationQueryResponseBean extends ResponseBaseBean {

    private static final long                      serialVersionUID = 1L;
    private PagingBean<ReconciliationNotification> page;
    private List<ReconciliationNotification>       reconciliationNotificationList;
    private Long                                   langCodeId;
    private Long                                   countryId;

    public PagingBean<ReconciliationNotification> getPage() {
        return page;
    }

    public void setPage(PagingBean<ReconciliationNotification> page) {
        this.page = page;
    }

    public List<ReconciliationNotification> getReconciliationNotificationList() {
        return reconciliationNotificationList;
    }

    public void setReconciliationNotificationList(List<ReconciliationNotification> reconciliationNotificationList) {
        this.reconciliationNotificationList = reconciliationNotificationList;
    }

    public Long getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

}
