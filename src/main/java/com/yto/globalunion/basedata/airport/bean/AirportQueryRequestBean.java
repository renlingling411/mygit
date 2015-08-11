/*
 * 项目名: 全球大联盟
 * 文件名: AirportQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.airport.bean;

import com.yto.globalunion.basedata.airport.entity.Airport;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * 
 * @author xiaotianjin
 *
 */
public class AirportQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long   serialVersionUID = 1L;
    private String              langCode;
    private PagingBean<Airport> page;

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
     * @return the page
     */
    public PagingBean<Airport> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<Airport> page) {
        this.page = page;
    }

}
