/*
 * 项目名: 全球大联盟
 * 文件名: WeightConversionQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.weightconversion.bean;

import java.util.List;

import com.yto.globalunion.basedata.weightconversion.entity.WeightConversion;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 *Description:重量换算模块的返回值
 *
 *@author dongdongliu
 *
 */
public class WeightConversionQueryResponseBean extends ResponseBaseBean {

    private static final long            serialVersionUID = 1L;
    private WeightConversion             weightConversion;
    private PagingBean<WeightConversion> page;
    private String                       isExist;
    private double                       conversionRate;

    private List<WeightConversion>       list;

    public PagingBean<WeightConversion> getPage() {
        return page;
    }

    public void setPage(PagingBean<WeightConversion> page) {
        this.page = page;
    }

    public WeightConversion getWeightConversion() {
        return weightConversion;
    }

    public void setWeightConversion(WeightConversion weightConversion) {
        this.weightConversion = weightConversion;
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

    /**
     * @return the list
     */
    public List<WeightConversion> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<WeightConversion> list) {
        this.list = list;
    }
}
