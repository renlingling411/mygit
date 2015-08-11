/*
 * 项目名: 全球大联盟
 * 文件名: InExportData.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.inexportdata.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.waybill.inexportdata.entity.InExportExportData;

/**
 * Description:
 *
 * @author bindizhang
 *
 */
public class InExportDataExportRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long  serialVersionUID = -5768470200655065187L;
    private String             langCode;
    private InExportExportData data;

    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public InExportExportData getData() {
        return data;
    }

    public void setData(InExportExportData data) {
        this.data = data;
    }

}
