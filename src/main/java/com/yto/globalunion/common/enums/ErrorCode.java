/*
 * 项目名: 全球大联盟
 * 文件名: ErrorMessageKey.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author penglan
 *
 */
public enum ErrorCode {
    SUCCESS(000, "System.Success"), // 操作成功
    DEFAULT_ERROR(001, "System.Error"), // 默认错误

    // ###Exceptions
    ADDRESS_EXCEPTION(2, "Address.Exception"), // AddressException
    CLASS_NOT_FOUND_EXCEPTION(3, "ClassNotFound.Exception"), // ClassNotFoundException
    FILE_NOT_FOUND_EXCEPTION(4, "FileNotFound.Exception"), // FileNotFoundException
    INTERRUPTED_EXCEPTION(5, "Interrupted_Exception"), // InterruptedException
    INVALID_FORMAT_EXCEPTION(6, "InvalidFormat.Exception"), // InvalidFormatException
    IO_EXCEPTION(7, "IO.Exception"), // IOException
    JSCH_EXCEPTION(8, "JSch.Exception"), // JSchException
    NO_SUCH_ALGORITHM_EXCEPTION(9, "NoSuchAlgorithm.Exception"), // NoSuchAlgorithmException
    NUMBER_FORMAT_EXCEPTION(10, "NumberFormat.Exception"), // NumberFormatException
    PARSE_EXCEPTION(11, "Parse.Exception"), // ParseException
    SAX_EXCEPTION(12, "SAX.Exception"), // SAXException
    SFTP_EXCEPTION(13, "Sftp.Exception"), // SftpException
    SQL_EXCEPTION(14, "SQL.Exception"), // SQLException
    UNKNOWN_HOST_EXCEPTION(15, "UnknownHost.Exception"), // UnknownHostException
    UNSUPPORTED_ENCODING_EXCEPTION(16, "UnsupportedEncoding.Exception"), // UnsupportedEncodingException

    // ###其他错误
    SEND_MAIL_ERROR(101, "SendMail.Error"), // 发送邮件错误
    EXCEL_UPLOAD_ERROR(102, "Excel.Upload.Error"), // Excel上传失败
    INVALID_REQUEST(103, "Invalid.Request"), // 无效的请求连接
    UPDATE_PARAM_ERROR(104, "Update.Param.Error"), // 更新失败
    CURRENCY_UNIT_UNEXIST(105, "Currency.Unit.Unexist"), // 币种单位不存在
    WEIGHT_UNIT_UNEXIST(106, "Weight.Unit.Unexist"), // 重量单位不存在
    LENGHT_UNIT_UNEXIST(107, "Lenght.Code.Unexist"), // 长度单位不存在
    PRODUCT_CODE_UNEXIST(108, "Product.Code.Unexist"), // 产品code不存在
    MISSING_FIELDS(109, "Missing.Fields"), // 缺失字段
    IMPERFECT_INFORMATION(110, "Imperfect.Information"), // 新增用户必填信息未填写完整
    ORDER_INFO_ERROR(111, "Order.Info.Error"), // 运单信息错误
    ITEM_INFO_ERROR(112, "Item.Info.Error"), // 内件信息错误
    DATA_FORMAT_ERROR(113, "Data.Format.Error"), // 数据格式不正确
    STANDARD_CODE_NOT_EXIST(114, "Excel.Error"), // 标准状态码不存在
    PORT_INFO_ERROR(115, "Port.Info.Error"), // 口岸信息错误
    EXCEL_FILE_ERROR(116, "Excel.File.Error"), // Excel格式错误
    UP_COMPANY_CODE_MISS(117, "Up.Company.Code.Miss"), // 上游公司编号不存在
    DOWN_COMPANY_CODE_MISS(118, "Down.Company.Code.Miss"), // 上游公司编号不存在
    ORDER_EXIST(119, "Order.Exist"), // 运单已存在
    USER_UNEXIST(120, "User.Unexist"), // 用户不存在
    NOT_ALLOW_DATA(121, "Not.Allow.Data"), // 不被允许的数据(不允许该公司所导入的数据)
    INVALID_INTERFACE_TYPE(122, "Invalid.Interface.Type"), // 错误的接口类型
    EXCEL_ORDER_EXIST(123, "Excel.Order.Exist"), // 运单已存在
    UP_COMPANY_ORDERID_MISS(124, "Up.Company.OrderId.Miss"), // 上游公司订单号不存在,不能为空
    TAXES_MISS(125, "Taxes.Miss"), // 税费不存在,税费不能为空
    EXCEL_TAXES_EXIST(126, "Excel.Taxes.Exist"), // Excel存在相同的税费信息
    TAXES_INFO_UNEXIST(127, "Taxes.Info.Unexist"), // 数据库中不存在该运单信息
    TAXES_INFO_ERROR(128, "Taxes.Info.Error"), // 该数据在数据库中为DDP类型
    DAT_LESS_DATA(129, "Dat.Less.Data"), // 文件数据列缺少数据
    DHL_TAXES_MIN(130, "Dhl.Taxes.Min"), // 税费必须比0大
    // ###加密解密
    ENCRYPT_ERROR(201, "Encrypt.Error"), // 加密错误
    DECRYPT_ERROR(202, "Decrypt.Error"), // 解密错误
    DIGEST_ERROR(203, "Digest.Error"), 	// 签名错误

