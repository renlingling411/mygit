/*
 * 项目名: 全球大联盟
 * 文件名: LengthConversionQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.destPoint.bean;

import com.yto.globalunion.basedata.destPoint.entity.DestPoint;
import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 *
 *Description:全网网点模块的请求参数
 *
 *@author dongdongliu
 *
 */
public class DestPointQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long     serialVersionUID = 1L;
    private String                id;
    private String                ids;
    private DestPoint             destPoint;
    private String                langCode;
    private String[][]        excelData;
    private PagingBean<DestPoint> page;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public DestPoint getDestPoint() {
        return destPoint;
    }

    public void setDestPoint(DestPoint destPoint) {
        this.destPoint = destPoint;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public PagingBean<DestPoint> getPage() {
        return page;
    }

    public void setPage(PagingBean<DestPoint> page) {
        this.page = page;
    }

    public String[][] getExcelData() {
        return excelData;
    }

    public void setExcelData(String[][] excelData) {
        this.excelData = excelData;
    }

}
