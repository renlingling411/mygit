/*
 * 项目名: 全球大联盟
 * 文件名: CodeRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

/**
 * 字典表请求Bean
 * @author penglan
 *
 */
public class CodeRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;

    private CodeType          codeType;
    private String            langCode;

    /**
     * @return the codeType
     */
    public CodeType getCodeType() {
        return codeType;
    }

    /**
     * @param codeType the codeType to set
     */
    public void setCodeType(CodeType codeType) {
        this.codeType = codeType;
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

}
