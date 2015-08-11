/*
 * 项目名: 全球大联盟
 * 文件名: DestPoint.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.destPoint.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.BaseEntity;

/**
 * @author dongdongliu
 * 全网网点
 */
public class DestPoint extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;
    private String item;
    private String destPointInChinese;
    private String destPointInEnglish;
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getDestPointInChinese() {
        return destPointInChinese;
    }
    public void setDestPointInChinese(String destPointInChinese) {
        this.destPointInChinese = destPointInChinese;
    }
    public String getDestPointInEnglish() {
        return destPointInEnglish;
    }
    public void setDestPointInEnglish(String destPointInEnglish) {
        this.destPointInEnglish = destPointInEnglish;
    }

}
