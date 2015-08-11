/*
 * 项目名: 全球大联盟
 * 文件名: Port.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.port.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author hengchen
 *
 */
public class Port implements Serializable {
    private static final long serialVersionUID = 1L;
    // 进出口岸管理主键id
    private Long              id;
    // 口岸编号
    private String            portNumber;
    // 国家
    private String            country;
    // 国家id
    private String            countryId;
    // 口岸名称
    private String            portName;
    // 创建时间
    private Date              createDate;
    // 创建人
    private Long              createUser;
    // 修改时间
    private Date              modifyDate;
    // 修改人
    private Long              modifyUser;
    // 备注
    private String            remark;
    // 语言代码
    private String            langCode;
    // 语言代码id
    private Long              langCodeId;
    // 语言描述
    private String            langCodeDesc;
    // portId
    private Long              portId;
    // 口岸种类
    private String            portKind;
    private String            portKindDesc;
    // 允许外籍进出
    private String            allowForeign;
    private String            allowForeignDesc;
    // 口岸类型
    private String            portType;
    private String            portTypeDesc;
    // 口岸使用状态
    private String            useState;
    private String            useStateDesc;

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
     * @return the portNumber
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * @param portNumber the portNumber to set
     */
    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
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
     * @return the portName
     */
    public String getPortName() {
        return portName;
    }

    /**
     * @param portName the portName to set
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the createUser
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the modifyDate
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate the modifyDate to set
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return the modifyUser
     */
    public Long getModifyUser() {
        return modifyUser;
    }

    /**
     * @param modifyUser the modifyUser to set
     */
    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * @return the langCodeId
     */
    public Long getLangCodeId() {
        return langCodeId;
    }

    /**
     * @param langCodeId the langCodeId to set
     */
    public void setLangCodeId(Long langCodeId) {
        this.langCodeId = langCodeId;
    }

    /**
     * @return the langCodeDesc
     */
    public String getLangCodeDesc() {
        return langCodeDesc;
    }

    /**
     * @param langCodeDesc the langCodeDesc to set
     */
    public void setLangCodeDesc(String langCodeDesc) {
        this.langCodeDesc = langCodeDesc;
    }

    /**
     * @return the portId
     */
    public Long getPortId() {
        return portId;
    }

    /**
     * @param portId the portId to set
     */
    public void setPortId(Long portId) {
        this.portId = portId;
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
     * @return the portKindDesc
     */
    public String getPortKindDesc() {
        return portKindDesc;
    }

    /**
     * @param portKindDesc the portKindDesc to set
     */
    public void setPortKindDesc(String portKindDesc) {
        this.portKindDesc = portKindDesc;
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
     * @return the allowForeignDesc
     */
    public String getAllowForeignDesc() {
        return allowForeignDesc;
    }

    /**
     * @param allowForeignDesc the allowForeignDesc to set
     */
    public void setAllowForeignDesc(String allowForeignDesc) {
        this.allowForeignDesc = allowForeignDesc;
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
     * @return the portTypeDesc
     */
    public String getPortTypeDesc() {
        return portTypeDesc;
    }

    /**
     * @param portTypeDesc the portTypeDesc to set
     */
    public void setPortTypeDesc(String portTypeDesc) {
        this.portTypeDesc = portTypeDesc;
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

    /**
     * @return the useStateDesc
     */
    public String getUseStateDesc() {
        return useStateDesc;
    }

    /**
     * @param useStateDesc the useStateDesc to set
     */
    public void setUseStateDesc(String useStateDesc) {
        this.useStateDesc = useStateDesc;
    }

}
