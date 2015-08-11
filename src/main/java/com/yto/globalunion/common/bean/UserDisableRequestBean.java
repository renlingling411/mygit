/*
 * 项目名: 全球大联盟
 * 文件名: UserDisableRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import com.yto.globalunion.common.entity.User;

/**
 * @author penglan
 *
 */
public class UserDisableRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;
    private User              targetUser;
    private String            langCode;

    /**
     * @return the targetUser
     */
    public User getTargetUser() {
        return targetUser;
    }

    /**
     * @param targetUser the targetUser to set
     */
    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
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

}
