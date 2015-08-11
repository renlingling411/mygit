/*
 * 项目名: 全球大联盟
 * 文件名: RequestType.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求类型
 *
 * @author penglan
 *
 */
public enum RequestType {

    // 系统全局请求
    /**
     * 默认任务,空
     */
    DEFAULT,
    /**
     * 退出Executor
     */
    EXIT_EXECUTOR,
    /**
     * 退出JobManager
     */
    EXIT_JOB_MANAGER,
    /**
     * 增加一条日志记录
     */
    APPEND_LOG,
    /**
     * 定时任务列表
     */
    COMMON_TIME_TASK_LIST,
    /**
     * 在系统启动时更新定时任务
     */
    COMMON_UPDATE_TIME_TASK_INIT,
    /**
     * 示例Demo
     */
    COMMON_SAMPLEMESSAGEOUT,
    /**
     * 菜单请求
     */
    COMMON_GETMENULIST,
    /**
     * 权限菜单请求
     */
    COMMON_GET_FUNCTIONS_MENU_LIST,
    /**
     * 语言请求
     */
    COMMON_GETLANGUAGELIST,
    /**
     * 字典表对应的请求
     */
    COMMON_CODE_LIST,
    /**
     * 用户模块
     */
    COMMON_USER_GETUSERBYLOGINNAME, COMMON_USER_FINDUSERBYID, COMMON_USER_DISABLE,

    /**
     *
     */
    COMMON_USER_LOGIN, COMMON_USER_LOGOUT, //
    COMMON_SENTEMAIL,

    /*
     * --------------------------------基础数据模块----------------------------
     */

    /**
     * 基础数据-全网网点管理模块
     */
    /**删除网点*/
    BASEDATA_DESTPOINT_DELETEDESTPOINT,
    /**根据条件查询网点*/
    BASEDATA_DESTPOINT_SEARCHDESTPOINTLIST,
    /**导入Excel网点*/
    BASEDATA_DESTPOINT_IMPORTEXCEL,

    /**
     * 基础数据-币种管理模块
     */
    /** 请求币种的所有数据 */
    BASEDATA_CURRENCY_GETCURRENCYLIST,
    /** 根据ID请求对应的币种 */
    BASEDATA_CURRENCY_GETCURRENCYBYID,
    /** 增加币种 */
    BASEDATA_CURRENCY_ADDCURRENCY,
    /** 修改币种 */
    BASEDATA_CURRENCY_UPDATECURRENCY,
    /** 删除币种 */
    BASEDATA_CURRENCY_DELETECURRENCY,
    /** 根据条件搜索币种 */
    BASEDATA_CURRENCY_SEARCHCURRENCYLIST,
    /** 搜索所有的币种 */
    BASEDATA_CURRENCY_GETALLCURRENCYLIST, BASEDATA_CURRENCY_SEARCHCURRENCY_FORADDORUPDATE,

    /**
     * 基础数据-长度换算管理模块
     */
    /** 请求长度换算表的所有数据 */
    BASEDATA_LENGTHCONVERSION_GETLENGTHCONVERSIONLIST,
    /** 根据id查找数据 */
    BASEDATA_LENGTHCONVERSION_GETLENGTHCONVERSIONBYID,
    /** 增加或者修改长度换算记录 */
    BASEDATA_LENGTHCONVERSION_ADD, BASEDATA_LENGTHCONVERSION_UPDATE,
    /** 删除长度换算记录 */
    BASEDATA_LENGTHCONVERSION_DELETE,
    /** 根据条件查询长度换算记录 */
    BASEDATA_LENGTHCONVERSION_SEARCH,
    /** 新增修改后刷新 */
    BASEDATA_LENGTHCONVERSION_SEARCHFORADDORUPDATE,
    /** 验证是否存在相同语言版本的相同长度单位符号的信息 */
    BASEDATA_LENGTHCONVERSION_VALIDATEEXIST,
    /** 根据长度单位符合查询换算比 */
    BASEDATA_LENGTHCONVERSION_QUERYCONVERSIONRATE,

    /**
     * 基础数据-重量换算管理模块
     */
    /** 重量单位符合*/
    BASEDATA_WEIGHTCONVERSION_GETALLWEIGHTUNITSYMBOLLIST,
    /** 根据多语言Code查询数据 */
    BASEDATA_WEIGHTCONVERSION_GETLISTBYLANGCODE,
    /** 请求重量换算表的所有数据 */
    BASEDATA_WEIGHTCONVERSION_GETWEIGHTCONVERSIONLIST,
    /** 根据id查找数据 */
    BASEDATA_WEIGHTCONVERSION_GETWEIGHTCONVERSIONBYID,
    /** 增加或者修改重量换算记录 */
    BASEDATA_WEIGHTCONVERSION_ADD, BASEDATA_WEIGHTCONVERSION_UPDATE,
    /** 删除重量换算记录 */
    BASEDATA_WEIGHTCONVERSION_DELETE,
    /** 根据条件查询重量换算记录 */
    BASEDATA_WEIGHTCONVERSION_SEARCH,
    /** 新增修改后刷新  */
    BASEDATA_WEIGHTCONVERSION_SEARCHFORADDORUPDATE,
    /** 验证是否存在相同语言版本的相同重量单位符号的信息 */
    BASEDATA_WEIGHTCONVERSION_VALIDATEEXIST,
    /** 根据重量单位符合查询换算比 */
    BASEDATA_WEIGHTCONVERSION_QUERYCONVERSIONRATE, BASEDATA_WEIGHTCONVERSION_GETALLWEIGHTCONVERSIONLIST,

