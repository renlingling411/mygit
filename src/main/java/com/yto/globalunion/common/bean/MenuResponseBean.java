/*
 * 项目名: 全球大联盟
 * 文件名: MenuResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.util.List;

import com.yto.globalunion.common.entity.Menu;

/**
 * @author penglan
 *
 */
public class MenuResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;

    private List<Menu>        menuList;

    /**
     * @return the menuList
     */
    public List<Menu> getMenuList() {
        return menuList;
    }

    /**
     * @param menuList the menuList to set
     */
    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

}
