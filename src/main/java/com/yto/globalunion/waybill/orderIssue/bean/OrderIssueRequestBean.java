/*
 * 项目名: 全球大联盟
 * 文件名: OrderIssueRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderIssue.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.waybill.orderIssue.entity.OrderIssue;

/**
 * @author hengchen
 *
 */
public class OrderIssueRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private Long              nextIssueId;
    private OrderIssue        orderIssue;

    /**
     * @return the nextIssueId
     */
    public Long getNextIssueId() {
        return nextIssueId;
    }

    /**
     * @param nextIssueId the nextIssueId to set
     */
    public void setNextIssueId(Long nextIssueId) {
        this.nextIssueId = nextIssueId;
    }

    /**
     * @return the orderIssue
     */
    public OrderIssue getOrderIssue() {
        return orderIssue;
    }

    /**
     * @param orderIssue the orderIssue to set
     */
    public void setOrderIssue(OrderIssue orderIssue) {
        this.orderIssue = orderIssue;
    }

}
