/*
 * 项目名: 全球大联盟
 * 文件名: Region.java
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
import java.util.Date;
import java.util.List;

import com.yto.globalunion.basedata.address.entity.Address;

/**
 * @author zhenghaohong
 *
 */
public class Region implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long              id;                   // 主键
    private String            regionNum;            // 区域编号
    private Long              companyType;          // 公司类型
    private Long              companyName;          // 公司名称
    private Long              regionType;           // 区域类型
    private String            regionName;           // 区域名称

    private Long              regionDimension;      // 区域维度
    private String            list;                 // 区域包含的城市或国家(前端传到后台)
    private Long              parentId;             // 区域包含城市表的外键
    private Long              selectCountry;        // 区域选中的国家名称

    private Date              createDate;           // 区域的创建时间

    private List<Address>     cityList;             // 区域包含的城市或国家(后台传到前端)
    private String            addressNo;            // 区域选中国家的地区编号
    
    private String            langCodeId;           //导入需要语言支撑

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(String regionNum) {
        this.regionNum = regionNum;
    }

    public Long getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Long companyType) {
        this.companyType = companyType;
    }

    public Long getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Long companyName) {
        this.companyName = companyName;
    }

    public Long getRegionType() {
        return regionType;
    }

    public void setRegionType(Long regionType) {
        this.regionType = regionType;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Long getRegionDimension() {
        return regionDimension;
    }

    public void setRegionDimension(Long regionDimension) {
        this.regionDimension = regionDimension;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(Long selectCountry) {
        this.selectCountry = selectCountry;
    }

    public List<Address> getCityList() {
        return cityList;
    }

    public void setCityList(List<Address> cityList) {
        this.cityList = cityList;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    public String getLangCodeId() {
        return langCodeId;
    }

    public void setLangCodeId(String langCodeId) {
        this.langCodeId = langCodeId;
    }
    
    

}
