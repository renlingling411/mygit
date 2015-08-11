/*
 * 项目名: 全球大联盟
 * 文件名: PrivilegeAssignRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.privilege.role.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * @author penglan
 *
 */
public class PrivilegeAssignRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private Long              roleId;
    private String            functionIds;

    /**
     * @return the roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the functionIds
     */
    public String getFunctionIds() {
        return functionIds;
    }

    /**
     * @param functionIds the functionIds to set
     */
    public void setFunctionIds(String functionIds) {
        this.functionIds = functionIds;
    }

}
