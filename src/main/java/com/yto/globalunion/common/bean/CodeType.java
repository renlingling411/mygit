/*
 * 项目名: 全球大联盟
 * 文件名: CodeType.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

/**
 *  字典表对应类型
 * @author penglan
 *
 */
public enum CodeType {
    /*
     * ------------------基础数据字典-------------------
     */
    BASEDATA_PORT_KIND("basedata_port_portKind"), BASEDATA_PORT_TYPE("basedata_port_portType"), BASEDATA_PORT_ALLOWFOREIGN("basedata_port_allowForeign"), BASEDATA_PORT_USESTATUS("basedata_port_useStatus"),

    /*
     * 运单管理字典
     */
    WAYBILL_ORDER_DEFINED_ISLOWDENSITYCARGO("waybill_order_isLowdensitycargo"), WAYBILL_ORDER_DEFINED_ORDERTYPE("waybill_order_orderType"), WAYBILL_ORDER_DEFINED_SERVICETYPE("waybill_order_serviceType"), WAYBILL_ORDER_DEFINED_ISTRANSLATED("waybill_order_translateState"),

    /*
     * 国际价格管理字典
     */
    GLOBALPRICE_REGION_COMPANYTYPE("globalprice_region_companytype"), GLOBALPRICE_REGION_REGIONTYPE("globalprice_region_regiontype"), GLOBAL_REGION_REGIONDIMENSION("globalprice_region_regiondimension"),

    /*
     * 账单管理字典
     */
    BILL_PAYORINCOME_WAYBILLSTATUS("bill_payorincome_waybillstatus"),
    
    /*
     * 报关清关管理字典
     */
    BASEDATA_BLC_ENCODING("basedata_customclearanceCompanyManagement_encoding"),
    /*
     * 上下游公司管理字典
     */
    BASEDATA_COMPANY_ACHIEVE_RATE("basedata_company_achieve_rate_type"),
    BASEDATA_COMPANY_OPERATE_DATE_FORMAT("basedata_company_operate_date_format"),
    /*
     * 其他字典
     */
    ;

    /**
     * 字典表对应的标识
     */
    private String codeTypeMark;

    CodeType(String codeTypeMark) {
        this.codeTypeMark = codeTypeMark;
    }

    /**
     * @return the codeType
     */
    public String getCodeTypeMark() {
        return codeTypeMark;
    }
}