    // ###格式解析错误
    PARSE_ERROR(301, "Parse.Error"), // 格式解析错误,如日期格式解析错误等
    XML_PARSE_ERROR(302, "Xml.Parse.Error"), // XML解析错误

    // ###未授权
    NOT_AUTHORIZED(401, "Not.Authorized"), // 未授权

    // ###数据库
    DATABASE_ERROR(601, "Database.Error"), // 数据库错误
    DATABASE_FIELD_ERROR(602, "Import.Field.Error"), // 字段错误
    DATABASE_SELECT_NO_DATA(603, "Select.No.Data"), // 无数据
    DATABASE_DUPLICATE_ENTRY(604, "Duplicate.Entry"), // 键冲突,信息已经存在
    //

    // ###ftp错误
    FTP_ERROR(501, "Ftp.Error"), // ftp错误
    FTP_CONNECT_ERROR(502, "Ftp.Push.Error"), // ftp连接错误
    FTP_PUSH_ERROR(503, "Ftp.Push.Error"), // ftp推送错误
    FTP_RECEIVE_ERROR(504, "Ftp.Receive.Error"), // ftp接收错误
    FTP_MOVE_ERROR(505, "Ftp.Move.Error"), // ftp文件移动错误
    FTP_LS_ERROR(506, "Ftp.Ls.File.Error"), // ftp文件移动错误
    FTP_CHANGE_DIR_ERROR(507, "Ftp.Change.Dir.Error"), // ftp目录切换错误
    FTP_DELETE_FILE_ERROR(508, "Ftp.Delete.File.Error"), // ftp删除文件错误
    FTP_DELETE_DIR_ERROR(509, "Ftp.Delete.Dir.Error"), // ftp删除文件目录错误
    FTP_TRY_THREE_ERROR(510, "Ftp.Try.3.Times.Faild"), // ftp尝试三次错误
    FTP_TRY_FOUR_MODE_ERROR(511, "Ftp.Try.4.Mode.Faild"), // ftp尝试四种模式错误

    // ###http错误
    HTTP_ERROR(701, "Http.Error"), // http错误
    HTTP_CONNECT_ERROR(702, "Http.Push.Error"), // http连接错误

    // ###mail错误
    MAIL_ERROR(801, "Mail.Error"), // mail错误