    /**
     * 基础数据-费用管理模块
     */
    /** 请求费用表的所有数据 */
    BASEDATA_FEES_GETFEESLIST,
    /** 根据id查找数据 */
    BASEDATA_FEES_GETFEESBYID,
    /** 增加或者修改费用记录 */
    BASEDATA_FEES_UPDATE, BASEDATA_FEES_ADD,
    /** 删除记录 */
    BASEDATA_FEES_DELETE,
    /** 根据条件查询费用记录 */
    BASEDATA_FEES_SEARCH, BASEDATA_FEES_GETALLFEESLIST, BASEDATA_FEES_VALIDATION, BASEDATA_FEES_SEARCHFEES,

    /**
     * 基础数据-汇率管理模块
     */
    /** 请求汇率管理表中的数据 */
    BASEDATA_RATE_GETRATELIST,
    /** 根据id查找数据 */
    BASEDATA_RATE_GETRATEBYID,

    BASEDATA_RATE_ADDRATE,
    /** 修改汇率记录 */
    BASEDATA_RATE_UPDATERATE,
    /** 删除汇率信息记录 */
    BASEDATA_RATE_DELETERATE,
    /** 根据条件查询汇率记录 */
    BASEDATA_RATE_SEARCHRATELIST,
    /** 增加和修改后查询 */
    BASEDATA_RATE_SEARCHRATELISTAFTERMODIFY,

    /**
     * 基础数据-上下游公司管理
     */
    /** 请求上下游公司管理表中的数据 */
    BASEDATA_COMPANY_GETCOMPANYLIST,
    /** 请求地区表中的数据 */
    BASEDATA_COMPANY_GETALLADDRESSLIST,
    /** 根据id查找数据 */
    BASEDATA_COMPANY_GETCOMPANYBYID,
    /** 增加或者修改上下游公司记录 */
    BASEDATA_COMPANY_ADD, BASEDATA_COMPANY_UPDATE,
    /** 删除上下游公司信息记录 */
    BASEDATA_COMPANY_DELETE,
    /** 根据条件查询上下游公司记录 */
    BASEDATA_COMPANY_SEARCH,
    /** 请求所有上下游公司管理表中的数据 */
    BASEDATA_COMPANY_GETALLCOMPANYLIST,
    /** 验证是否存在相同语言版本的相同上下游公司的信息 */
    BASEDATA_COMPANY_VALIDATEEXIST,
    /** 验证是否存在相同的商家编码 */
    BASEDATA_COMPANY_VALIDATE_CUSTOMERID_EXIST,
    /** 验证是否存在标准状态码 */
    BASEDATA_COMPANY_VALIDATESTATUSEXIST,
    /** 根据公司编号符合查询电话号码 */
    BASEDATA_COMPANY_QUERYCOMPANYINFO,
    /** 根据用户权限查找公司名称 */
    BASEDATA_COMPANY_GETALLCOMPANYLISTBYAUTH,
    /** 根据公司编号查询公司接口密钥 */
    BASEDATA_COMPANY_GETSECUTITYKEY,

    /**
     * 基础数据-进出口岸管理模块
     */
    /** 请求口岸的所有数据 */
    BASEDATA_PORT_GETPORTLIST,
    /** 根据ID请求对应的口岸 */
    BASEDATA_PORT_GETPORTBYID,
    /** 增加口岸 */
    BASEDATA_PORT_UPDATEPORT,
    /** 修改口岸 */
    BASEDATA_PORT_ADDPORT,
    /** 删除口岸 */
    BASEDATA_PORT_DELETEPORT,
    /** 根据条件搜索口岸 */
    BASEDATA_PORT_SEARCHPORTLIST,
    /** 根据条件搜索口岸(不显示) */
    BASEDATA_PORT_SEARCHPORTLISTNOTSEE,
    /** 根据口岸编号自动获得下拉框信息 */
    BASEDATA_PORT_QUERYPORTINFO,
    /** 将excel导入数据库 */
    BASEDATA_PORT_IMPORTEXCEL,
    /**
     * 基础数据-机场管理
     */
    /** 请求机场的所有数据 */
    BASEDATA_AIRPORT_GETAIRPORTLIST,
    /** 根据ID请求对应的机场 */
    BASEDATA_AIRPORT_GETAIRPORTBYID,
    /** 增加机场 */
    BASEDATA_AIRPORT_ADDAIRPORT,
    /** 修改机场 */
    BASEDATA_AIRPORT_UPDATEAIRPORT,
    /** 删除机场 */
    BASEDATA_AIRPORT_DELETEAIRPORT,
    /** 根据条件搜索机场 */
    BASEDATA_AIRPORT_SEARCHAIRPORTLIST,
    /** 获得所有机场信息给航班 */
    BASEDATA_AIRPORT_GETALLAIRPORTLIST,
    /** 验证是否存在相同语言版本的相同三字代码的记录 */
    BASEDATA_AIRPORT_VALIDATEEXIST,
    /** 如果有相同的三字代码，自动填充四字代码 */
    BASEDATA_AIRPORT_QUERYBYIATACODE,
    /** 机场管理导入Excel */
    BASEDATA_AIRPORT_IMPORTEXCEL,
    /** 操作之后的查询 */
    BASEDATA_AIRPORT_SEARCHAIRPORTOPERATION,

