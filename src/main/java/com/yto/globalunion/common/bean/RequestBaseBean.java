/*
 * 项目名: 全球大联盟
 * 文件名: RequestBaseBean.java
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
 * 请求Bean的基类
 * @author penglan
 *
 */
public class RequestBaseBean implements IRequest {
    private static final long serialVersionUID = 1L;
    private RequestType       type;
    private User              user;

    /**
     * @return the type
     */
    @Override
    public RequestType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(RequestType type) {
        this.type = type;
    }

    /**
     * @return the currUser
     */
    public final User getUser() {
        return user;
    }

    @Override
    public final void setUser(User user) {
        this.user = user;
    }
}
