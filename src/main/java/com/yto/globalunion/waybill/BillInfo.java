/*
 * 项目名: 全球大联盟
 * 文件名: BillInfo.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author bindizhang
 *
 */
public class BillInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upstreamCompanyOrderId;      // 上游公司运单号
    private String            upstreamCompanyCode;         // 上游公司id
    private String            upstreamCompanyName;         // 上游公司名称
    private String            upstreamCompanyLogoName;
    private String            downstreamCompanyOrderId;    // 下游公司运单号
    private String            downstreamCompanyCode;       // 下游公司id
    private String            downstreamCompanyName;       // 下游公司名称
    private String            productCode;                 // 产品名称
    private String            batchId;
    private String            flightNum;
    private String            truckSignId;
    private String            packSignId;
    private String            senderName;                  // 寄件人名称
    private String            senderNameTranslate;         // 寄件人名称翻译
    private String            senderPostCode;              // 寄件人邮政编码
    private String            senderPhone;                 // 寄件人联系电话
    private String            senderMobile;                // 寄件人手机号码
    private String            senderCountry;
    private String            senderCountryTranslate;
    private String            senderCountryCode;
    private String            senderProvince;
    private String            senderProvinceTranslate;
    private String            senderProvinceCode;
    private String            senderCity;
    private String            senderCityTranslate;
    private String            senderCityCode;
    private String            senderDistrict;
    private String            senderDistrictTransalte;
    private String            senderDistrictCode;
    private String            senderAddress;
    private String            senderAddressTranslate;
    private String            senderAllAddressTranslate;
    private String            receiverName;                // 收件人名称
    private String            receiverNameTranslate;       // 收件人名称翻译
    private String            receiverPostCode;            // 收件人邮政编码
    private String            receiverPostcode7Dash;       // 速达7碼資料
    private String            receiverPhone;               // 收件人手机号码
    private String            receiverMobile;              // 收件人联系电话
    private String            receiverCountry;
    private String            receiverCountryTranslate;
    private String            receiverCountryCode;
    private String            receiverProvince;
    private String            receiverProvinceTranslate;
    private String            receiverProvinceCode;
    private String            receiverCity;
    private String            receiverCityTranslate;
    private String            receiverCityCode;
    private String            receiverDistrict;
    private String            receiverDistrictTransate;
    private String            receiverDistrictCode;
    private String            receiverAddress;
    private String            receiverAddressAfterPrint;   // 打印运单后生成的收件人地址
    private String            receiverAddressTranslate;
    private String            receiverAllAddressTranslate;
    private Double            packInsuranceValue;
    private Long              packSpecial;
    private String            packRemark;                  // 备注
    private Double            packWeight;                  // 重量
    private String            packWeightUnit;              // 重量单位
    private Double            packLength;                  // 长度
    private String            packLengthUnit;              // 长度单位
    private Double            packWidth;                   // 宽度
    private String            packWidthUnit;               // 宽度单位
    private Double            packHeight;                  // 高度
    private String            packHeightUnit;              // 高度单位
    private String            packLinearMeasure;           // 长宽高计量单位
    private Double            packVolume;
    private String            packVolumeUnit;
    private Double            goodsValue;                  // 价值
    private String            goodsValueUnit;
    private Double            itemsValue       = 0.0;      // Add by Ying Situ
    private String            currencyCode;                // 价值单位
    private String            isLowdensitycargo;
    private String            orderType;
    private String            serviceType;
    private Double            totalServiceFee;
    private Double            buyServiceFee;
    private Double            codSplitFee;
    private String            reservedField01;             // 收件人部门名称
    private String            reservedField02;             // 收件人26108(未知字段)
    private String            reservedField03;             // 收件人大楼名称
    private String            reservedField04;             // 发件人部门名称
    private String            reservedField05;             // 内件数量
    private String            reservedField06;             // 品名(货物名称)
    private String            reservedField07;             // 航班号
    private String            reservedField08;             // 西浓订单标志位1(如果为1，则表示此运单为dat文件导入的西浓运单)
    private String            reservedField09;             // 货物价值
    private String            reservedField10;
    private Double            declaredValue;               // 申报价值
    private String            originOfCountry;             // 原产地
    private String            material;             	   // 材质
    private String            createDate;
    private String            sendDate;
    private String            orderCustomsDate;
    private String            orderSigninDate;
    private String            orderAccountOutDate;
    private Long              createUser;
    private Boolean           isAssigned;
    private String            modifyDate;
    private Long              translateUserId;
    private String            isUpstreamChargeOff;         // 上游公司出账状态
    private String            isDownstreamChargeOff;       // 下游公司出账状态
    private String            translateStateCode;
    private String            linearMeasure;
    private String            translateStateDesc;
    private String            translateUserName;
    private Boolean           isCanTranslate;
    private List<BillItem>    items;                       //内件列表
    private Long[]            itemIds;
    private String[]          orderItemNames;
    private Double            agencyFund;
    private String            bigPen;                      // 大头笔
    private String            mailNo;                      // 易通面单号
    private String            customerId;                  // 打印需要
    private String            orderState;                  // 运单走件状态，对应字典表code
    private String            lastModifiedTime;            // 最后修改时间，用于走件信息获取时修改运单状态时进行比较
    private String            receiptDate;                 // 速达打印收获日
    private String            reserveDeliveryDate;         // 速达打印预定配达日

    //用于条件查询
    private String            userCompany;                  // user的公司
    private String            startDate;                    //开始时间
    private String            endDate;                      //结束时间，用于查询
    
    // SUPS专用 tb_country_info
    private Long              countryId;                   // 收件人countryId
                                                            // 如1096
    private String            countryCode;                 // 收件人countryCode
                                                            // 如US
    private String            printUrl         = "";       // SUPS打印链接
    private String            printStatue      = "success"; // SUPS请求返回状态，默认success
    private String            isPrinted        = "N";      // 是否已经打印，默认为N
    private String            ordersId;                    // SUPS系统中的内部号

    private Double            taxes;                       // 税费

    // GLS专用 (填充模板用)
    private String            glsDate;                     // 日期
    private String            glsTime;                     // 时间
    private String            glsFileName;                 // 文件名
    private String            locCode;
    private String            sourceSystem;
    private String            glsSenderCountryCode;        // GLS的收件人及发件人国家编号
    private String            glsReceiverCountryCode;
    private Long              glsWayBillNo;                 // GLS面单号（范围92620000000-92624999999）
    private String            street;             //街道
	private String            blockNo;          //门号
    private String            transferCenterCode;          // YTO
                                                            // 100*180打印专用目的地条形码

    public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}
    /**
     * @return the locCode
     */
    public String getLocCode() {
        return locCode;
    }

    /**
     * @return the glsSenderCountryCode
     */
    public String getGlsSenderCountryCode() {
        return glsSenderCountryCode;
    }

    /**
     * @param glsSenderCountryCode the glsSenderCountryCode to set
     */
    public void setGlsSenderCountryCode(String glsSenderCountryCode) {
        this.glsSenderCountryCode = glsSenderCountryCode;
    }

    /**
     * @return the glsReceiverCountryCode
     */
    public String getGlsReceiverCountryCode() {
        return glsReceiverCountryCode;
    }

    /**
     * @param glsReceiverCountryCode the glsReceiverCountryCode to set
     */
    public void setGlsReceiverCountryCode(String glsReceiverCountryCode) {
        this.glsReceiverCountryCode = glsReceiverCountryCode;
    }

    /**
     * @return the transferCenterCode
     */
    public String getTransferCenterCode() {
        return transferCenterCode;
    }

    /**
     * @param transferCenterCode the transferCenterCode to set
     */
    public void setTransferCenterCode(String transferCenterCode) {
        this.transferCenterCode = transferCenterCode;
    }

    /**
     * @param locCode the locCode to set
     */
    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    /**
     * @return the sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * @param sourceSystem the sourceSystem to set
     */
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    /**
     * @return the glsDate
     */
    public String getGlsDate() {
        return glsDate;
    }

    /**
     * @param glsDate the glsDate to set
     */
    public void setGlsDate(String glsDate) {
        this.glsDate = glsDate;
    }

    /**
     * @return the glsTime
     */
    public String getGlsTime() {
        return glsTime;
    }

    /**
     * @param glsTime the glsTime to set
     */
    public void setGlsTime(String glsTime) {
        this.glsTime = glsTime;
    }

    /**
     * @return the glsFileName
     */
    public String getGlsFileName() {
        return glsFileName;
    }

    /**
     * @param glsFileName the glsFileName to set
     */
    public void setGlsFileName(String glsFileName) {
        this.glsFileName = glsFileName;
    }

    /**
     * @return the taxes
     */
    public Double getTaxes() {
        return taxes;
    }

    /**
     * @param taxes the taxes to set
     */
    public void setTaxes(Double taxes) {
        this.taxes = taxes;
    }

    /**
     * @return the ordersId
     */
    public String getOrdersId() {
        return ordersId;
    }

    /**
     * @param ordersId the ordersId to set
     */
    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * @return the isPrinted
     */
    public String getIsPrinted() {
        return isPrinted;
    }

    /**
     * @param isPrinted the isPrinted to set
     */
    public void setIsPrinted(String isPrinted) {
        this.isPrinted = isPrinted;
    }

    /**
     * @return the printUrl
     */
    public String getPrintUrl() {
        return printUrl;
    }

    /**
     * @param printUrl the printUrl to set
     */
    public void setPrintUrl(String printUrl) {
        this.printUrl = printUrl;
    }

    /**
     * @return the printStatue
     */
    public String getPrintStatue() {
        return printStatue;
    }

    /**
     * @param printStatue the printStatue to set
     */
    public void setPrintStatue(String printStatue) {
        this.printStatue = printStatue;
    }

    /**
     * @return the countryId
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * @param countryId the countryId to set
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the receiptDate
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * @param receiptDate the receiptDate to set
     */
    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    /**
     * @return the reserveDeliveryDate
     */
    public String getReserveDeliveryDate() {
        return reserveDeliveryDate;
    }

    /**
     * @param reserveDeliveryDate the reserveDeliveryDate to set
     */
    public void setReserveDeliveryDate(String reserveDeliveryDate) {
        this.reserveDeliveryDate = reserveDeliveryDate;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    /** 
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
    /**
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    /**
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }
    /**
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the goodsValueUnit
     */
    public String getGoodsValueUnit() {
        return goodsValueUnit;
    }

    /**
     * @param goodsValueUnit the goodsValueUnit to set
     */
    public void setGoodsValueUnit(String goodsValueUnit) {
        this.goodsValueUnit = goodsValueUnit;
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
     * @return the upstreamCompanyName
     */
    public String getUpstreamCompanyName() {
        return upstreamCompanyName;
    }

    /**
     * @param upstreamCompanyName the upstreamCompanyName to set
     */
    public void setUpstreamCompanyName(String upstreamCompanyName) {
        this.upstreamCompanyName = upstreamCompanyName;
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
     * @return the downstreamCompanyName
     */
    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    /**
     * @param downstreamCompanyName the downstreamCompanyName to set
     */
    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
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
     * @return the truckSignId
     */
    public String getTruckSignId() {
        return truckSignId;
    }

    /**
     * @param truckSignId the truckSignId to set
     */
    public void setTruckSignId(String truckSignId) {
        this.truckSignId = truckSignId;
    }

    /**
     * @return the packSignId
     */
    public String getPackSignId() {
        return packSignId;
    }

    /**
     * @param packSignId the packSignId to set
     */
    public void setPackSignId(String packSignId) {
        this.packSignId = packSignId;
    }

    /**
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the senderPostCode
     */
    public String getSenderPostCode() {
        return senderPostCode;
    }

    /**
     * @param senderPostCode the senderPostCode to set
     */
    public void setSenderPostCode(String senderPostCode) {
        this.senderPostCode = senderPostCode;
    }

    /**
     * @return the senderPhone
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * @param senderPhone the senderPhone to set
     */
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    /**
     * @return the senderMobile
     */
    public String getSenderMobile() {
        return senderMobile;
    }

    /**
     * @param senderMobile the senderMobile to set
     */
    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    /**
     * @return the senderCountry
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * @param senderCountry the senderCountry to set
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /**
     * @return the senderCountryTranslate
     */
    public String getSenderCountryTranslate() {
        return senderCountryTranslate;
    }

    /**
     * @param senderCountryTranslate the senderCountryTranslate to set
     */
    public void setSenderCountryTranslate(String senderCountryTranslate) {
        this.senderCountryTranslate = senderCountryTranslate;
    }

    /**
     * @return the senderCountryCode
     */
    public String getSenderCountryCode() {
        return senderCountryCode;
    }

    /**
     * @param senderCountryCode the senderCountryCode to set
     */
    public void setSenderCountryCode(String senderCountryCode) {
        this.senderCountryCode = senderCountryCode;
    }

    /**
     * @return the senderProvince
     */
    public String getSenderProvince() {
        return senderProvince;
    }

    /**
     * @param senderProvince the senderProvince to set
     */
    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    /**
     * @return the senderProvinceTranslate
     */
    public String getSenderProvinceTranslate() {
        return senderProvinceTranslate;
    }

    /**
     * @param senderProvinceTranslate the senderProvinceTranslate to set
     */
    public void setSenderProvinceTranslate(String senderProvinceTranslate) {
        this.senderProvinceTranslate = senderProvinceTranslate;
    }

    /**
     * @return the senderProvinceCode
     */
    public String getSenderProvinceCode() {
        return senderProvinceCode;
    }

    /**
     * @param senderProvinceCode the senderProvinceCode to set
     */
    public void setSenderProvinceCode(String senderProvinceCode) {
        this.senderProvinceCode = senderProvinceCode;
    }

    /**
     * @return the senderCity
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * @param senderCity the senderCity to set
     */
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    /**
     * @return the senderCityTranslate
     */
    public String getSenderCityTranslate() {
        return senderCityTranslate;
    }

    /**
     * @param senderCityTranslate the senderCityTranslate to set
     */
    public void setSenderCityTranslate(String senderCityTranslate) {
        this.senderCityTranslate = senderCityTranslate;
    }

    /**
     * @return the senderCityCode
     */
    public String getSenderCityCode() {
        return senderCityCode;
    }

    /**
     * @param senderCityCode the senderCityCode to set
     */
    public void setSenderCityCode(String senderCityCode) {
        this.senderCityCode = senderCityCode;
    }

    /**
     * @return the senderDistrict
     */
    public String getSenderDistrict() {
        return senderDistrict;
    }

    /**
     * @param senderDistrict the senderDistrict to set
     */
    public void setSenderDistrict(String senderDistrict) {
        this.senderDistrict = senderDistrict;
    }

    /**
     * @return the senderDistrictTransalte
     */
    public String getSenderDistrictTransalte() {
        return senderDistrictTransalte;
    }

    /**
     * @param senderDistrictTransalte the senderDistrictTransalte to set
     */
    public void setSenderDistrictTransalte(String senderDistrictTransalte) {
        this.senderDistrictTransalte = senderDistrictTransalte;
    }

    /**
     * @return the senderDistrictCode
     */
    public String getSenderDistrictCode() {
        return senderDistrictCode;
    }

    /**
     * @param senderDistrictCode the senderDistrictCode to set
     */
    public void setSenderDistrictCode(String senderDistrictCode) {
        this.senderDistrictCode = senderDistrictCode;
    }

    /**
     * @return the senderAddress
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * @param senderAddress the senderAddress to set
     */
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    /**
     * @return the senderAddressTranslate
     */
    public String getSenderAddressTranslate() {
        return senderAddressTranslate;
    }

    /**
     * @param senderAddressTranslate the senderAddressTranslate to set
     */
    public void setSenderAddressTranslate(String senderAddressTranslate) {
        this.senderAddressTranslate = senderAddressTranslate;
    }

    /**
     * @return the senderAllAddressTranslate
     */
    public String getSenderAllAddressTranslate() {
        return senderAllAddressTranslate;
    }

    /**
     * @param senderAllAddressTranslate the senderAllAddressTranslate to set
     */
    public void setSenderAllAddressTranslate(String senderAllAddressTranslate) {
        this.senderAllAddressTranslate = senderAllAddressTranslate;
    }

    /**
     * @return the receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName the receiverName to set
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return the receiverPostCode
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * @param receiverPostCode the receiverPostCode to set
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    /**
     * @return the receiverPhone
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * @param receiverPhone the receiverPhone to set
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * @return the receiverMobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * @param receiverMobile the receiverMobile to set
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * @return the receiverCountry
     */
    public String getReceiverCountry() {
        return receiverCountry;
    }

    /**
     * @param receiverCountry the receiverCountry to set
     */
    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    /**
     * @return the receiverCountryTranslate
     */
    public String getReceiverCountryTranslate() {
        return receiverCountryTranslate;
    }

    /**
     * @param receiverCountryTranslate the receiverCountryTranslate to set
     */
    public void setReceiverCountryTranslate(String receiverCountryTranslate) {
        this.receiverCountryTranslate = receiverCountryTranslate;
    }

    /**
     * @return the receiverCountryCode
     */
    public String getReceiverCountryCode() {
        return receiverCountryCode;
    }

    /**
     * @param receiverCountryCode the receiverCountryCode to set
     */
    public void setReceiverCountryCode(String receiverCountryCode) {
        this.receiverCountryCode = receiverCountryCode;
    }

    /**
     * @return the receiverProvince
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * @param receiverProvince the receiverProvince to set
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    /**
     * @return the receiverProvinceTranslate
     */
    public String getReceiverProvinceTranslate() {
        return receiverProvinceTranslate;
    }

    /**
     * @param receiverProvinceTranslate the receiverProvinceTranslate to set
     */
    public void setReceiverProvinceTranslate(String receiverProvinceTranslate) {
        this.receiverProvinceTranslate = receiverProvinceTranslate;
    }

    /**
     * @return the receiverProvinceCode
     */
    public String getReceiverProvinceCode() {
        return receiverProvinceCode;
    }

    /**
     * @param receiverProvinceCode the receiverProvinceCode to set
     */
    public void setReceiverProvinceCode(String receiverProvinceCode) {
        this.receiverProvinceCode = receiverProvinceCode;
    }

    /**
     * @return the receiverCity
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * @param receiverCity the receiverCity to set
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * @return the receiverCityTranslate
     */
    public String getReceiverCityTranslate() {
        return receiverCityTranslate;
    }

    /**
     * @param receiverCityTranslate the receiverCityTranslate to set
     */
    public void setReceiverCityTranslate(String receiverCityTranslate) {
        this.receiverCityTranslate = receiverCityTranslate;
    }

    /**
     * @return the receiverCityCode
     */
    public String getReceiverCityCode() {
        return receiverCityCode;
    }

    /**
     * @param receiverCityCode the receiverCityCode to set
     */
    public void setReceiverCityCode(String receiverCityCode) {
        this.receiverCityCode = receiverCityCode;
    }

    /**
     * @return the receiverDistrict
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * @param receiverDistrict the receiverDistrict to set
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    /**
     * @return the receiverDistrictTransate
     */
    public String getReceiverDistrictTransate() {
        return receiverDistrictTransate;
    }

    /**
     * @param receiverDistrictTransate the receiverDistrictTransate to set
     */
    public void setReceiverDistrictTransate(String receiverDistrictTransate) {
        this.receiverDistrictTransate = receiverDistrictTransate;
    }

    /**
     * @return the receiverDistrictCode
     */
    public String getReceiverDistrictCode() {
        return receiverDistrictCode;
    }

    /**
     * @param receiverDistrictCode the receiverDistrictCode to set
     */
    public void setReceiverDistrictCode(String receiverDistrictCode) {
        this.receiverDistrictCode = receiverDistrictCode;
    }

    /**
     * @return the receiverAddress
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * @param receiverAddress the receiverAddress to set
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * @return the receiverAddressTranslate
     */
    public String getReceiverAddressTranslate() {
        return receiverAddressTranslate;
    }

    /**
     * @param receiverAddressTranslate the receiverAddressTranslate to set
     */
    public void setReceiverAddressTranslate(String receiverAddressTranslate) {
        this.receiverAddressTranslate = receiverAddressTranslate;
    }

    /**
     * @return the receiverAllAddressTranslate
     */
    public String getReceiverAllAddressTranslate() {
        return receiverAllAddressTranslate;
    }

    /**
     * @param receiverAllAddressTranslate the receiverAllAddressTranslate to set
     */
    public void setReceiverAllAddressTranslate(String receiverAllAddressTranslate) {
        this.receiverAllAddressTranslate = receiverAllAddressTranslate;
    }

    /**
     * @return the packInsuranceValue
     */
    public Double getPackInsuranceValue() {
        return packInsuranceValue;
    }

    /**
     * @param packInsuranceValue the packInsuranceValue to set
     */
    public void setPackInsuranceValue(Double packInsuranceValue) {
        this.packInsuranceValue = packInsuranceValue;
    }

    /**
     * @return the packSpecial
     */
    public Long getPackSpecial() {
        return packSpecial;
    }

    /**
     * @param packSpecial the packSpecial to set
     */
    public void setPackSpecial(Long packSpecial) {
        this.packSpecial = packSpecial;
    }

    /**
     * @return the packRemark
     */
    public String getPackRemark() {
        return packRemark;
    }

    /**
     * @param packRemark the packRemark to set
     */
    public void setPackRemark(String packRemark) {
        this.packRemark = packRemark;
    }

    /**
     * @return the packWeight
     */
    public Double getPackWeight() {
        return packWeight;
    }

    /**
     * @param packWeight the packWeight to set
     */
    public void setPackWeight(Double packWeight) {
        this.packWeight = packWeight;
    }

    /**
     * @return the packWeightUnit
     */
    public String getPackWeightUnit() {
        return packWeightUnit;
    }

    /**
     * @param packWeightUnit the packWeightUnit to set
     */
    public void setPackWeightUnit(String packWeightUnit) {
        this.packWeightUnit = packWeightUnit;
    }

    /**
     * @return the packLength
     */
    public Double getPackLength() {
        return packLength;
    }

    /**
     * @param packLength the packLength to set
     */
    public void setPackLength(Double packLength) {
        this.packLength = packLength;
    }

    /**
     * @return the packLengthUnit
     */
    public String getPackLengthUnit() {
        return packLengthUnit;
    }

    /**
     * @param packLengthUnit the packLengthUnit to set
     */
    public void setPackLengthUnit(String packLengthUnit) {
        this.packLengthUnit = packLengthUnit;
    }

    /**
     * @return the packWidth
     */
    public Double getPackWidth() {
        return packWidth;
    }

    /**
     * @param packWidth the packWidth to set
     */
    public void setPackWidth(Double packWidth) {
        this.packWidth = packWidth;
    }

    /**
     * @return the packWidthUnit
     */
    public String getPackWidthUnit() {
        return packWidthUnit;
    }

    /**
     * @param packWidthUnit the packWidthUnit to set
     */
    public void setPackWidthUnit(String packWidthUnit) {
        this.packWidthUnit = packWidthUnit;
    }

    /**
     * @return the packHeight
     */
    public Double getPackHeight() {
        return packHeight;
    }

    /**
     * @param packHeight the packHeight to set
     */
    public void setPackHeight(Double packHeight) {
        this.packHeight = packHeight;
    }

    /**
     * @return the packHeightUnit
     */
    public String getPackHeightUnit() {
        return packHeightUnit;
    }

    /**
     * @param packHeightUnit the packHeightUnit to set
     */
    public void setPackHeightUnit(String packHeightUnit) {
        this.packHeightUnit = packHeightUnit;
    }

    /**
     * @return the packVolume
     */
    public Double getPackVolume() {
        return packVolume;
    }

    /**
     * @param packVolume the packVolume to set
     */
    public void setPackVolume(Double packVolume) {
        this.packVolume = packVolume;
    }

    /**
     * @return the packVolumeUnit
     */
    public String getPackVolumeUnit() {
        return packVolumeUnit;
    }

    /**
     * @param packVolumeUnit the packVolumeUnit to set
     */
    public void setPackVolumeUnit(String packVolumeUnit) {
        this.packVolumeUnit = packVolumeUnit;
    }

    /**
     * @return the goodsValue
     */
    public Double getGoodsValue() {
        return goodsValue;
    }

    /**
     * @param goodsValue the goodsValue to set
     */
    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    /**
     * @return the itemsValue
     */
    public Double getItemsValue() {
        return itemsValue;
    }

    /**
     * @param itemsValue the itemsValue to set
     */
    public void setItemsValue(Double itemsValue) {
        this.itemsValue = itemsValue;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the isLowdensitycargo
     */
    public String getIsLowdensitycargo() {
        return isLowdensitycargo;
    }

    /**
     * @param isLowdensitycargo the isLowdensitycargo to set
     */
    public void setIsLowdensitycargo(String isLowdensitycargo) {
        this.isLowdensitycargo = isLowdensitycargo;
    }

    /**
     * @return the orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * @param orderType the orderType to set
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the totalServiceFee
     */
    public Double getTotalServiceFee() {
        return totalServiceFee;
    }

    /**
     * @param totalServiceFee the totalServiceFee to set
     */
    public void setTotalServiceFee(Double totalServiceFee) {
        this.totalServiceFee = totalServiceFee;
    }

    /**
     * @return the buyServiceFee
     */
    public Double getBuyServiceFee() {
        return buyServiceFee;
    }

    /**
     * @param buyServiceFee the buyServiceFee to set
     */
    public void setBuyServiceFee(Double buyServiceFee) {
        this.buyServiceFee = buyServiceFee;
    }

    /**
     * @return the codSplitFee
     */
    public Double getCodSplitFee() {
        return codSplitFee;
    }

    /**
     * @param codSplitFee the codSplitFee to set
     */
    public void setCodSplitFee(Double codSplitFee) {
        this.codSplitFee = codSplitFee;
    }

    /**
     * @return the reservedField01
     */
    public String getReservedField01() {
        return reservedField01;
    }

    /**
     * @param reservedField01 the reservedField01 to set
     */
    public void setReservedField01(String reservedField01) {
        this.reservedField01 = reservedField01;
    }

    /**
     * @return the reservedField02
     */
    public String getReservedField02() {
        return reservedField02;
    }

    /**
     * @param reservedField02 the reservedField02 to set
     */
    public void setReservedField02(String reservedField02) {
        this.reservedField02 = reservedField02;
    }

    /**
     * @return the reservedField03
     */
    public String getReservedField03() {
        return reservedField03;
    }

    /**
     * @param reservedField03 the reservedField03 to set
     */
    public void setReservedField03(String reservedField03) {
        this.reservedField03 = reservedField03;
    }

    /**
     * @return the reservedField04
     */
    public String getReservedField04() {
        return reservedField04;
    }

    /**
     * @param reservedField04 the reservedField04 to set
     */
    public void setReservedField04(String reservedField04) {
        this.reservedField04 = reservedField04;
    }

    /**
     * @return the reservedField05
     */
    public String getReservedField05() {
        return reservedField05;
    }

    /**
     * @param reservedField05 the reservedField05 to set
     */
    public void setReservedField05(String reservedField05) {
        this.reservedField05 = reservedField05;
    }

    /**
     * @return the reservedField06
     */
    public String getReservedField06() {
        return reservedField06;
    }

    /**
     * @param reservedField06 the reservedField06 to set
     */
    public void setReservedField06(String reservedField06) {
        this.reservedField06 = reservedField06;
    }

    /**
     * @return the reservedField07
     */
    public String getReservedField07() {
        return reservedField07;
    }

    /**
     * @param reservedField07 the reservedField07 to set
     */
    public void setReservedField07(String reservedField07) {
        this.reservedField07 = reservedField07;
    }

    /**
     * @return the reservedField08
     */
    public String getReservedField08() {
        return reservedField08;
    }

    /**
     * @param reservedField08 the reservedField08 to set
     */
    public void setReservedField08(String reservedField08) {
        this.reservedField08 = reservedField08;
    }

    /**
     * @return the reservedField09
     */
    public String getReservedField09() {
        return reservedField09;
    }

    /**
     * @param reservedField09 the reservedField09 to set
     */
    public void setReservedField09(String reservedField09) {
        this.reservedField09 = reservedField09;
    }

    /**
     * @return the reservedField10
     */
    public String getReservedField10() {
        return reservedField10;
    }

    /**
     * @param reservedField10 the reservedField10 to set
     */
    public void setReservedField10(String reservedField10) {
        this.reservedField10 = reservedField10;
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
     * @return the sendDate
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate the sendDate to set
     */
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * @return the orderCustomsDate
     */
    public String getOrderCustomsDate() {
        return orderCustomsDate;
    }

    /**
     * @param orderCustomsDate the orderCustomsDate to set
     */
    public void setOrderCustomsDate(String orderCustomsDate) {
        this.orderCustomsDate = orderCustomsDate;
    }

    /**
     * @return the orderSigninDate
     */
    public String getOrderSigninDate() {
        return orderSigninDate;
    }

    /**
     * @param orderSigninDate the orderSigninDate to set
     */
    public void setOrderSigninDate(String orderSigninDate) {
        this.orderSigninDate = orderSigninDate;
    }

    /**
     * @return the orderAccountOutDate
     */
    public String getOrderAccountOutDate() {
        return orderAccountOutDate;
    }

    /**
     * @param orderAccountOutDate the orderAccountOutDate to set
     */
    public void setOrderAccountOutDate(String orderAccountOutDate) {
        this.orderAccountOutDate = orderAccountOutDate;
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
     * @return the isAssigned
     */
    public Boolean getIsAssigned() {
        return isAssigned;
    }

    /**
     * @param isAssigned the isAssigned to set
     */
    public void setIsAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
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
     * @return the translateUserId
     */
    public Long getTranslateUserId() {
        return translateUserId;
    }

    /**
     * @param translateUserId the translateUserId to set
     */
    public void setTranslateUserId(Long translateUserId) {
        this.translateUserId = translateUserId;
    }

    /**
     * @return the isUpstreamChargeOff
     */
    public String getIsUpstreamChargeOff() {
        return isUpstreamChargeOff;
    }

    /**
     * @param isUpstreamChargeOff the isUpstreamChargeOff to set
     */
    public void setIsUpstreamChargeOff(String isUpstreamChargeOff) {
        this.isUpstreamChargeOff = isUpstreamChargeOff;
    }

    /**
     * @return the isDownstreamChargeOff
     */
    public String getIsDownstreamChargeOff() {
        return isDownstreamChargeOff;
    }

    /**
     * @param isDownstreamChargeOff the isDownstreamChargeOff to set
     */
    public void setIsDownstreamChargeOff(String isDownstreamChargeOff) {
        this.isDownstreamChargeOff = isDownstreamChargeOff;
    }

    /**
     * @return the translateStateCode
     */
    public String getTranslateStateCode() {
        return translateStateCode;
    }

    /**
     * @param translateStateCode the translateStateCode to set
     */
    public void setTranslateStateCode(String translateStateCode) {
        this.translateStateCode = translateStateCode;
    }

    /**
     * @return the linearMeasure
     */
    public String getLinearMeasure() {
        return linearMeasure;
    }

    /**
     * @param linearMeasure the linearMeasure to set
     */
    public void setLinearMeasure(String linearMeasure) {
        this.linearMeasure = linearMeasure;
    }

    /**
     * @return the translateStateDesc
     */
    public String getTranslateStateDesc() {
        return translateStateDesc;
    }

    /**
     * @param translateStateDesc the translateStateDesc to set
     */
    public void setTranslateStateDesc(String translateStateDesc) {
        this.translateStateDesc = translateStateDesc;
    }

    /**
     * @return the translateUserName
     */
    public String getTranslateUserName() {
        return translateUserName;
    }

    /**
     * @param translateUserName the translateUserName to set
     */
    public void setTranslateUserName(String translateUserName) {
        this.translateUserName = translateUserName;
    }

    /**
     * @return the isCanTranslate
     */
    public Boolean getIsCanTranslate() {
        return isCanTranslate;
    }

    /**
     * @param isCanTranslate the isCanTranslate to set
     */
    public void setIsCanTranslate(Boolean isCanTranslate) {
        this.isCanTranslate = isCanTranslate;
    }

    /**
     * @return the items
     */
    public List<BillItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    /**
     * @return the itemIds
     */
    public Long[] getItemIds() {
        return itemIds;
    }

    /**
     * @param itemIds the itemIds to set
     */
    public void setItemIds(Long[] itemIds) {
        this.itemIds = itemIds;
    }

    /**
     * @return the orderItemNames
     */
    public String[] getOrderItemNames() {
        return orderItemNames;
    }

    /**
     * @param orderItemNames the orderItemNames to set
     */
    public void setOrderItemNames(String[] orderItemNames) {
        this.orderItemNames = orderItemNames;
    }

    /**
     * @return the agencyFund
     */
    public Double getAgencyFund() {
        return agencyFund;
    }

    /**
     * @param agencyFund the agencyFund to set
     */
    public void setAgencyFund(Double agencyFund) {
        this.agencyFund = agencyFund;
    }

    /**
     * @return the bigPen
     */
    public String getBigPen() {
        return bigPen;
    }

    /**
     * @param bigPen the bigPen to set
     */
    public void setBigPen(String bigPen) {
        this.bigPen = bigPen;
    }

    /**
     * @return the mailNo
     */
    public String getMailNo() {
        return mailNo;
    }

    /**
     * @param mailNo the mailNo to set
     */
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    /**
     * @return the orderState
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * @param orderState the orderState to set
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getPackLinearMeasure() {
        return packLinearMeasure;
    }

    public void setPackLinearMeasure(String packLinearMeasure) {
        this.packLinearMeasure = packLinearMeasure;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the upstreamCompanyLogoName
     */
    public String getUpstreamCompanyLogoName() {
        return upstreamCompanyLogoName;
    }

    /**
     * @param upstreamCompanyLogoName the upstreamCompanyLogoName to set
     */
    public void setUpstreamCompanyLogoName(String upstreamCompanyLogoName) {
        this.upstreamCompanyLogoName = upstreamCompanyLogoName;
    }

    /**
     * @return the receiverPostcode7Dash
     */
    public String getReceiverPostcode7Dash() {
        return receiverPostcode7Dash;
    }

    /**
     * @param receiverPostcode7Dash the receiverPostcode7Dash to set
     */
    public void setReceiverPostcode7Dash(String receiverPostcode7Dash) {
        this.receiverPostcode7Dash = receiverPostcode7Dash;
    }

    public String getReceiverAddressAfterPrint() {
        return receiverAddressAfterPrint;
    }

    public void setReceiverAddressAfterPrint(String receiverAddressAfterPrint) {
        this.receiverAddressAfterPrint = receiverAddressAfterPrint;
    }

    /**
     * @return the senderNameTranslate
     */
    public String getSenderNameTranslate() {
        return senderNameTranslate;
    }

    /**
     * @param senderNameTranslate the senderNameTranslate to set
     */
    public void setSenderNameTranslate(String senderNameTranslate) {
        this.senderNameTranslate = senderNameTranslate;
    }

    /**
     * @return the receiverNameTranslate
     */
    public String getReceiverNameTranslate() {
        return receiverNameTranslate;
    }

    /**
     * @param receiverNameTranslate the receiverNameTranslate to set
     */
    public void setReceiverNameTranslate(String receiverNameTranslate) {
        this.receiverNameTranslate = receiverNameTranslate;
    }

    public Long getGlsWayBillNo() {
        return glsWayBillNo;
    }

    public void setGlsWayBillNo(Long glsWayBillNo) {
        this.glsWayBillNo = glsWayBillNo;
    }

	public Double getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(Double declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getOriginOfCountry() {
		return originOfCountry;
	}

	public void setOriginOfCountry(String originOfCountry) {
		this.originOfCountry = originOfCountry;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}