/*
 * 项目名: 全球大联盟
 * 文件名: BlcLogisticsInfo.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.io.Serializable;

/**
 * 清关/报关     物流、走件信息类
 * @author dongdongliu
 *
 */
public class BLCLogisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    private Long              id;
    /**
     * 上游公司编号
     */
    private String            upstreamCompanyCode;
    /**
     * 下游公司编号
     */
    private String            downstreamCompanyCode;
    /**
     * 操作公司编号
     */
    private String            operateCompanyCode;
    /**
     * 运单号
     */
    private String            logisticsNo;
    /**
     * 重量
     */
    private String            weight;
    /**
     * 重量单位
     */
    private String            weightUnit;
    /**
     * 件数
     */
    private String            packNum;
    /**
     * 车牌号
     */
    private String            truckNum;
    /**
     * 走件原始描述
     */
    private String            originDesc;
    /**
     * 走件原始状态码
     */
    private String            originStatusCode;
    /**
     * 走件海关描述
     */
    private String            customsDesc;
    /**
     * 走件海关状态码
     */
    private String            customsStatusCode;
    /**
     * 走件产生日期
     */
    private String            createDate;
    /**
     * 走件推送日期 
     */
    private String            pushDate;
    /**
     * 备注
     */
    private String            note;
    /**
     * 是否已经发送(Y-已经发送,N-未发送)
     */
    private String            isSended;
    /**
     * 备用字段1
     */
    private String            spareField1;
    /**
     * 备用字段2
     */
    private String            spareField2;
    /**
     * 备用字段3
     */
    private String            spareField3;
    /**
     * 备用字段4
     */
    private String            spareField4;
    /**
     * 备用字段5
     */
    private String            spareField5;
    /**
     * 新增时间
     */
    private String            sysCreateDate;
    /**
     * 修改时间
     */
    private String            sysModifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUpstreamCompanyCode() {
        return upstreamCompanyCode;
    }

    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    public String getDownstreamCompanyCode() {
        return downstreamCompanyCode;
    }

    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
    }

    public String getOperateCompanyCode() {
        return operateCompanyCode;
    }

    public void setOperateCompanyCode(String operateCompanyCode) {
        this.operateCompanyCode = operateCompanyCode;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getPackNum() {
        return packNum;
    }

    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    public String getTruckNum() {
        return truckNum;
    }

    public void setTruckNum(String truckNum) {
        this.truckNum = truckNum;
    }

    public String getOriginDesc() {
        return originDesc;
    }

    public void setOriginDesc(String originDesc) {
        this.originDesc = originDesc;
    }

    public String getOriginStatusCode() {
        return originStatusCode;
    }

    public void setOriginStatusCode(String originStatusCode) {
        this.originStatusCode = originStatusCode;
    }

    public String getCustomsDesc() {
        return customsDesc;
    }

    public void setCustomsDesc(String customsDesc) {
        this.customsDesc = customsDesc;
    }

    public String getCustomsStatusCode() {
        return customsStatusCode;
    }

    public void setCustomsStatusCode(String customsStatusCode) {
        this.customsStatusCode = customsStatusCode;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIsSended() {
        return isSended;
    }

    public void setIsSended(String isSended) {
        this.isSended = isSended;
    }

    public String getSpareField1() {
        return spareField1;
    }

    public void setSpareField1(String spareField1) {
        this.spareField1 = spareField1;
    }

    public String getSpareField2() {
        return spareField2;
    }

    public void setSpareField2(String spareField2) {
        this.spareField2 = spareField2;
    }

    public String getSpareField3() {
        return spareField3;
    }

    public void setSpareField3(String spareField3) {
        this.spareField3 = spareField3;
    }

    public String getSpareField4() {
        return spareField4;
    }

    public void setSpareField4(String spareField4) {
        this.spareField4 = spareField4;
    }

    public String getSpareField5() {
        return spareField5;
    }

    public void setSpareField5(String spareField5) {
        this.spareField5 = spareField5;
    }

    public String getSysCreateDate() {
        return sysCreateDate;
    }

    public void setSysCreateDate(String sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }

    public String getSysModifyDate() {
        return sysModifyDate;
    }

    public void setSysModifyDate(String sysModifyDate) {
        this.sysModifyDate = sysModifyDate;
    }

}
