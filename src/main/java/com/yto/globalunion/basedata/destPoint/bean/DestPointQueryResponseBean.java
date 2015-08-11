/*
 * 项目名: 全球大联盟
 * 文件名: LengthConversionQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.destPoint.bean;

import com.yto.globalunion.basedata.destPoint.entity.DestPoint;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 *Description:全网网点模块的返回值
 *
 *@author dongdongliu
 *
 */
public class DestPointQueryResponseBean extends ResponseBaseBean {

    private static final long            serialVersionUID = 1L;
    private PagingBean<DestPoint> page;
    private DestPoint                    destPoint;

    public PagingBean<DestPoint> getPage() {
        return page;
    }

    public void setPage(PagingBean<DestPoint> page) {
        this.page = page;
    }

    public DestPoint getDestPoint() {
        return destPoint;
    }

    public void setDestPoint(DestPoint destPoint) {
        this.destPoint = destPoint;
    }

}
