/*
 * 项目名: 全球大联盟
 * 文件名: UserQueryRequestBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.privilege.user.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.common.entity.User;

/**
 * @author hengchen
 *
 */
public class UserQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {
    private static final long serialVersionUID = 1L;
    // 语言代码
    private String            langCode;
    // 分页信息
    private PagingBean<User>  page;

    private User              userParam;

    /**
     * @return the userParam
     */
    public User getUserParam() {
        return userParam;
    }

    /**
     * @param userParam the userParam to set
     */
    public void setUserParam(User userParam) {
        this.userParam = userParam;
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

    /**
     * @return the page
     */
    public PagingBean<User> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<User> page) {
        this.page = page;
    }

}
