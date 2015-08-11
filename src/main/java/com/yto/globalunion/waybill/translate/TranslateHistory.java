/*
 * 项目名: 全球大联盟
 * 文件名: TranslateHistory.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.translate;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class TranslateHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            destCountryCode;
    private String            country;
    private String            province;
    private String            city;
    private String            district;
    private String            address;
    private String            countryTranslate;
    private String            provinceTranslate;
    private String            cityTranslate;
    private String            districtTranslate;
    private String            addressTranslate;
    private String            allInfoTranslate;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the destCountryCode
     */
    public String getDestCountryCode() {
        return destCountryCode;
    }

    /**
     * @param destCountryCode the destCountryCode to set
     */
    public void setDestCountryCode(String destCountryCode) {
        this.destCountryCode = destCountryCode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the countryTranslate
     */
    public String getCountryTranslate() {
        return countryTranslate;
    }

    /**
     * @param countryTranslate the countryTranslate to set
     */
    public void setCountryTranslate(String countryTranslate) {
        this.countryTranslate = countryTranslate;
    }

    /**
     * @return the provinceTranslate
     */
    public String getProvinceTranslate() {
        return provinceTranslate;
    }

    /**
     * @param provinceTranslate the provinceTranslate to set
     */
    public void setProvinceTranslate(String provinceTranslate) {
        this.provinceTranslate = provinceTranslate;
    }

    /**
     * @return the cityTranslate
     */
    public String getCityTranslate() {
        return cityTranslate;
    }

    /**
     * @param cityTranslate the cityTranslate to set
     */
    public void setCityTranslate(String cityTranslate) {
        this.cityTranslate = cityTranslate;
    }

    /**
     * @return the districtTranslate
     */
    public String getDistrictTranslate() {
        return districtTranslate;
    }

    /**
     * @param districtTranslate the districtTranslate to set
     */
    public void setDistrictTranslate(String districtTranslate) {
        this.districtTranslate = districtTranslate;
    }

    /**
     * @return the addressTranslate
     */
    public String getAddressTranslate() {
        return addressTranslate;
    }

    /**
     * @param addressTranslate the addressTranslate to set
     */
    public void setAddressTranslate(String addressTranslate) {
        this.addressTranslate = addressTranslate;
    }

    /**
     * @return the allInfoTranslate
     */
    public String getAllInfoTranslate() {
        return allInfoTranslate;
    }

    /**
     * @param allInfoTranslate the allInfoTranslate to set
     */
    public void setAllInfoTranslate(String allInfoTranslate) {
        this.allInfoTranslate = allInfoTranslate;
    }

}