    /**
     * 基础数据-地址管理模块
     */
    /** 增加地址 */
    BASEDATA_ADDRESS_ADDADDRESS,
    /** 修改地址*/
    BASEDATA_ADDRESS_UPDATEADDRESS,
    /** 查询地址所有数据 */
    BASEDATA_ADDRESS_GETADDRESSLIST,
    /** 删除地址数据 */
    BASEDATA_ADDRESS_DELETEADDRESS,
    /** 修改地址数据 */
    BASEDATA_ADDRESS_GETADDRESSBYID,
    /** 根据条件查找数据 */
    BASEDATA_ADDRESS_SEARCHADDRESSLIST,
    /** 根据语言查询出所有的国家名称 */
    BASEDATA_ADDRESS_GETALLCOUNTRYLIST,
    /** 根据参数查询是否存在相同的国家名称 */
    BASEDATA_ADDRESS_VALIDATENAME,
    /** 根据参数校检编号是否合法 */
    BASEDATA_ADDRESS_VALIDATEPARENTID,
    /** 根据所给的国家名称查找出所有的下一级单位地区 */
    BASEDATA_ADDRESS_GETPROVINCELIST,
    /** 地区管理excel导入 */
    BASEDATA_ADDRESS_IMPORTEXCEL,
    /** 地区管理操作之后的查询 */
    BASEDATA_ADDRESS_SEARCHADDRESSOPERATION,
    /**
     * 基础数据-快件状态管理模块
     */
    /** 增加或者修改快件状态 */
    BASEDATA_EXPRESSSTATUS_ADDEXPRESSSTATUS, BASEDATA_EXPRESSSTATUS_UPDATEEXPRESSSTATUS,
    /** 获取快件状态列表 */
    BASEDATA_EXPRESSSTATUS_GETEXPRESSSTATUSLIST,
    /** 根据ID得到对应的快件状态 */
    BASEDATA_EXPRESSSTATUS_GETEXPRESSSTATUSBYID,
    /** 删除快件状态 */
    BASEDATA_EXPRESSSTATUS_DELETEEXPRESSSTATUS,
    /** 根据条件搜索快件状态 */
    BASEDATA_EXPRESSSTATUS_SEARCHEXPRESSSTATUSLIST,
    /** 验证相同语言版本的清关公司编号 */
    BASEDATA_EXPRESSSTATUS_VALIDATEEXIST, //
    BASEDATA_EXPRESSSTATUS_SEARCHEXPRESSSTATUS,

    /**
     * 基础数据-清关公司管理模块
     */
    /** 增加或者修改清关公司 */
    BASEDATA_BLC_ADDBLC, BASEDATA_BLC_UPDATEBLC,
    /** 获取清关公司列表 */
    BASEDATA_BLC_GETBLCLIST,
    /** 根据ID得到对应的清关公司 */
    BASEDATA_BLC_GETBLCBYID,
    /** 删除清关公司 */
    BASEDATA_BLC_DELETEBLC,
    /** 根据条件搜索清关公司 */
    BASEDATA_BLC_SEARCHBLCLIST,
    /** 获取下拉框地址 */
    BASEDATA_BLC_GETALLADDRESSLIST,
    /** 验证相同语言版本的清关公司编号 */
    BASEDATA_BLC_VALIDATEEXIST, //
    /** 查询报关信息*/
    BASEDATA_BLC_QUERYBLCLIST,
    /** 关于不同语言的报关信息 */
    BASEDATA_BLC_SEARCHBLCINFO,
    /**
     * 基础数据-航班管理模块
     */
    /** 请求航班的所有数据 */
    BASEDATA_FLIGHT_GETFLIGHTLIST,
    /** 根据ID请求对应的航班 */
    BASEDATA_FLIGHT_GETFLIGHTBYID,
    /** 增加航班 */
    BASEDATA_FLIGHT_ADDFLIGHT,
    /** 修改航班 */
    BASEDATA_FLIGHT_UPDATEFLIGHT,
    /** 删除航班 */
    BASEDATA_FLIGHT_DELETEFLIGHT,
    /** 根据条件搜索航班 */
    BASEDATA_FLIGHT_SEARCHFLIGHTLIST,
    /** 导入Excel */
    BASEDATA_FLIGHT_IMPORTEXCEL,
    /** 增加或修改时返回查询航班 */
    BASEDATA_FLIGHT_SEARCHADDORUPDATEFLIGHTLIST,

