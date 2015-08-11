/*
 * 项目名: 全球大联盟
 * 文件名: Fees.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.fees.entity;

import java.io.Serializable;

/**
 * @author dongdongwang
 *
 */
public class Fees implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;                   // 费用类型主键id
    private String            feesName;             // 费用名称
    private String            feesCode;             // 费用编号
    private String            langCode;
    private Long              langCodeId;
    private String            langCodeDesc;
    private Long              feesId;
    private String            lastMofiedUserName;
    private String            lastModifiedDate;

    /**
     * @return the feesCode
     */
    public String getFeesCode() {
        return feesCode;
    }

    /**
     * @param feesCode the feesCode to set
     */
    public void setFeesCode(String feesCode) {
        this.feesCode = feesCode;
    }

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
     * @return the feesName
     */
    public String getFeesName() {
        return feesName;
    }

    /**
     * @param feesName the feesName to set
     */
    public void setFeesName(String feesName) {
        this.feesName = feesName;
    }

    /**
     * @return the feesId
     */
    public Long getFeesId() {
        return feesId;
    }

    /**
     * @param feesId the feesId to set
     */
    public void setFeesId(Long feesId) {
        this.feesId = feesId;
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
