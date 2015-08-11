/*
 * 项目名: 全球大联盟
 * 文件名: BLCCompanyMapping.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.blc.entity;

import java.io.Serializable;

/**
 * @author dongdongliu
 *清关/报关的公司映射关系（用于判断哪些运单或者走件信息需要推送给海关）
 */
public class BLCCompanyMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upCompanyCode;        // 上游公司编号
    private String            downCompanyCode;      // 下游公司编号
    private String            blcCode;              // 海关编号

    public String getUpCompanyCode() {
        return upCompanyCode;
    }

    public void setUpCompanyCode(String upCompanyCode) {
        this.upCompanyCode = upCompanyCode;
    }

    public String getDownCompanyCode() {
        return downCompanyCode;
    }

    public void setDownCompanyCode(String downCompanyCode) {
        this.downCompanyCode = downCompanyCode;
    }

    public String getBlcCode() {
        return blcCode;
    }

    public void setBlcCode(String blcCode) {
        this.blcCode = blcCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
