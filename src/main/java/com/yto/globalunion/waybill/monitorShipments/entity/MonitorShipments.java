/*
 * 项目名: 全球大联盟
 * 文件名: MonitorShipments.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.monitorShipments.entity;

import java.io.Serializable;

/**
 * @author tingtingwu
 *
 */
public class MonitorShipments implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upstreamCompanyOrderId;  // 上游公司运单号
    private String            upstreamCompanyCode;     // 上游公司编号
    private String            downstreamCompanyOrderId; // 下游公司运单号
    private String            downstreamCompanyCode;   // 下游公司编号
    private String            upCompanyName;           // 上游公司名
    private String            downCompanyName;         // 下游公司名
    private String            orderWeight;             // 订单重量
    private String            orderWeightUnit;         // 订单重量单位
    private String            mainOrderId;             // 主运单号
    private String            arriveCity;              // 到达城市
    private String            flightNum;               // 航班号
    private String            operateCompanyCode;      // 操作公司编号（走件信息来源公司编码）
    private String            operateCompanyName;      // 操作公司
    private String            operateUser;             // 操作员
    private String            operateCode;             // 操作类型
    private String            operateStatus;           // 操作状态
    private String            operateDesc;             // 操作描述
    private String            operateDate;             // 操作日期
    private String            facilityType;            // 网点类型
    private String            facilityName;            // 网点名称
    private String            contactName;             // 联系人(派件员)
    private String            contactPhone;            // 联系电话(派件员电话)
    private String            remark;                  // 备注

    private String            glsOperateDate;           // 推送GLS走件信息时填充Velocity模板需要
    private String            glsOperateTime;           // 推送GLS走件信息时填充Velocity模板需要

    /**
     * @return the operateStatus
     */
    public String getOperateStatus() {
        return operateStatus;
    }

    /**
     * @param operateStatus the operateStatus to set
     */
    public void setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
    }

    /**
     * @return the operateCompanyCode
     */
    public String getOperateCompanyCode() {
        return operateCompanyCode;
    }

    /**
     * @param operateCompanyCode the operateCompanyCode to set
     */
    public void setOperateCompanyCode(String operateCompanyCode) {
        this.operateCompanyCode = operateCompanyCode;
    }

    /**
     * @return the operateCompanyName
     */
    public String getOperateCompanyName() {
        return operateCompanyName;
    }

    /**
     * @param operateCompanyName the operateCompanyName to set
     */
    public void setOperateCompanyName(String operateCompanyName) {
        this.operateCompanyName = operateCompanyName;
    }

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
     * @return the upstreamCompanyOrderId
     */
    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    /**
     * @param upstreamCompanyOrderId the upstreamCompanyOrderId to set
     */
    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    /**
     * @return the upstreamCompanyCode
     */
    public String getUpstreamCompanyCode() {
        return upstreamCompanyCode;
    }

    /**
     * @param upstreamCompanyCode the upstreamCompanyCode to set
     */
    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    /**
     * @return the downstreamCompanyOrderId
     */
    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    /**
     * @param downstreamCompanyOrderId the downstreamCompanyOrderId to set
     */
    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    /**
     * @return the downstreamCompanyCode
     */
    public String getDownstreamCompanyCode() {
        return downstreamCompanyCode;
    }

    /**
     * @param downstreamCompanyCode the downstreamCompanyCode to set
     */
    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
    }

    /**
     * @return the upCompanyName
     */
    public String getUpCompanyName() {
        return upCompanyName;
    }

    /**
     * @param upCompanyName the upCompanyName to set
     */
    public void setUpCompanyName(String upCompanyName) {
        this.upCompanyName = upCompanyName;
    }

    /**
     * @return the downCompanyName
     */
    public String getDownCompanyName() {
        return downCompanyName;
    }

    /**
     * @param downCompanyName the downCompanyName to set
     */
    public void setDownCompanyName(String downCompanyName) {
        this.downCompanyName = downCompanyName;
    }

    /**
     * @return the orderWeight
     */
    public String getOrderWeight() {
        return orderWeight;
    }

    /**
     * @param orderWeight the orderWeight to set
     */
    public void setOrderWeight(String orderWeight) {
        this.orderWeight = orderWeight;
    }

    /**
     * @return the orderWeightUnit
     */
    public String getOrderWeightUnit() {
        return orderWeightUnit;
    }

    /**
     * @param orderWeightUnit the orderWeightUnit to set
     */
    public void setOrderWeightUnit(String orderWeightUnit) {
        this.orderWeightUnit = orderWeightUnit;
    }

    /**
     * @return the mainOrderId
     */
    public String getMainOrderId() {
        return mainOrderId;
    }

    /**
     * @param mainOrderId the mainOrderId to set
     */
    public void setMainOrderId(String mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    /**
     * @return the flightNum
     */
    public String getFlightNum() {
        return flightNum;
    }

    /**
     * @param flightNum the flightNum to set
     */
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * @return the operateUser
     */
    public String getOperateUser() {
        return operateUser;
    }

    /**
     * @param operateUser the operateUser to set
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    /**
     * @return the operateCode
     */
    public String getOperateCode() {
        return operateCode;
    }

    /**
     * @param operateCode the operateCode to set
     */
    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    /**
     * @return the operateDesc
     */
    public String getOperateDesc() {
        return operateDesc;
    }

    /**
     * @param operateDesc the operateDesc to set
     */
    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    /**
     * @return the operateDate
     */
    public String getOperateDate() {
        return operateDate;
    }

    /**
     * @param operateDate the operateDate to set
     */
    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    /**
     * @return the facilityType
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * @param facilityType the facilityType to set
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * @return the facilityName
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * @param facilityName the facilityName to set
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * @param contactPhone the contactPhone to set
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public String getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity;
    }

    public String getGlsOperateDate() {
        return glsOperateDate;
    }

    public void setGlsOperateDate(String glsOperateDate) {
        this.glsOperateDate = glsOperateDate;
    }

    public String getGlsOperateTime() {
        return glsOperateTime;
    }

    public void setGlsOperateTime(String glsOperateTime) {
        this.glsOperateTime = glsOperateTime;
    }
}
