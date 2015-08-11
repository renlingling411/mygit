/*
 * 项目名: 全球大联盟
 * 文件名: Currency.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.currency.entity;

import java.io.Serializable;

public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;                   // 多语言字表主键
    private String            currencyCode;
    private String            currencyName;
    private String            langCode;
    private Long              langCodeId;
    private String            langCodeDesc;
    private Long              currencyId;
    private String            lastMofiedUserName;
    private String            lastModifiedDate;

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
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the currencyName
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * @param currencyName the currencyName to set
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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
     * @return the currencyId
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * @param currencyId the currencyId to set
     */
    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * @return the lastMofiedUserName
     */
    public String getLastMofiedUserName() {
        return lastMofiedUserName;
    }

    /**
     * @param lastMofiedUserName the lastMofiedUserName to set
     */
    public void setLastMofiedUserName(String lastMofiedUserName) {
        this.lastMofiedUserName = lastMofiedUserName;
    }

    /**
     * @return the lastModifiedDate
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
