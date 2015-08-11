/*
 * 项目名: 全球大联盟
 * 文件名: HSCodeListResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.hscode.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.custom.hscode.entity.HSCode;

/**
 *
 * @author xiaotianjin
 *
 */
public class HSCodeListResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;

    private List<HSCode>      hsCodelist;

    public List<HSCode> getHSCodelist() {
        return hsCodelist;
    }

    public void setHSCodelist(List<HSCode> airportlist) {
        this.hsCodelist = airportlist;
    }
}
