/*
 * 项目名: 全球大联盟
 * 文件名: HSCode.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.custom.hscode.entity;

import java.io.Serializable;

/**
 * HS 编码管理
 * @author xiaotianjin
 *
 */
public class HSCode implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private Long              id;                       // 主键ID
    private String            hsCode;                   // HS编码
    private String            customsProductName;       // 海关商品名称
    private String            customsProductRemark;     // 海关商品备注
    private String            legalUnit1;               // 法定单位一
    private String            legalUnit2;               // 法定单位二
    private Double            favorableTax;             // 惠税
    private Double            generalTax;               // 普税
    private Double            addedValueTax;            // 增值税
    private String            supervisionConditions;    // 监管条件
    private String            commodityInspectionBureau; // 商检标志 需商检或不需商检
    private String            map;                      // 映射
    private String            createDate;               // 创建时间
    private Integer           createUser;               // 创建人
    private Integer           modifyUser;               // 最后修改人
    private String            modifyDate;               // 最后修改时间

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
     * @return the hsCode
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * @param hsCode the hsCode to set
     */
    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    /**
     * @return the customsProductName
     */
    public String getCustomsProductName() {
        return customsProductName;
    }

    /**
     * @param customsProductName the customsProductName to set
     */
    public void setCustomsProductName(String customsProductName) {
        this.customsProductName = customsProductName;
    }

    /**
     * @return the customsProductRemark
     */
    public String getCustomsProductRemark() {
        return customsProductRemark;
    }

    /**
     * @param customsProductRemark the customsProductRemark to set
     */
    public void setCustomsProductRemark(String customsProductRemark) {
        this.customsProductRemark = customsProductRemark;
    }

    /**
     * @return the legalUnit1
     */
    public String getLegalUnit1() {
        return legalUnit1;
    }

    /**
     * @param legalUnit1 the legalUnit1 to set
     */
    public void setLegalUnit1(String legalUnit1) {
        this.legalUnit1 = legalUnit1;
    }

    /**
     * @return the legalUnit2
     */
    public String getLegalUnit2() {
        return legalUnit2;
    }

    /**
     * @param legalUnit2 the legalUnit2 to set
     */
    public void setLegalUnit2(String legalUnit2) {
        this.legalUnit2 = legalUnit2;
    }

    /**
     * @return the favorableTax
     */
    public Double getFavorableTax() {
        return favorableTax;
    }

    /**
     * @param favorableTax the favorableTax to set
     */
    public void setFavorableTax(Double favorableTax) {
        this.favorableTax = favorableTax;
    }

    /**
     * @return the generalTax
     */
    public Double getGeneralTax() {
        return generalTax;
    }

    /**
     * @param generalTax the generalTax to set
     */
    public void setGeneralTax(Double generalTax) {
        this.generalTax = generalTax;
    }

    /**
     * @return the addedValueTax
     */
    public Double getAddedValueTax() {
        return addedValueTax;
    }

    /**
     * @param addedValueTax the addedValueTax to set
     */
    public void setAddedValueTax(Double addedValueTax) {
        this.addedValueTax = addedValueTax;
    }

    /**
     * @return the supervisionConditions
     */
    public String getSupervisionConditions() {
        return supervisionConditions;
    }

    /**
     * @param supervisionConditions the supervisionConditions to set
     */
    public void setSupervisionConditions(String supervisionConditions) {
        this.supervisionConditions = supervisionConditions;
    }

    /**
     * @return the commodityInspectionBureau
     */
    public String getCommodityInspectionBureau() {
        return commodityInspectionBureau;
    }

    /**
     * @param commodityInspectionBureau the commodityInspectionBureau to set
     */
    public void setCommodityInspectionBureau(String commodityInspectionBureau) {
        this.commodityInspectionBureau = commodityInspectionBureau;
    }

    /**
     * @return the map
     */
    public String getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(String map) {
        this.map = map;
    }

    /**
     * @return the createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the createUser
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the modifyUser
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * @param modifyUser the modifyUser to set
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * @return the modifyDate
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate the modifyDate to set
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 对象clone方法
     */
    @Override
    public HSCode clone() {
        HSCode hsCode = null;
        try {
            hsCode = (HSCode) super.clone();
        } catch (CloneNotSupportedException e) {
        } // Won't happen
        return hsCode;
    }

}
