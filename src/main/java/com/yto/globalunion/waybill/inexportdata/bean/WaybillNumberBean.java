/*
 * 项目名: 全球大联盟
 * 文件名: WaybillNumberListBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportdata.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.WaybillNumber;

/**
 * 
 * @author Ying Situ
 *
 */
public class WaybillNumberBean extends ResponseBaseBean {

    private static final long         serialVersionUID = 1L;
    private PagingBean<WaybillNumber> waybillNumberList;

    /**
     * @return the waybillNumberList
     */
    public PagingBean<WaybillNumber> getWaybillNumberList() {
        return waybillNumberList;
    }

    /**
     * @param waybillNumberList the waybillNumberList to set
     */
    public void setWaybillNumberList(PagingBean<WaybillNumber> waybillNumberList) {
        this.waybillNumberList = waybillNumberList;
    }

}
