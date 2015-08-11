/*
  * 项目名: 全球大联盟
 * 文件名: OrderInfoUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.waybill.orderimport.entity.OrderInfoDetail;

/**
 * @author zhong yi
 *
 *
 */
public class OrderInfoImportUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long   serialVersionUID = 1L;
    // 序列id
    private String              id;
    // 语言代码
    private String              langCode;
    // 运单信息
    private OrderInfoDetail     orderInfo;

    /**
     * 
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param langCode
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
    
    /**
     * 
     * @return langCode
     */
    public String getLangCode() {
        return langCode;
    }
    /**
     * 
     * @return orderInfo
     */
    public OrderInfoDetail getOrderInfo() {
        return orderInfo;
    }
    /**
     * 
     * @param orderInfo
     */
    public void setOrderInfo(OrderInfoDetail orderInfo) {
        this.orderInfo = orderInfo;
    }

}
