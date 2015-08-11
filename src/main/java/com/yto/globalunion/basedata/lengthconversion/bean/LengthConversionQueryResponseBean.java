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
package com.yto.globalunion.basedata.lengthconversion.bean;

import com.yto.globalunion.basedata.lengthconversion.entity.LengthConversion;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 *Description:长度换算模块的返回值
 *
 *@author dongdongliu
 *
 */
public class LengthConversionQueryResponseBean extends ResponseBaseBean {

    private static final long            serialVersionUID = 1L;
    private PagingBean<LengthConversion> page;
    private LengthConversion             lengthConversion;
    private String                       isExist;
    private double                       conversionRate;

    public PagingBean<LengthConversion> getPage() {
        return page;
    }

    public void setPage(PagingBean<LengthConversion> page) {
        this.page = page;
    }

    public LengthConversion getLengthConversion() {
        return lengthConversion;
    }

    public void setLengthConversion(LengthConversion lengthConversion) {
        this.lengthConversion = lengthConversion;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

}
