/*
 * 项目名: 全球大联盟
 * 文件名: UserResponseBean.java
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
public class UserResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private User              user;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

}
