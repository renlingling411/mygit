/*
 * 项目名: 全球大联盟
 * 文件名: PortExcelRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.port.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author hengchen
 *
 */
public class PortExcelRequestBean extends RequestBaseBean {
    private static final long serialVersionUID = 1L;

    // 解析excel获得数据
    private String[][]        excelData;

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

}
