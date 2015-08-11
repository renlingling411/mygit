/*
 * 项目名: 全球大联盟
 * 文件名: Code.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;

/**
 * 字典表实体类
 * @author penglan
 *
 */
public class Code implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long              id;
    private String            fieldValue;
    private Long              langCodeId;
    private String            langCode;
    private String            codeType;
    private String            fieldCode;

    /**
     * @return the fieldCode
     */
    public String getFieldCode() {
        return fieldCode;
    }

    /**
     * @param fieldCode the fieldCode to set
     */
    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
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
     * @return the fieldValue
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * @param fieldValue the fieldValue to set
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
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
     * @return the codeType
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * @param codeType the codeType to set
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

}