    /**
     * 基础数据-快件状态管理模块
     */
    /** 增加或者修改产品 */
    BASEDATA_PRODUCT_ADDPRODUCT, BASEDATA_PRODUCT_UPDATEPRODUCT,
    /** 获取产品列表 */
    BASEDATA_PRODUCT_GETPRODUCTLIST,
    /** 根据ID得到对应的产品 */
    BASEDATA_PRODUCT_GETPRODUCTBYID,
    /** 删除产品 */
    BASEDATA_PRODUCT_DELETEPRODUCT,
    /** 根据条件搜索产品 */
    BASEDATA_PRODUCT_SEARCHPRODUCTLIST,
    /** 验证相同语言版本的产品编号 */
    BASEDATA_PRODUCT_VALIDATEEXIST,
    /** 根据语言查找产品 */
    BASEDATA_PRODUCT_SEARCHPRODUCTBYLANGCODE,
    /** 根据编号和语言查找产品 */
    BASEDATA_PRODUCT_FINDPRODUCTBYCODEANDLANG, BASEDATA_PRODUCT_FINDPRODUCT, BASEDATA_PRODUCT_FINDFIRSTPRODUCT, BASEDATA_PRODUCT_SEARCHPRODUCT,
    /**
     * 其他模块依次类推，并按照规范来命名 BASEDATA_模块名_请求type名
     */

    /*
     * --------------------------------基础数据模块结束----------------------------
     */

    /*
     * --------------------------------运单管理模块----------------------------
     */
    /*
     * 运单管理-进出港运单管理模块
     */
    /** 请求所有进出港运单数据 */
    WAYBILL_INEXPORTBILL_GETBILLLIST,
    /** 根据条件搜索进出港运单数据 */
    WAYBILL_INEXPORTBILL_SEARCHBILLLIST,
    /** 查询进出港运单详细信息 */
    WAYBILL_INEXPORTBILL_GETBILLDETAILS,
    /** 导出进出港运单信息 */
    WAYBILL_INEXPORTBILL_EXPORT,
    /*
     * 运单管理 进出港运单报表导出
     */
    /** 所有进港数据 */
    WAYBILL_INEXPORTBILL_SEARCHINPORTDATA,
    /** 所有出港数据 */
    WAYBILL_INEXPORTBILL_SEARCHEXPORTDATA,
    /** 所有进港订单详细 */
    WAYBILL_INEXPORTBILL_SEARCHINPORTDETAILS,
    /** 所有出港订单详细 */
    WAYBILL_INEXPORTBILL_SEARCHEXPORTDETAILS,
    /** 所有进港数据 */
    WAYBILL_INEXPORTBILL_SEARCHINPORTDATAForXLS,
    /** 所有出港数据 */
    WAYBILL_INEXPORTBILL_SEARCHEXPORTDATAForXLS,
    /** 所有进港订单详细 */
    WAYBILL_INEXPORTBILL_SEARCHINPORTDETAILSForXLS,
    /** 所有出港订单详细 */
    WAYBILL_INEXPORTBILL_SEARCHEXPORTDETAILSForXLS,
    /** 面单号打印 */
    WAYBILL_PRINT_SINGLE, WAYBILL_PRINT_MULTIPLE, WAYBILL_PRINT_CONFIRM, WAYBILL_PRINT_MULTIPLE_CONFIRM, WAYBILL_PRINT_SEARCHBILLLIST,
    /** DHL特殊的面单打印*/
    WAYBILL_PRINT_SEARCH_DHL, WAYBILL_PRINT_PRINT_DHL, WAYBILL_PRINT_MULTIPLE_CONFIRM_DHL,
    /**运单详情*/
    WAYBILL_DETAIL_VIEW,

    /** ems 面单打印 */
    WAYBILL_PRINT_SEARCH_EMS, WAYBILL_PRINT_PRINT_EMS, WAYBILL_PRINT_MULTIPLE_CONFIRM_EMS,
    /** 速达电子面单打印 */
    WAYBILL_PRINT_MULTIPLE_SUDA_CONFIRM, WAYBILL_SUDA_PRINT_CONFIRM,
    /** USPS电子面单打印 */
    WAYBILL_PRINT_MULTIPLE_USPS_CONFIRM, WAYBILL_USPS_PRINT_CONFIRM,
    /**通用把枪扫描打印查询*/
    GENERAL_GUN_SCAN_PRINT_SEARCH,
    /*
     * 运单翻译
     */
    WAYBILL_TRANSLATE_ORDERQUERYLIST, WAYBILL_TRANSLATE_ORDER_MARK_TASK, WAYBILL_TRANSLATE_ORDER_SEARCHBYID, WAYBILL_TRANSLATE_ORDER_TRANSLATEREQUEST, WAYBILL_TRANSLATE_ORDER_SEARCH, //
    WAYBILL_TRANSLATE_ORDER_TRANSLATEREQUEST_ING, //
    WAYBILL_TRANSLATE_ORDER_TRANSLATEREQUEST_COMPLETED, //
    /**
     * 运单管理-进出港运单报表导出
     */
    /** 请求所有进出港运单信息 */
    BASEDATA_REPORT_GETRATELIST,

