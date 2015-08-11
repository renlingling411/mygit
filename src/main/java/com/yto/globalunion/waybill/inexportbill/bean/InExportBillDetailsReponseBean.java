/*
 * 项目名: 全球大联盟
 * 文件名: InExportBillDetailsReponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportbill.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.inexportbill.entity.InExportBill;
import com.yto.globalunion.waybill.inexportbill.entity.Item;

/**
 * 
 * @author bindizhang
 *
 */
public class InExportBillDetailsReponseBean extends ResponseBaseBean {

    private static final long        serialVersionUID = 1L;
    private InExportBill             inExportBill;
    private List<Item>               items;
    private PagingBean<InExportBill> page;

    public PagingBean<InExportBill> getPage() {
        return page;
    }

    public void setPage(PagingBean<InExportBill> page) {
        this.page = page;
    }

    public InExportBill getInExportBill() {
        return inExportBill;
    }

    public void setInExportBill(InExportBill inExportBill) {
        this.inExportBill = inExportBill;
    }

    /**
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
