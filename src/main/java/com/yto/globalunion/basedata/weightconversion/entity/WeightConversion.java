/*
 * 项目名: 全球大联盟
 * 文件名: LengthConversion.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.weightconversion.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.yto.globalunion.basedata.BaseEntity;

/**
 * 
 *Description:重量换算管理
 *
 *@author dongdongliu
 *
 */
public class WeightConversion extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private String            unitSymbol;
    private String            unitName;
    private double            conversionRate;
    private String            conversionRateStr;
    
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    public String getConversionRateStr() {
        return conversionRateStr;
    }

    public void setConversionRateStr(String conversionRateStr) {
        this.conversionRateStr = conversionRateStr;
    }

    
}