    /*
     * 运单信息录入和导入
     */
    /**查询所有运单信息*/
    WAYBILL_ORDERINFO_QUERYORDERLIST,
    /**  搜索查询运单信息*/
    WAYBILL_ORDERINFO_SEARCHORDERLIST,
    /** 将Excel信息导入到数据库 */
    WAYBILL_ORDERINFO_IMPORTEXCEL,
    /** 修改后部分刷新*/
    WAYBILL_ORDERINFO_QUERYORDERINFONOTSEE,
    /** 根据运单号查询运单信息 */
    WAYBILL_ORDERINFO_GETORDERINFOBYID,
    /** 根据运单号删除运单信息 **/
    WAYBILL_ORDERINFO_DELETEORDERINFO,
    /** 请求修改运单信息**/
    WAYBILL_ORDERINFO_UPDATEINFO,
    /** 修改运单信息 **/
    WAYBILL_ORDERINFO_UPDATEORDERINFO,
    /** 请求所有运单信息 */
    WAYBILL_ORDERINFO_GETORDERLIST,
    /** 根据运单号查询运单信息 */
    WAYBILL_ORDERINFO_SEARCHORDERINFOLIST, //
    WAYBILL_ORDERINFO_SCANNING_GUN_ENTRY, //
    WAYBILL_ORDERINFO_SCANNING_GUN_DOWNLOAD_LIST, //
    YTO_TRACKING_INFO_INTERFACE_GET, // 运单信息录入后从圆通接口中获取走件信息
    /*
     * 运单信息录入和导入
     */
    /** 请求所有赱件信息 */
    WAYBILL_MONITORSHIPMENTS_QUERYLIST, WAYBILL_ITEMMONITOR_QUERYLIST,
    /*
     * DHL税费导入
     */
    /** DHL税费导入：将excel信息导入到数据库*/
    WAYBILL_DHLTAXES_IMPORTEXCEL,

    /*
     * 西浓订单导入
     */
    /**将西浓订单导入数据库*/
    WAYBILL_XN_IMPORTDAT,

    /**将西浓订单导出到Excel*/
    WAYBILL_XN_EXPORTEXCEL,
    /**查询西浓订单*/
    WAYBILL_XN_EXPORTSEAECH,

    /*
     * 问题件管理
     */
    /** 请求所有问题件*/
    WAYBILL_ORDERISSUE_GETISSUELIST,
    /** 查询问题件*/
    WAYBILL_ORDERISSUE_SEARCHISSUELIST,
    /** 增加问题件*/
    WAYBILL_ORDERISSUE_ADDISSUELIST,
    /** 修改问题件*/
    WAYBILL_ORDERISSUE_UPDATEISSUELIST,
    /** 获取下一个问题件单号 */
    WAYBILL_ORDERISSUE_GETNEXTISSUENUMBER,
    /** 根据上游公司运单号获取信息*/
    WAYBILL_ORDERISSUE_GETINFOBYUPORDERID,
    /** 根据下游公司运单号获取信息*/
    WAYBILL_ORDERISSUE_GETINFOBYDOWNORDERID,

    /*
     *清关运单信息管理 
     */
    /**请求所有清关运单信息*/
    WAYBILL_CLEARANCE_LOGISTICS_INFO,
    /**清关运单信息excel导入*/
    WAYBILL_BLCWAYBILL_IMPORTEXCEL,
    /*
     * --------------------------------运单管理模块结束----------------------------
     */
    /**
     * --------------------------------tmall订单-------------------------------
     */
    /**
     * 请求所有订单
     */
    TRADE_ORDER_LIST,
    /**
     * 请求物流信息
     */
    TMALL_LOGISTICS_List,
    /**
     * 请求订单详情
     * 
     */
    TMALL_ORDER_DETAIL,
    /**
     * --------------------------------tmall订单结束-------------------------------
     */
    
    /**
     * ------------------------------EMS 预报导出开始----------------------------
     */
    /**
     *查询预报信息
     */
    WAYBILL_EMS_FORECAST_EXPORT_GETBILLLIST,
    /**
     *查询预报信息
     */
    WAYBILL_EMS_FORECAST_EXPORT_SEARCHBILLLIST,
    /**
     * 导出预报信息
     */
    WAYBILL_EMS_FORECAST_EXPORT,
    
    /**
     * ----------------------------EMS 预报导出结束----------------------------
     */
    
    /**
     * ------------------------------EMS 面单打印开始----------------------------
     */
    /**
     *查询ems面单信息
     */
    WAYBILL_EMS_PRINT_GETEMSORDERBYID,
    /**
     * 打印ems面单信息
     */
    WAYBILL_EMS_PRINT,
    
    /**
     * ----------------------------EMS 面单打印结束----------------------------
     */
    
    /**
     * ------------------------------EMS 航班信息开始----------------------------
     */
    /**
     *查询航班信息
     */
    QUERY_TRANSPORT_INFO_LIST,
    /**
     * 新增航班信息
     */
    Add_TRANSPORT_INFO,
    /**
     * 删除航班信息
     */
    DELETE_TRANSPORT_INFO,
    /**
     * 修改时间
     */
    EMS_CHANGE_DATE,
    /**
     * 修改航班信息
     */
    UPDATE_TRANSPORT_INFO,
    /**
     * ----------------------------EMS 航班信息结束----------------------------
     */
    
