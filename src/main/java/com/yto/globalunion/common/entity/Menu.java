/**
 * 
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 *菜单实体类
 * @author penglan
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            menuCode;
    private String            menuUrl;
    private Integer           menuOrder;
    private Boolean           menuVisibile;
    private Long              menuParentID;
    private String            menuName;
    private String            langCode;
    private String            menuIcon;
    private List<Menu>        subMenus;

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
     * @return the menuCode
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * @param menuCode the menuCode to set
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * @return the menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl the menuUrl to set
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return the menuOrder
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder the menuOrder to set
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * @return the menuVisibile
     */
    public Boolean getMenuVisibile() {
        return menuVisibile;
    }

    /**
     * @param menuVisibile the menuVisibile to set
     */
    public void setMenuVisibile(Boolean menuVisibile) {
        this.menuVisibile = menuVisibile;
    }

    /**
     * @return the menuParentID
     */
    public Long getMenuParentID() {
        return menuParentID;
    }

    /**
     * @param menuParentID the menuParentID to set
     */
    public void setMenuParentID(Long menuParentID) {
        this.menuParentID = menuParentID;
    }

    /**
     * @return the menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName the menuName to set
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
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
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the menuIcon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon the menuIcon to set
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * @return the subMenus
     */
    public List<Menu> getSubMenus() {
        return subMenus;
    }

    /**
     * @param subMenus the subMenus to set
     */
    public void setSubMenus(List<Menu> subMenus) {
        this.subMenus = subMenus;
    }

}
