/*
 * 项目名: 全球大联盟
 * 文件名: BillAdjustmentQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.billadjustment.bean;

import java.util.List;

import com.yto.globalunion.bill.billadjustment.entity.BillAdjustment;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author longwang
 *
 */
public class BillAdjustmentQueryResponseBean extends ResponseBaseBean {

    private static final long          serialVersionUID = 1L;
    private PagingBean<BillAdjustment> page;
    private List<BillAdjustment>       billAdjustments;

    public PagingBean<BillAdjustment> getPage() {
        return page;
    }

    public void setPage(PagingBean<BillAdjustment> page) {
        this.page = page;
    }

    public List<BillAdjustment> getBillAdjustments() {
        return billAdjustments;
    }

    public void setBillAdjustments(List<BillAdjustment> billAdjustments) {
        this.billAdjustments = billAdjustments;
    }

}
