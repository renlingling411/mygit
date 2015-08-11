/*
 * 项目名: 全球大联盟
 * 文件名: MonitorShippment.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.clearanceInfoUpdate.entity;

import java.io.Serializable;

/**
 * @author bindizhang
 *
 */
public class MonitorShippment implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String upstreamCompanyOrderId;
	private String upstreamCompanyCode;
	private String downstreamCompanyOrderId;
	private String downstreamCompanyCode;
	private Double orderWeight;
	private String weightUnit;
	private String operateUser;
	private String operateCode;
	private String operateCompanyCode;
	private String facilityName;
	private String operateDate;
	private String isSended;

	/**
	 * @return the operateCompanyCode
	 */
	public String getOperateCompanyCode() {
		return operateCompanyCode;
	}

	/**
	 * @param operateCompanyCode
	 *            the operateCompanyCode to set
	 */
	public void setOperateCompanyCode(String operateCompanyCode) {
		this.operateCompanyCode = operateCompanyCode;
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
	 * @return the upstreamCompanyOrderId
	 */
	public String getUpstreamCompanyOrderId() {
		return upstreamCompanyOrderId;
	}

	/**
	 * @param upstreamCompanyOrderId
	 *            the upstreamCompanyOrderId to set
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
	 * @param upstreamCompanyCode
	 *            the upstreamCompanyCode to set
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
	 * @param downstreamCompanyOrderId
	 *            the downstreamCompanyOrderId to set
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
	 * @param downstreamCompanyCode
	 *            the downstreamCompanyCode to set
	 */
	public void setDownstreamCompanyCode(String downstreamCompanyCode) {
		this.downstreamCompanyCode = downstreamCompanyCode;
	}

	/**
	 * @return the orderWeight
	 */
	public Double getOrderWeight() {
		return orderWeight;
	}

	/**
	 * @param orderWeight
	 *            the orderWeight to set
	 */
	public void setOrderWeight(Double orderWeight) {
		this.orderWeight = orderWeight;
	}

	/**
	 * @return the weightUnit
	 */
	public String getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param weightUnit
	 *            the weightUnit to set
	 */
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @return the operateUser
	 */
	public String getOperateUser() {
		return operateUser;
	}

	/**
	 * @param operateUser
	 *            the operateUser to set
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
	 * @param operateCode
	 *            the operateCode to set
	 */
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}

	/**
	 * @return the facilityName
	 */
	public String getFacilityName() {
		return facilityName;
	}

	/**
	 * @param facilityName
	 *            the facilityName to set
	 */
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	/**
	 * @return the operateDate
	 */
	public String getOperateDate() {
		return operateDate;
	}

	/**
	 * @param operateDate
	 *            the operateDate to set
	 */
	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}

	/**
	 * @return the isSended
	 */
	public String getIsSended() {
		return isSended;
	}

	/**
	 * @param isSended
	 *            the isSended to set
	 */
	public void setIsSended(String isSended) {
		this.isSended = isSended;
	}
}
