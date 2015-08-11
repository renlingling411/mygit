/*
 * 项目名: 全球大联盟
 * 文件名: FunctionTree.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.privilege.safety.entity;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class FunctionTree implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            name;
    private Long              pId;
    private boolean           open             = true;
    private boolean           checked          = false;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pId
     */
    public Long getpId() {
        return pId;
    }

    /**
     * @param pId the pId to set
     */
    public void setpId(Long pId) {
        this.pId = pId;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * @return the checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * @param checked the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FunctionTree)) {
            return false;
        }

        FunctionTree targetTree = (FunctionTree) obj;
        if (targetTree == this || (this.getId() != null && this.getId().equals(targetTree.getId()))) {
            return true;
        }
        return false;
    }
}
