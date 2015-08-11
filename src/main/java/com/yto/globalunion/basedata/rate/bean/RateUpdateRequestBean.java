/*
 * 项目名: 全球大联盟
 * 文件名: RateAddOrUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.rate.bean;

import com.yto.globalunion.basedata.rate.entity.Rate;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * 
 * @author bindizhang
 *
 */
public class RateUpdateRequestBean extends RequestBaseBean {
    private static final long serialVersionUID = 1L;
    private String            id;
    private Rate              rate;

    /**
     * @return the Rate
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}
