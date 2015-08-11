/*
 * 项目名: 全球大联盟
 * 文件名: MonitorShipmentsQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.monitorShipments.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author tingtingwu
 *
 */
public class MonitorShipmentsQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private String            langCode;
    private String            upOrderId;
    private String            downOrderId;

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
     * @return the upOrderId
     */
    public String getUpOrderId() {
        return upOrderId;
    }

    /**
     * @param upOrderId the upOrderId to set
     */
    public void setUpOrderId(String upOrderId) {
        this.upOrderId = upOrderId;
    }

    /**
     * @return the downOrderId
     */
    public String getDownOrderId() {
        return downOrderId;
    }

    /**
     * @param downOrderId the downOrderId to set
     */
    public void setDownOrderId(String downOrderId) {
        this.downOrderId = downOrderId;
    }
}
