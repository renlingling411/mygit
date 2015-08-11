/*
 * 项目名: 全球大联盟
 * 文件名: OrderInfoExcelRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.orderimport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.User;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author hengchen
 *
 */
public class OrderInfoExcelRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;

    // 解析excel获得数据
    private List<BillInfo>    list;

    private String            langCode;

    private String[][]        excelData;

    private User              userParam;

    /**
     * @return the userParam
     */
    public User getUserParam() {
        return userParam;
    }

    /**
     * @param userParam the userParam to set
     */
    public void setUserParam(User userParam) {
        this.userParam = userParam;
    }

    /**
     * @return the excelData
     */
    public String[][] getExcelData() {
        return excelData;
    }

    /**
     * @param excelData the excelData to set
     */
    public void setExcelData(String[][] excelData) {
        this.excelData = excelData;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the list
     */
    public List<BillInfo> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BillInfo> list) {
        this.list = list;
    }

}
