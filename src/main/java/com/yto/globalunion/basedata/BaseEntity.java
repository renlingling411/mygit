/*
 * 项目名: 全球大联盟
 * 文件名: BaseEntity.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *Description:基类，将公共属性定义在此类
 *
 *@author dongdongliu
 *
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * id主键
     */
    private Long              id;
    /**
     * 父表id
     */
    private Long              parentId;
    /**
     * 多语言表ID
     */
    private Long              multiLanguageId;
    /**
     * 语言代码
     */
    private String            langCode;
    /**
     * 语言描述
     */
    private String            langDesc;
    /**
     * 语言顺序
     */
    private Long              langOrder;
    /**
     * 创建时间
     */
    private Date              createDate;
    /**
     * 创建人ID
     */
    private Long              createUser;
    /**
     * 修改时间
     */
    private Date              modifyDate;
    /**
     * 修改人ID
     */
    private Long              modifyUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getMultiLanguageId() {
        return multiLanguageId;
    }

    public void setMultiLanguageId(Long multiLanguageId) {
        this.multiLanguageId = multiLanguageId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getLangDesc() {
        return langDesc;
    }

    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    public Long getLangOrder() {
        return langOrder;
    }

    public void setLangOrder(Long langOrder) {
        this.langOrder = langOrder;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

}
