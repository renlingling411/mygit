/*
 * 项目名: 全球大联盟
 * 文件名: HSCodeSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.hscode.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.custom.hscode.entity.HSCode;

/**
 *
 * @author xiaotianjin
 *
 */
public class HSCodeSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long  serialVersionUID = 1L;
    private String             langCode;
    private HSCode             hsCode;
    private PagingBean<HSCode> page;

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the hsCode
     */
    public HSCode getHsCode() {
        return hsCode.clone();
    }

    /**
     * @param hsCode the hsCode to set
     */
    public void setHsCode(HSCode hsCode) {
        this.hsCode = hsCode;
    }

    /**
     * @return the page
     */
    public PagingBean<HSCode> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<HSCode> page) {
        this.page = page;
    }
}