    /**
     * --------------------------------国际件价格管理模块----------------------------
     */
    /**
     * 国际件价格管理-区域结算费用管理模块
     */
    /** 请求所有区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_GETREGIONCLEARINGFEELIST,
    /** 根据条件搜索区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_SEARCHREGIONCLEARINGFEE,
    /** 根据id搜索区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_GETREGIONCLEARINGFEEBYID,
    /** 更改区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_UPDATEREGIONCLEARINGFEE,
    /** 添加区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_ADDREGIONCLEARINGFEE,
    /** 删除区域结算费用数据 */
    GLOALPRICE_REGIONCLEARINGFEE_DELATEREGIONCLEARINGFEE,
    /** 请求所有区域结算费用 */
    GLOALPRICE_REGIONCLEARINGFEE_GETALLREGIONCLEARINGFEELIST,
    /** 判断是否存在相同上下游公司相同始发地目的地相同价格规则 */
    GLOALPRICE_REGIONCLEARINGFEE_ISEXIST, //
    FINGLANGUAGE, //
    GLOALPRICE_REGIONCLEARINGFEE_FINDUSER, //
    BASEDATA_COMPANY_GETCOMPANYBYIDANDLANG, //
    GLOBALPRICE_REGIONCLEARFEE_FINDFIRSTRREGION, //
    GLOALPRICE_REGIONCLEARINGFEE_SEARCHREGIONCLEARINGFEEBYPARAM, //
    GLOBALPRICE_REGIONCLEARFEE_FINDFIRSTDEPARTINGRREGION, //
    GLOBALPRICE_REGIONCLEARFEE_FINDFIRSTARRIVINGRREGION,
    /**
     * 国际件价格管理-区域管理模块
     */
    /** 添加区域 */
    GLOBALPRICE_REGION_ADDREGION,
    /** 修改区域*/
    GLOBALPRICE_REGION_UPDATEREGION,
    /** 获取所有的区域信息数据 */
    GLOBALPRICE_REGION_GETREGIONLIST,
    /** 根据id查找相对应的区域信息 */
    GLOBALPRICE_REGION_SEARCHBYID,
    /** 根据条件搜索区域信息 */
    GLOBALPRICE_REGION_SEARCHREGIONLIST,
    /** 根据id查找相对应的区域信息 */
    GLOBALPRICE_REGION_SEARCHREGIONBYID,
    /** 根据id删除区域信息 */
    GLOBALPRICE_REGION_DELETEREGION,
    /** 验证区域名称是否存在 */
    GLOBALPRICE_REGION_VALIDATEREGIONNAME,
    /** 查询区域信息返回id和区域名称 */
    GLOBALPRICE_REGION_FINDALLREGION,
    /** excel导入 */
    GLOBALPRICE_REGION_IMPORTEXCEL,
    /** 操作之后的查询 */
    GLOBALPRICE_REGION_SEARCHREGIONOPERATION,

    /**
     * --------------------------------国际件价格管理模块----------------------------
     */
    /**
     * --------------------------------账单管理模块----------------------------
     */
    /**
     * 账单管理-应收/付账单管理
     */
    /** 请求所有运单数据 */
    BILL_PAYORINCOME_GETORDERINFOLIST,
    /** 查询运单数据 */
    BILL_PAYORINCOME_SEARCHORDERINFOLIST,
    /** 账单设置 */
    BILL_PAYORINCOME_BILLSETTINGS,
    /** 保存账单 */
    BILL_PAYORINCOME_BILLSAVE,
    /** 导出运单 */
    BILL_PAYORINCOME_EXPORTORDER,
    /** 修改运单界面 */
    BILL_PAYORINCOME_UPDATEORDERUI,
    /** 修改运单 */
    BILL_PAYORINCOME_UPDATEORDER,
    /** 保存并打印账单*/
    BILL_PAYORINCOME_SAVEANDPRINTBILL,

    /**
     * 账单管理-账单调整管理模块
     */
    /** 请求所有账单数据 */
    BILL_ADJUSTMENT_GETBILLLIST,
    /** 根据条件搜索账单数据 */
    BILL_ADJUSTMENT_SEARCHBILLLIST,
    /** 根据id搜索账单数据 */
    BILL_ADJUSTMENT_GETBILLBYID,
    /** 根据id更新数据 */
    BILL_ADJUSTMENT_UPDATEBILLBYID,
    /** 导出XLS */
    BILL_ADJUSTMENT_EXPORTXLS,
    /**
     * 账单管理-对账提醒功能
     */
    BILL_RECONCILIATIONNOTIFYCATION_ADD, //
    BILL_RECONCILIATIONNOTIFYCATION_UPDATE, //
    BILL_RECONCILIATIONNOTIFYCATION_GETRECONCILIATIONNOTIFYCATIONBYID, //
    BILL_RECONCILIATIONNOTIFYCATION_GETRECONCILIATIONNOTIFYCATIONLIST, //
    BILL_RECONCILIATIONNOTIFYCATION_DELETERECONCILIATIONNOTIFYCATIONBYID, //
    BILL_RECONCILIATIONNOTIFYCATION_UPDATERECONCILIATIONNOTIFYCATIONBYID, //
    BILL_RECONCILIATIONNOTIFYCATION_SEARCH, //
    BILL_RECONCILIATIONNOTIFYCATION_FINDLANGUAGE, //
    BILL_RECONCILIATIONNOTIFYCATION_FINDCOUNTRY,
    /**
     *
     * --------------------------------账单管理模块结束----------------------------
     */

