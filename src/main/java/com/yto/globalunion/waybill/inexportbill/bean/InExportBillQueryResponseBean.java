/*
 * 项目名: 全球大联盟
 * 文件名: InExportBillQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportbill.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.inexportbill.entity.InExportBill;

/**
 * 
 * @author bindizhang
 *
 */
public class InExportBillQueryResponseBean extends ResponseBaseBean {
    private static final long        serialVersionUID = 1L;
    private PagingBean<InExportBill> page;

    public PagingBean<InExportBill> getPage() {
        return page;
    }

    public void setPage(PagingBean<InExportBill> page) {
        this.page = page;
    }

}
