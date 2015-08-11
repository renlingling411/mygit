/*
 * 项目名: 全球大联盟
 * 文件名: LogInfo.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.log.entity;

import java.io.Serializable;

import com.yto.globalunion.log.enums.ModuleCode;
import com.yto.globalunion.log.enums.OperatorCode;
import com.yto.globalunion.log.enums.StatusCode;

/**
 * @author murphy
 *
 */
public class LogInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long              userId;
    private Long              companyId;
    private String            companyName;
    private String            userName;
    private String            userIp;
    private ModuleCode        moduleCode;
    private OperatorCode      operatorCode;
    private StatusCode        statusCode;
    private String            startDate;
    private String            endDate;
    private String            operateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public ModuleCode getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(ModuleCode moduleCode) {
        this.moduleCode = moduleCode;
    }

    public OperatorCode getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(OperatorCode operatorCode) {
        this.operatorCode = operatorCode;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }
}
