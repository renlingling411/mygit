package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.bill.payorincome.entity.OrderInfo;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

public class OrderInfoSearchResponseBean extends ResponseBaseBean {
    private static final long     serialVersionUID = 1L;

    private PagingBean<OrderInfo> page;

    public PagingBean<OrderInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<OrderInfo> page) {
        this.page = page;
    }

}
