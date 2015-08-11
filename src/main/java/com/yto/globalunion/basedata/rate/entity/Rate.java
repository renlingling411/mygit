/*
 * 项目名: 全球大联盟
 * 文件名: RequestComplexBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.rate.entity;

import java.io.Serializable;

/**
 * Description : Rate 汇率管理 
 * @author bindizhang
 *
 */
public class Rate implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long              id;                   // 汇率管理主键id
    private String            currCode;             // 币种代码
    private String            rateForUsd;           // 本月对美汇率
    private String            currencyName;         // 币种名称
    private String            releaseDate;          // 发布时间
    private String            langCode;             // 语言信息
    private Long              currencyId;           // 货币id
    private String            startDate;            // 查询开始时间
    private String            endDate;              // 查询结束时间

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getRateForUsd() {
        return rateForUsd;
    }

    public void setRateForUsd(String rateForUsd) {
        this.rateForUsd = rateForUsd;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
