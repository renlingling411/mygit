/*
 * 项目名: 全球大联盟
 * 文件名: BLCSearchRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.blc.bean;

import com.yto.globalunion.basedata.blc.entity.BLC;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author longwang
 *
 */
public class BLCSearchRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;
    private String            langCode;
    private BLC               blc;
    private PagingBean<BLC>   page;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public BLC getBlc() {
        return blc;
    }

    public void setBlc(BLC blc) {
        this.blc = blc;
    }

    public PagingBean<BLC> getPage() {
        return page;
    }

    public void setPage(PagingBean<BLC> page) {
        this.page = page;
    }

}
