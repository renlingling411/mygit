/*
 * 项目名: 全球大联盟
 * 文件名: updateOrderRequestBean.java
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
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author zhenghaohong
 *
 */
public class UpdateOrderRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;

    private String            orderId;
    private String            id;
    private OrderInfo         orderInfo;
    private String            companyCode;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

}
