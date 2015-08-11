/**
 * Project Name: common
 * File Name: DatImportRequestBean.java
 * Class Name: DatImportRequestBean
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.yto.globalunion.waybill.orderimport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.User;
import com.yto.globalunion.waybill.BillInfo;

/**
 * @author zhenghaohong
 *
 */
public class DatImportRequestBean extends RequestBaseBean implements IMultiLanguageable {
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
