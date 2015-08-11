/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceSubIdBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoManagement.entity;

import java.io.Serializable;

/**
 * @author bindizhang
 *
 */
public class ClearanceSubIdBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String            itemIdList;
    private String            subIdList;
    private Integer           subIdNum;

    /**
     * @return the itemIdList
     */
    public String getItemIdList() {
        return itemIdList;
    }

    /**
     * @param itemIdList the itemIdList to set
     */
    public void setItemIdList(String itemIdList) {
        this.itemIdList = itemIdList;
    }

    /**
     * @return the subIdList
     */
    public String getSubIdList() {
        return subIdList;
    }

    /**
     * @param subIdList the subIdList to set
     */
    public void setSubIdList(String subIdList) {
        this.subIdList = subIdList;
    }

    /**
     * @return the subIdNum
     */
    public Integer getSubIdNum() {
        return subIdNum;
    }

    /**
     * @param subIdNum the subIdNum to set
     */
    public void setSubIdNum(Integer subIdNum) {
        this.subIdNum = subIdNum;
    }

}
