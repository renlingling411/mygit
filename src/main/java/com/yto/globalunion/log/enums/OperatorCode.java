/*
\ * 项目名: 全球大联盟
 * 文件名: OperatorCode.java
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
public enum OperatorCode {
    DEFAULT(000, "Operator.Default"), //

    ADD(100, "Operator.Add"), //

    UPDATE(200, "Operator.Update"), //

    UPDATE_SEARCH(201, "Operator.Update.Search"), //

    DELETE(300, "Operator.Delete"), //

    SEARCH(400, "Operator.Search"), //
    SEARCH_PREVIEW_SINGLE(401, "Operate.Search.Preview.Single"),

    EXCEL_IMPORT(500, "Excel.Import"), //
    EXCEL_EXPORT(501, "Excel.Export"), //
    DAT_IMPORT(502, "Dat.Import"),

    PRINT(600, "Operator.Print"), //
    PRINT_BATCH(601, "Operator.Print.Batch"), //

    LOGIN_IN(700, "Operator.Login"), //
    LOGIN_OUT(701, "Operator.LogOut"), //

    RESET_PWD(703, "Operator.Reset.Pwd"), //
    VALIDATE(704, "Operator.Validate"), //

    /*
     * 一些特殊的按钮权限，不在上述之中
     */
    SPEICIAL_TRANSLATE_MARK_TASK(800, "Special.Translate.MarkTask"), // 运单翻译标记我的任务
    SPEICIAL_TRANSLATE_ORDER_TRANSLATE(801, "Special.Translate.Order.Translate"), // 运单翻译
    SPECIAL_PRIVILEGE_ASSIGN(802, "Special.Privilege.Assign"), // 权限管理之分配权限
    CREATEBILL(803, "Operator.createBill"), // 生成账单
    SAVEBILL(804, "Operator.saveBill"), // 保存账单
    SAVEANDPRINTBILL(805, "OPerator.saveAndPrintBill"), // 保存并打印账单
    SPEICIAL_CUSTOM_BIND_BATCHID(806, "Special.Custom.BindBatchId"), // 总运单号绑定
    SPECIAL_PRIVILEGE_FUNCTIONTREE(807, "Special.Privilege.GetFunctionTree"), //
    SPEICIAL_TRANSLATE_ING(808, "Special.Translate.Order.Translating"), // 运单翻译
    SPEICIAL_TRANSLATE_COMPLETED(809, "Special.Translate.Order.TranslateCompleted"), // 运单翻译
    /*接口相关操作 900-999*/
    INTERFACE_WAYBILL_IMPORT_REALTIME(900, "Waybill.Realtime"), // 实时接收运单
    INTERFACE_SHIPMENT_REALTIME_YTO(901, "Shipments.Realtime.Yto"), // 实时接收走件(圆通)
    INTERFACE_SHIPMENT_REALTIME_STANDARD(902, "Shipments.Realtime.Standard"), // 实时接收走件(标准)
    INTERFACE_WAYBILL_ORDER_ENTRY(903, "Waybill.Entry")
    ;
    
    private int                                           code;
    private String                                        key;

    private static final Map<Integer, List<OperatorCode>> MAP          = Arrays.stream(OperatorCode.values()).collect(Collectors.groupingBy(OperatorCode::getCode));
    private static final List<OperatorCode>               DEFAULT_LIST = Arrays.asList(DEFAULT);

    private OperatorCode(int code, String key) {
        this.code = code;
        this.key = key;
    }

    public int getCode() {
        return code;
    }

    public String getKey() {
        return key;
    }

    public static OperatorCode getOperatorCode(int code) {
        return MAP.getOrDefault(code, DEFAULT_LIST).get(0);
    }
}
