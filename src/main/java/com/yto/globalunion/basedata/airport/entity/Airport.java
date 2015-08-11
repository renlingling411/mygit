/*
 * 项目名: 全球大联盟
 * 文件名: Airport.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.airport.entity;

import java.io.Serializable;

/**
 * 机场管理
 * @author xiaotianjin
 *
 */
public class Airport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long              id;
    private String            countryCode;          // 国家二字代码
    private String            iataCode;             // 三字代码
    private String            icaoCode;             // 四字代码
    private String            city;                 // 城市名称
    private String            airportName;          // 机场名称
    private Long              airportId;            // 主表ID
    private Long              langCodeId;           // 语言ID
    private String            langCode;             // 语言编码
    private String            langCodeDesc;         // 语言
    private String            createDate;           // 创建时间
    private Integer           createUser;           // 创建人
    private Integer           modifyUser;           // 最后修改人
    private String            modifyDate;           // 最后修改时间

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
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the iataCode
     */
    public String getIataCode() {
        return iataCode;
    }

    /**
     * @param iataCode the iataCode to set
     */
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    /**
     * @return the icaoCode
     */
    public String getIcaoCode() {
        return icaoCode;
    }

    /**
     * @param icaoCode the icaoCode to set
     */
    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
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
     * @return the airportName
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * @param airportName the airportName to set
     */
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    /**
     * @return the airportId
     */
    public Long getAirportId() {
        return airportId;
    }

    /**
     * @param airportId the airportId to set
     */
    public void setAirportId(Long airportId) {
        this.airportId = airportId;
    }

    /**
     * @return the langCodeId
     */
    public Long getLangCodeId() {
        return langCodeId;
    }

    /**
     * @param langCodeId the langCodeId to set
     */
    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the langCodeDesc
     */
    public String getLangCodeDesc() {
        return langCodeDesc;
    }

    /**
     * @param langCodeDesc the langCodeDesc to set
     */
    public void setLangCodeDesc(String langCodeDesc) {
        this.langCodeDesc = langCodeDesc;
    }

    /**
     * @return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the createUser
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the modifyUser
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * @param modifyUser the modifyUser to set
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * @return the modifyDate
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate the modifyDate to set
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }
}
