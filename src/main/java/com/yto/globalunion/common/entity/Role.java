/*
 * 项目名: 全球大联盟
 * 文件名: Role.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.yto.globalunion.common.enums.Functions;

/**
 * @author murphy
 *
 */
public class Role implements Serializable {
    private static final long    serialVersionUID = 1L;
    private Long                 id;
    private String               code;
    private String               roleName;
    private String               langCode;
    private Long                 langCodeId;
    private Long                 roleId;
    private final Set<Functions> functions        = new HashSet<>();
    private String               privilege;

    /**
     * @return the roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     *            the roleId to set
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the langCodeId
     */
    public Long getLangCodeId() {
        return langCodeId;
    }

    /**
     * @param langCodeId
     *            the langCodeId to set
     */
    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     *            the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return the functions
     */
    public Set<Functions> getFunctions() {
        return functions;
    }

    /**
     * @return the roleCode
     */
    public String getCode() {
        return code;
    }

    /**
     * @param roleCode
     *            the roleCode to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode
     *            the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege the privilege to set
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
}