    /*--------------------------------运单走件信息平台标准接口----------------------------*/

    /** 定时获取运单信息 */
    ON_TIME_GET_WAYBILL,
    /** 定时推送运单信息 */
    ON_TIME_PUSH_WAYBILL,
    /** 实时获取运单信息 */
    REAL_TIME_GET_WAYBILL,
    /** 实时获取清关运单信息 */
    GET_WAYBILL_ABOUT_BLC,
    /** 实时接收下游走件信息 */
    REAL_TIME_STANDARD_GET_UPSTREAM_SHIPMENTS,
    /** 实时接收下游走件信息(圆通) */
    REAL_TIME_YTO_GET_UPSTREAM_SHIPMENTS,

    /** 定时获取GLS走件信息 */
    ON_TIME_GET_SHIPMENT_GLS,
    /** 定时推送GLS走件信息 */
    ON_TIME_PUSH_SHIPMENT_GLS,
    /** 定时获取GLS运单信息 */
    ON_TIME_GET_WAYBILL_GLS,
    /** 定时推送GLS包裹信息*/
    ON_TIME_PUSH_WAYBILL_GLS,
    /** 定时推送GLS清关信息*/
    ON_TIME_PUSH_CUSTOMS_GLS,
    /** 定时获取DHL相关走件信息(From 金刚) */
    ON_TIME_GET_SHIPMENT_ABOUT_DHL,
    /** 定时推送走件信息(to DHL) */
    ON_TIME_PUSH_SHIPMENT_TO_DHL,
    /** 定时获取走件信息(from usps) */
    ON_TIME_GET_SHIPMENT_FROM_USPS,
    /** 定时获取走件信息 */
    ON_TIME_GET_SHIPMENT,
    /** 定时推送走件信息 */
    ON_TIME_PUSH_SHIPMENT,
    /** 实时获取走件信息 */
    REAL_TIME_GET_SHIPMENT,

    /** 定时监听失败文件夹 */
    ON_TIME_FAILED_FILES,
    /** 推送结关信息 */
    PUSH_CLEARANCE_INFO,
    /**更新定时任务的IsRunning状态*/
    UPDATE_TIMETASK_IS_RUNNING,

    /** 推送DHL相关的结关信息（物流信息） */
    PUSH_LOGISTIC_STATUS_ABOUT_DHL,
    /** 推送运单给杭州海关 */
    PUSH_WAYBILL_HZHG,
    /** 推送物流信息给杭州海关 */
    PUSH_LOGISTICS_HZHG,
    /**处理杭州海关的回执信息*/
    DEAL_RECEIPT_HZHG,
    /** 推送物流信息给郑州海关 */
    PUSH_LOGISTICS_ZZHG,
    /**处理郑州海关的回执信息*/
    RECEIVE_DEAL_RECEIPT_ZZHG,
    /**处理郑州海关的物流走件回执信息*/
    RECEIVE_LOGISTICS_RECEIPT_ZZHG,
    /**推送运单给郑州海关*/
    PUSH_WAYBILL_ZHENZHOUHG,
    /**推送运单给济南海关*/
    PUSH_WAYBILL_JINANHG,
    /** 推送物流信息给济南海关 */
    PUSH_LOGISTICS_JINANHG,

    /** 推送订单信息给合作方CP*/
    PUSH_ORDER_INFO_CJ,
    /** 接收合作方CP信息 */
    GET_XML_FROM_CJ,

    /** 接收淘宝信息 */
    GET_XML_FROM_TB,
    /** 推送订单信息给T天猫 */
    PUSH_ORDER_INFO_TMALL,
    
    /** 接收海外仓信息 */
    GET_XML_FROM_WMS,
    /** 海外仓信息推送给淘宝 */
    OTHER_PUSH_TO_TMALL,
    /** 海外仓信息推送给淘宝 */
    OTHER_PUSH_TO_WMS,

