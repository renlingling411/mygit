/*
 * 项目名: 全球大联盟
 * 文件名: OrderShipping.java
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
public class OrderShipping implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long orderId;
	private String batchId;
	private String partOrderId;
	private String vat;
	private String consumptionTax;
	private String otherFees;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}

	/**
	 * @param batchId
	 *            the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * @return the partOrderId
	 */
	public String getPartOrderId() {
		return partOrderId;
	}

	/**
	 * @param partOrderId
	 *            the partOrderId to set
	 */
	public void setPartOrderId(String partOrderId) {
		this.partOrderId = partOrderId;
	}

	/**
	 * @return the vat
	 */
	public String getVat() {
		return vat;
	}

	/**
	 * @param vat
	 *            the vat to set
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	/**
	 * @return the consumptionTax
	 */
	public String getConsumptionTax() {
		return consumptionTax;
	}

	/**
	 * @param consumptionTax
	 *            the consumptionTax to set
	 */
	public void setConsumptionTax(String consumptionTax) {
		this.consumptionTax = consumptionTax;
	}

	/**
	 * @return the otherFees
	 */
	public String getOtherFees() {
		return otherFees;
	}

	/**
	 * @param otherFees
	 *            the otherFees to set
	 */
	public void setOtherFees(String otherFees) {
		this.otherFees = otherFees;
	}

}
