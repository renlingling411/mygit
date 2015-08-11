/*
 * 项目名: 全球大联盟
 * 文件名: ExportOrderResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.payorincome.bean;

import java.util.List;

import com.yto.globalunion.bill.payorincome.entity.OrderInfo;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author zhenghaohong
 *
 */
public class ExportOrderResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;

    private List<OrderInfo>   list;

    public List<OrderInfo> getList() {
        return list;
    }

    public void setList(List<OrderInfo> list) {
        this.list = list;
    }

}
