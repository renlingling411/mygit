/*
 * 项目名: 全球大联盟
 * 文件名: CodeLang.java
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

public class Language implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long              id;
    private String            langCode;
    private String            langDesc;
    private Integer           langOrder;

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
     * @return the langDesc
     */
    public String getLangDesc() {
        return langDesc;
    }

    /**
     * @param langDesc the langDesc to set
     */
    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    /**
     * @return the langOrder
     */
    public Integer getLangOrder() {
        return langOrder;
    }

    /**
     * @param langOrder the langOrder to set
     */
    public void setLangOrder(Integer langOrder) {
        this.langOrder = langOrder;
    }

}
