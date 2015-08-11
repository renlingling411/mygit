/*
 * 项目名: 全球大联盟
 * 文件名: ClearanceInfoSubIdResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoManagement.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author bindizhang
 *
 */
public class ClearanceInfoSubIdResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private String            subIdList;
    private Integer           subIdNum;

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

}
