/*
 * 项目名: 全球大联盟
 * 文件名: RegionFrontShow.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.globalprice.region.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhenghaohong
 *
 */
public class RegionFrontShow implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long              id;                   // 区域主键
    private String            regionNum;            // 区域编号
    private String            companyType;          // 公司类型
    private String            companyName;          // 公司名称
    private String            regionType;           // 区域类型
    private String            regionName;           // 区域名称

    private List<String>      cityList;             // 区域包含的城市名称
    private String            regionDimension;      // 区域维度
    private String            selectCountry;        // 区域选中的国家名称
    private String            regionDimensionCode;  // 区域维度code

    public String getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(String regionNum) {
        this.regionNum = regionNum;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public String getRegionDimension() {
        return regionDimension;
    }

    public void setRegionDimension(String regionDimension) {
        this.regionDimension = regionDimension;
    }

    public String getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(String selectCountry) {
        this.selectCountry = selectCountry;
    }

    public String getRegionDimensionCode() {
        return regionDimensionCode;
    }

    public void setRegionDimensionCode(String regionDimensionCode) {
        this.regionDimensionCode = regionDimensionCode;
    }

    
}
