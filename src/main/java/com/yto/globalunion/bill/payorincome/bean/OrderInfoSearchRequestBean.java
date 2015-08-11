package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.bill.payorincome.entity.OrderInfo;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

public class OrderInfoSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long     serialVersionUID = 1L;

    private String                langCode;
    private OrderInfo             orderInfo;
    private PagingBean<OrderInfo> page;
    private String                companyCode;
    private String                id;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
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

}
