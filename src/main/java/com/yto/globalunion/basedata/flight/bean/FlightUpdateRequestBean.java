/*
 * 项目名: 全球大联盟
 * 文件名: FlightUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.flight.bean;

import com.yto.globalunion.basedata.flight.entity.Flight;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

public class FlightUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;
    private String            id;
    private Flight            flight;
    private String            langCode;

    /**
     * @return the id
     * */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     * */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the flight
     * */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight
     *            the flight to set
     * */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * @return the langCode
     * */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode
     *            the langCode to set
     * */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
}