    /** 定时获取ems订单信息 */
    ON_TIME_GET_EMS_ORDER,
    /** 定时从易通和EGS获取面单号 ,并更新到KK数据库*/
    ON_TIME_UPDATE_EMS_ORDER,
    /** 定时发送ems订单信息(包括航班信息) */
    ON_TIME_SEND_EMS_ORDER,
    /** 定时发送ems走件信息*/
    ON_TIME_SEND_EMS_SHIMENTS,
    /** 解析CJ和天猫报文*/
    PARSE_CJ_TMALL_REQUEST,
    /*
     * --------------------------------权限管理模块----------------------------
     */
    /*
     * 权限管理-用户管理模块
     */
    /** 添加用户 */
    PRIVILEGE_USER_ADDUSER,
    /** 更新用户*/
    PRIVILEGE_USER_UPDATEUSER,
    /** 显示所有公司的用户 */
    PRIVILEGE_USER_QUERYUSER,
    /** 查询用户讯息 */
    PRIVILEGE_USER_SEARCHUSERLIST,
    /** 查询用户讯息(不显示) */
    PRIVILEGE_USER_SEARCHUSERLISTNOTSEE,
    /** 删除用户信息 */
    PRIVILEGE_USER_DELETEUSER,
    /** 修改当前用户密码 */
    PRIVILEGE_USER_CHANGEPWD,
    /** 密码是否正确 */
    PRIVILEGE_USER_VALIDATEEXIST,
    /** 重置密码 */
    PRIVILEGE_USER_RESETPWD,
    /** 重置密码保存 */
    PRIVILEGE_USER_RESETPWDSAVE,
    /** 检查是否过期或者auch是否存在*/
    PRIVILEGE_USER_CHECKISEXIST,
    /** 获取当前用户所在的公司信息*/
    PRIVILEGE_USER_COMPANYINFO,
    /** 显示当前用户公司的所有用户信息 */
    PRIVILEGE_USER_QUERYUSERONLY,
    /** 检测用户名*/
    PRIVILEGE_USER_VALIDATENAME,
    /** 检测邮箱*/
    PRIVILEGE_USER_VALIDATEEMAIL,
    /*
     * 权限管理-角色管理模块
     */
    /** 请求角色的所有数据 */
    PRIVILEGE_ROLE_GETROLELIST,
    /** 根据ID请求对应的角色 */
    PRIVILEGE_ROLE_GETROLEBYID,
    /** 增加角色 */
    PRIVILEGE_ROLE_ADDROLE,
    /** 修改角色 */
    PRIVILEGE_ROLE_UPDATEROLE,
    /** 删除角色 */
    PRIVILEGE_ROLE_DELETEROLE,
    /** 根据条件搜索角色 */
    PRIVILEGE_ROLE_SEARCHROLELIST,
    /** 根据语言得到所有的角色 */
    PRIVILEGE_ROLE_GETALLROLELIST,
    /** 得到所有的角色 */
    PRIVILEGE_ROLE_GETALLROLES,
    /** 增加或修改时返回搜索角色 */
    PRIVILEGE_ROLE_SEARCHADDORUPDATEROLELIST,

    /*
     * 权限管理-安全机制
     */
    /** 得到权限 */
    PRIVILEGE_SAFETY_GETFUNCTIONTREE,
    /** 分配权限 */
    PRIVILEGE_SAFETY_ASSIGNPRIVILEGE,
    /*
     * --------------------------------权限管理模块结束----------------------------
     */
    /*
     * ------------------------------关务模块-------------------------------------
     */
    /*
     * 清关信息更新模块
     */
    /** 请求清关信息 */
    CLEARANCEINFOUPDATE_QUERYLIST,
    /** 请求满足条件的清关信息 */
    CLEARANCEINFOUPDATE_SEARCHLIST,
    /** 请求选中运单的清关详情 */
    CLEARANCEINFOUPDATE_GETINFODETAILS,
    /** 请求导出的清关信息 */
    CLEARANCEINFOUPDATE_SEARCHLISTFORXLS,
    /** 请求导入清关信息 */
    CLEARANCEINFOUPDATE_IMPORTXLS,
    /**请求走件编码列表 */
    CLEARANCEINFOUPDATE_GETFIELDCODELIST,
    /*
     * 报关清单管理模块
     */
    /**报关材料信息请求*/
    CLEARANCEINFOMANAGEMENT_SEARCHLIST,
    /**报关清单详情请求*/
    CLEARANCEINFOMANAGEMENT_VIEWDETAILS,
    /**报关分运单号请求*/
    CLEARANCEINFOMANAGEMENT_GETSUBIDLIST,
    /**报关主运单号添加*/
    CLEARANCEINFOMANAGEMENT_BATCHIDBIND,
    /*
     * 公司名和协议管理模块
     */
    /** 请求所有数据 */
    COMPANYNAMEANDAGREEMENT_GETLIST,
    /** 根据ID请求对应的数据 */
    COMPANYNAMEANDAGREEMENT_GETBYID,
    /** 增加数据 */
    COMPANYNAMEANDAGREEMENT_ADD,
    /** 修改数据 */
    COMPANYNAMEANDAGREEMENT_UPDATE,
    /** 删除数据 */
    COMPANYNAMEANDAGREEMENT_DELETE,
    /** 根据条件搜索数据 */
    COMPANYNAMEANDAGREEMENT_SEARCHLIST,
    /*
     * ------------------------------关务模块结束-------------------------------------
     */
    /*
     * ------------------------------日志模块-------------------------------------
     */

    /** 请求所有日志数据 **/
    LOG_GETLOGLIST,

    /** 根据条件查询日志数据 **/
    LOG_GETSEARCHLOGLIST,
    /** 根据条件查询操作日志数据 **/
    LOG_GETOPERATIONLIST,
    /** 查询操作日志数据 **/
    LOG_GETSEARCHOPERATIONLIST,

    /*--------------------------------日志模块结束----------------------------*/
    /*--------------------------------运单信息平台标准接口结束----------------------------*/
    ;
    private static final Map<String, RequestType> MAP = new HashMap<>();
    static {
        for (final RequestType t : RequestType.values()) {
            MAP.put(t.name(), t);
        }
    }

    public static RequestType get(final String name) {
        return MAP.containsKey(name) ? MAP.get(name) : DEFAULT;
    }
}

