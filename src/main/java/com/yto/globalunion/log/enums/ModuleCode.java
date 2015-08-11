/*
 * 项目名: 全球大联盟
 * 文件名: ModuleCode.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.log.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author murphy
 *
 */
public enum ModuleCode {
    DEFAULT(000, "Module.Default"), //
    /*登录模块 100-200*/
    LOGIN(100, "Module.Login"), //
    LOGOUT(101, "Module.LogOut"),

    /*运单管理模块 200-300*/
    YTO_ELECTRONIC_WAYBILL_PRINT(200, "Module.Waybill.YTOPrint"), //
    ORDER_IMPORT(201, "Module.Waybill.OrderImport"), // 运单导入
    ORDER_TRANSLATE(202, "Module.Waybill.Translate"), //
    TRACKING_INFORMATION(203, "Module.Waybill.TrackingInformation"), //
    ORDER_INEXPORT(204, "Module.Waybill.BillInExport"), //
    ORDER_REPORTEXPORT(205, "Module.Waybill.OrderReportExport"), //
    ORDER_ENTRY(206, "Module.Waybill.OrderEntry"), // 运单录入
    XN_IMPORT(207, "Module.Waybill.XnImport"), // 西浓运单导入
    XN_EXPORT(208, "Module.Waybill.XnExport"), // 西浓运单导出
    BLCWAYBILL_IMPORT(209,"Module.Waybill.BLCImport"),//清关运单信息excel导入
    EMS_FORECAST_EXPORT(211,"Module.Waybill。EmsForecastExport"),//ems 预报导出
    EMS_PRINT(212,"Module.Waybill.EmsPrint"),//ems 面单打印
    
    /*账单管理模块 300-400*/
    BILL(300, "Module.accountManagement.Bill"), BILL_ADJUSTMENT(301, "Module.accountManagement.BillAdjustment"), //
    RECONCILIATIONNOTIFYCATION(302, "Module.accountManagement.ReconciliationNofication"),

    
    /*国际件价格模块 400-500*/
    REGION_CLEAR_FEES(400, "Module.GlobalPrice.RegionClearFee"), //
    REGION(401, "Module.GlobalPrice.Region"),
    /*权限管理模块 500-600*/
    USERMANGEMENT(500, "Module.Privilege.User"), //
    ROLEMANAGEMENT(501, "Module.Privilege.Role"), //
    ASSIGN_PRIVILEGE(502, "Module.Privilege.Safety"), //
    /*日志管理 600-700*/
    LOG_LOGIN(600, "Module.Log.LoginLog"), //
    LOG_OPEARTION(601, "Module.Log.OperationLog"),
    /*基础数据模块 700-800 */
    CURRENCY(700, "Module.Basedata.Currency"), //
    PORT(701, "Module.Basedata.Port"), // 进出口岸
    COMPANY(702, "Module.Basedata.Company"), //
    FLIGHT(703, "Module.Basedata.Flight"), //
    LENGTH_CONVERSION(704, "Module.Basedata.LengthConversion"), //
    WEIGHT_CONVERSION(705, "Module.Basedata.WeightConversion"), //
    EXPRESS_STATUS(712, "Module.Basedata.ExpressStatus"), //
    PRODUCT(710, "Module.Basedata.Product"), //
    BLC(711, "Module.Basedata.BLC"), //

    FEES(706, "Module.Basedata.Fees"), //
    AIRPORT(707, "Module.Basedata.Airport"), //
    ADDRESS(708, "Module.Basedata.Address"), //
    RATE(709, "Module.Basedata.Rate"), DESTPOINT(710, "Module.Basedata.Destpoint"),
    /*关务模块800-900*/
    CUSTOM_CLEARANCEINFOUPDATE(800, "Module.Custom.ClearanceInfoUpdate"), //
    CUSTOM_CLEARANCEINFOMANAGEMENT(801, "Module.Custom.ClearanceInfoManagement"), CUSTOM_COMPANYNAMEANDAGREEMENTMANAGEMENT(802, "Module.Custom.CompanyNameAndAgreementManagement"),
    /*接口模块900-999*/
    INTERFACE(900, "Module.Interface"), // 接口模块

    ;
    private int                                         code;
    private String                                      key;

    private static final Map<Integer, List<ModuleCode>> MAP          = Arrays.stream(ModuleCode.values()).collect(Collectors.groupingBy(ModuleCode::getCode));
    private static final List<ModuleCode>               DEFAULT_LIST = Arrays.asList(DEFAULT);

    private ModuleCode(int code, String key) {
        this.code = code;
        this.key = key;
    }

    public int getCode() {
        return code;
    }

    public String getKey() {
        return key;
    }

    public static ModuleCode getModuleCode(int code) {
        return MAP.getOrDefault(code, DEFAULT_LIST).get(0);
    }
}