    // ###poi的微软的office文件操作错误
    POI_EXCEL_ERROR(901, "Poi.Excel.Error"), // POI的EXCEL错误
    DAT_FORMAT_ERROR(902, "Dat.Format.Error"), // dat文件格式错误
    DAT_PARSE_ERROR(903, "Dat.Parse.Error"), // 解析dat文件错误

    // 流相关的错误
    STREAM_READ_ERROR(950, "Stream.Read.Error"), // 流读取失败
    CONTENT_EMPRT(951, "Content.Empty"), // 内容为空
    /*
     * 1000-2000：运单信息中的错误码
     */
    INTERFACE_COMPANY_CODE_ERROR(1000, "CompanyCode.Error"), // 公司编号未传入或者传入参数名不正确
    INTERFACE_DECRYPT_ERROR(1001, "Decrypt.Error"), // 信息解密失败

    INTERFACE_SCHEMA_VALIDATE_ERROR(1002, "Schema.Validate.Error"), // 信息schema验证失败

    INTERFACE_HTTP_RESPONSE_DATA_BUILD_ERROR(1003, "Response.DataBuild.Error"), // 构建返回信息失败,

    INTERFACE_TO_DATABASE_ERROR(1004, "To.Database.Error"), // 实时接收后加入数据库失败

    INTERFACE_COMPANY_NOT_FOUND_ENCRYPT_KEY(1005, "Company.NotFoundEncryptKey"), // 该公司不存在或者未配置接口密钥
    
    INTERFACE_GET_WAYBILL_ERROR(1006, "GetWaybill.Error"), // 运单获取失败
    /*
     * 2000-3000
     */
    YTO_PRINT_SYSTEM_DRROR_S01(2001, "Print.YTOReturn.Error.S01"), YTO_PRINT_SYSTEM_DRROR_S02(2002, "Print.YTOReturn.Error.S02"), YTO_PRINT_SYSTEM_DRROR_S03(2003, "Print.YTOReturn.Error.S03"), YTO_PRINT_SYSTEM_DRROR_S04(2004, "Print.YTOReturn.Error.S04"), YTO_PRINT_SYSTEM_DRROR_S05(2005,
            "Print.YTOReturn.Error.S05"), YTO_PRINT_SYSTEM_DRROR_S07(2007, "Print.YTOReturn.Error.S07"), NO_PARTER_ID_CONFIG_FOUND(2008, "Print.NoParterIdFound.Error"), INTERFACE_COMPANY_NOT_FOUND(1005, "Company.Not.Found"), // 公司编号非法，无法识别
    SCAT_PRINT_SYSTEM_ERROR(2500, "Print.SCAT.Error.EGSError"), SUPS_PRINT_SYSTEM_ERROR(2501, "Print.SUPS.Error.TranslateError"),

    IMPORT_COMPANY_LESSDATA(3001, "lessData"), IMPORT_COMPANY_DATAERRORNULL(3002, "dataErrorNull"), IMPORT_COMPANY_DTAERRORWRONG(3003, "dataErrorWrong")

    ;
    /**
     *
     */

    private int                                        code;
    private String                                     key;
    private static final Map<String, ErrorCode>        MAP          = new HashMap<>();

    private static final Map<Integer, List<ErrorCode>> CODE_MAP     = Arrays.stream(ErrorCode.values()).collect(Collectors.groupingBy(ErrorCode::getCode));
    private static final List<ErrorCode>               DEFAULT_LIST = Arrays.asList(DEFAULT_ERROR);

    static {
        for (ErrorCode message : ErrorCode.values()) {
            MAP.put(message.toString(), message);
        }
    }

    private ErrorCode(int code, String key) {
        this.key = key;
        this.code = code;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    public static ErrorCode getErrorMessageByName(String nameValue) {
        if (MAP.containsKey(nameValue)) {
            return MAP.get(nameValue);
        }
        return DEFAULT_ERROR;
    }

    public static ErrorCode getErrorCode(int code) {
        return CODE_MAP.getOrDefault(code, DEFAULT_LIST).get(0);
    }

}
