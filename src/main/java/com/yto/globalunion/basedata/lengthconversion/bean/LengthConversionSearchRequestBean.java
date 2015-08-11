/*
 * 项目名: 全球大联盟
 * 文件名: LengthConversionSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.lengthconversion.bean;

import com.yto.globalunion.basedata.lengthconversion.entity.LengthConversion;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 *
 *Description:长度换算模块的请求参数
 *
 *@author dongdongliu
 *
 */
public class LengthConversionSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long            serialVersionUID = 1L;
    private String                       id;
    private String                       ids;
    private String                       langCode;
    private LengthConversion             lengthConversion;
    private PagingBean<LengthConversion> page;

    public PagingBean<LengthConversion> getPage() {
        return page;
    }

    public void setPage(final PagingBean<LengthConversion> page) {
        this.page = page;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public LengthConversion getLengthConversion() {
        return lengthConversion;
    }

    public void setLengthConversion(final LengthConversion lengthConversion) {
        this.lengthConversion = lengthConversion;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(final String ids) {
        this.ids = ids;
    }

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(final String mainLangCode) {
        this.langCode = mainLangCode;
    }

}
