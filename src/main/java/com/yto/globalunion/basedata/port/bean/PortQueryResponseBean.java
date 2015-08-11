/*
 * 项目名: 全球大联盟
 * 文件名: PortQueryResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.port.bean;

import com.yto.globalunion.basedata.port.entity.Port;
import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;

/**
 * @author hengchen
 *
 */
public class PortQueryResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    // 分页信息
    private PagingBean<Port>  page;
    // 是否存在
    private String            isExist;
    // 口岸种类
    private String            portKind;
    // 口岸类型
    private String            portType;
    // 国家
    private String            countryId;
    // 允许外籍进出
    private String            allowForeign;
    // 使用状态
    private String            useState;

    /**
     * @return the page
     */
    public PagingBean<Port> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<Port> page) {
        this.page = page;
    }

    /**
     * @return the isExist
     */
    public String getIsExist() {
        return isExist;
    }

    /**
     * @param isExist the isExist to set
     */
    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

    /**
     * @return the portKind
     */
    public String getPortKind() {
        return portKind;
    }

    /**
     * @param portKind the portKind to set
     */
    public void setPortKind(String portKind) {
        this.portKind = portKind;
    }

    /**
     * @return the portType
     */
    public String getPortType() {
        return portType;
    }

    /**
     * @param portType the portType to set
     */
    public void setPortType(String portType) {
        this.portType = portType;
    }

    /**
     * @return the countryId
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * @param countryId the countryId to set
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * @return the allowForeign
     */
    public String getAllowForeign() {
        return allowForeign;
    }

    /**
     * @param allowForeign the allowForeign to set
     */
    public void setAllowForeign(String allowForeign) {
        this.allowForeign = allowForeign;
    }

    /**
     * @return the useState
     */
    public String getUseState() {
        return useState;
    }

    /**
     * @param useState the useState to set
     */
    public void setUseState(String useState) {
        this.useState = useState;
    }

}
