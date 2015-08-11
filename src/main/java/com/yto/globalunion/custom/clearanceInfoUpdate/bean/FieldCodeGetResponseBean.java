/*
 * 项目名: 全球大联盟
 * 文件名: FieldCodeGetResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoUpdate.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.custom.clearanceInfoUpdate.entity.FieldCode;

/**
 * @author bindizhang
 *
 */
public class FieldCodeGetResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private List<FieldCode>   fieldCodeList;

    /**
     * @return the fieldCodeList
     */
    public List<FieldCode> getFieldCodeList() {
        return fieldCodeList;
    }

    /**
     * @param fieldCodeList the fieldCodeList to set
     */
    public void setFieldCodeList(List<FieldCode> fieldCodeList) {
        this.fieldCodeList = fieldCodeList;
    }

}
