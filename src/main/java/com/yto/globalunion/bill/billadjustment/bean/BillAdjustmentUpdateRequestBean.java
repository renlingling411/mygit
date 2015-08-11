/*
 * 项目名: 全球大联盟
 * 文件名: BillAdjustmentUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.bill.billadjustment.bean;

import com.yto.globalunion.bill.billadjustment.entity.BillAdjustment;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author longwang
 *
 */
/*
 * 项目名: 全球大联盟
 * 文件名: BillAdjustmentUpdateRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
/**
 * @author longwang
 *
 */
public class BillAdjustmentUpdateRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private String            id;
    private BillAdjustment    billAdjustment;
    private String            langCode;
    private String            companyCode;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BillAdjustment getBillAdjustment() {
        return billAdjustment;
    }

    public void setBillAdjustment(BillAdjustment billAdjustment) {
        this.billAdjustment = billAdjustment;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
}
