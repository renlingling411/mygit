/*
 * 项目名: 全球大联盟
 * 文件名: Expressstatus.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.expressstatus.entity;

import java.io.Serializable;

/**
 * @author longwang
 *
 */
public class ExpressStatus implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long              id;
    private String            expressStatusCode;
    private Long              expressStatusLanguage;
    private Long              expressStatusId;
    private String            expressStatusDescription;
    private String            langCode;
    private String            langcodeDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpressStatusCode() {
        return expressStatusCode;
    }

    public void setExpressStatusCode(String expressStatusCode) {
        this.expressStatusCode = expressStatusCode;
    }

    public Long getExpressStatusLanguage() {
        return expressStatusLanguage;
    }

    public void setExpressStatusLanguage(Long expressStatusLanguage) {
        this.expressStatusLanguage = expressStatusLanguage;
    }

    public Long getExpressStatusId() {
        return expressStatusId;
    }

    public void setExpressStatusId(Long expressStatusId) {
        this.expressStatusId = expressStatusId;
    }

    public String getExpressStatusDescription() {
        return expressStatusDescription;
    }

    public void setExpressStatusDescription(String expressStatusDescription) {
        this.expressStatusDescription = expressStatusDescription;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getLangcodeDesc() {
        return langcodeDesc;
    }

    public void setLangcodeDesc(String langcodeDesc) {
        this.langcodeDesc = langcodeDesc;
    }

}
