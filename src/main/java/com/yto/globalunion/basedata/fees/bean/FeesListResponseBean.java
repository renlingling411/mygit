/*
 * 项目名: 全球大联盟
 * 文件名: FeesListResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.fees.bean;

import java.util.List;

import com.yto.globalunion.basedata.fees.entity.Fees;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author dongdongwang
 *
 */
public class FeesListResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;

    private List<Fees>        list;

    /**
     * @return the list
     */
    public List<Fees> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Fees> list) {
        this.list = list;
    }
}
