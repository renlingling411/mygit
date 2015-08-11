/*
 * 项目名: 全球大联盟
 * 文件名: Flight.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.flight.entity;

import java.io.Serializable;

public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;                   // 航班管理表主键id
    private String            flightNum;            // 航班号
    private Long              fromAirportID;        // 始发站id
    private Long              toAirportID;          // 目的站id
    private String            fromAirport;          // 始发站
    private String            toAirport;            // 目的站
    private String            aircraftType;         // 机型
    private String            aircraftID;           // 飞机号
    private String            planDepartureTime;    // 预计起飞时间
    private String            planArrivalTime;      // 预计到达时间
    private String            planFlightDuration;   // 预计飞行时长
    private String            arriveDate;           // 到达日期，0表示当天，-1表示昨天，1表示明天
    private String            flightSpace;           // 航空舱位数量
    private String            unitName;              // 重量单位名称
    private Long              unitNameId;            // 重量单位id
    private String            spaceAndWeight;        // 航空舱位
    private String            lastModifiedUserName;
    private String            lastModifiedDate;
    private String            langCode;
    private Long              langCodeID;
    private String            langCodeDesc;

    public Long getUnitNameId() {
        return unitNameId;
    }

    public void setUnitNameId(Long unitNameId) {
        this.unitNameId = unitNameId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return the spaceAndWeight
     */
    public String getSpaceAndWeight() {
        return spaceAndWeight;
    }

    /**
     * @param spaceAndWeight
     *            the spaceAndWeight to set
     */
    public void setSpaceAndWeight(String spaceAndWeight) {
        this.spaceAndWeight = spaceAndWeight;
    }

    /**
     * @return the flightSpace
     */
    public String getFlightSpace() {
        return flightSpace;
    }

    /**
     * @param flightSpace
     *            the flightSpace to set
     */
    public void setFlightSpace(String flightSpace) {
        this.flightSpace = flightSpace;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the flightNum
     */
    public String getFlightNum() {
        return flightNum;
    }

    /**
     * @param flightNum
     *            the flightNum to set
     */
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * @return the fromAirportID
     */
    public Long getFromAirportID() {
        return fromAirportID;
    }

    /**
     * @param fromAirportID
     *            the fromAirportID to set
     */
    public void setFromAirportID(Long fromAirportID) {
        this.fromAirportID = fromAirportID;
    }

    /**
     * @return the toAirportID
     */
    public Long getToAirportID() {
        return toAirportID;
    }

    /**
     * @param toAirportID
     *            the toAirportID to set
     */
    public void setToAirportID(Long toAirportID) {
        this.toAirportID = toAirportID;
    }

    /**
     * @return the fromAirport
     */
    public String getFromAirport() {
        return fromAirport;
    }

    /**
     * @param fromAirport
     *            the fromAirport to set
     */
    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    /**
     * @return the toAirport
     */
    public String getToAirport() {
        return toAirport;
    }

    /**
     * @param toAirport
     *            the toAirport to set
     */
    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    /**
     * @return the aircraftType
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * @param aircraftType
     *            the aircraftType to set
     */
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    /**
     * @return the aircraftID
     */
    public String getAircraftID() {
        return aircraftID;
    }

    /**
     * @param aircraftID
     *            the aircraftID to set
     */
    public void setAircraftID(String aircraftID) {
        this.aircraftID = aircraftID;
    }

    /**
     * @return the planDepartureTime
     */
    public String getPlanDepartureTime() {
        return planDepartureTime;
    }

    /**
     * @param planDepartureTime
     *            the planDepartureTime to set
     */
    public void setPlanDepartureTime(String planDepartureTime) {
        this.planDepartureTime = planDepartureTime;
    }

    /**
     * @return the planArrivalTime
     */
    public String getPlanArrivalTime() {
        return planArrivalTime;
    }

    /**
     * @param planArrivalTime
     *            the planArrivalTime to set
     */
    public void setPlanArrivalTime(String planArrivalTime) {
        this.planArrivalTime = planArrivalTime;
    }

    /**
     * @return the planFlightDuration
     */
    public String getPlanFlightDuration() {
        return planFlightDuration;
    }

    /**
     * @param planFlightDuration
     *            the planFlightDuration to set
     */
    public void setPlanFlightDuration(String planFlightDuration) {
        this.planFlightDuration = planFlightDuration;
    }

    /**
     * @return the arriveDate
     */
    public String getArriveDate() {
        return arriveDate;
    }

    /**
     * @param arriveDate
     *            the arriveDate to set
     */
    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    /**
     * @return the lastModifiedUserName
     */
    public String getLastModifiedUserName() {
        return lastModifiedUserName;
    }

    /**
     * @param lastModifiedUserName
     *            the lastModifiedUserName to set
     */
    public void setLastModifiedUserName(String lastModifiedUserName) {
        this.lastModifiedUserName = lastModifiedUserName;
    }

    /**
     * @return the lastModifiedDate
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate
     *            the lastModifiedDate to set
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode
     *            the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the langCodeID
     */
    public Long getLangCodeID() {
        return langCodeID;
    }

    /**
     * @param langCodeID
     *            the langCodeID to set
     */
    public void setLangCodeID(Long langCodeID) {
        this.langCodeID = langCodeID;
    }

    /**
     * @return the langCodeDesc
     */
    public String getLangCodeDesc() {
        return langCodeDesc;
    }

    /**
     * @param langCodeDesc
     *            the langCodeDesc to set
     */
    public void setLangCodeDesc(String langCodeDesc) {
        this.langCodeDesc = langCodeDesc;
    }

}
