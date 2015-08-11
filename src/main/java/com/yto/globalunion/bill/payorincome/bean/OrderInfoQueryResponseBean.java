/*
 * 项目名: 全球大联盟
 * 文件名: OrderInfoQueryResponseBean.java
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
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author zhenghaohong
 *
 */
public class OrderInfoQueryResponseBean extends ResponseBaseBean {
    private static final long     serialVersionUID = 1L;

    private PagingBean<OrderInfo> page;

    public PagingBean<OrderInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<OrderInfo> page) {
        this.page = page;
    }

}
