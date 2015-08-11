package com.yto.globalunion.common.contants;

/**
 * 计算价格规则和是否是泡货枚举
 * @author zhenghaohong
 *
 */

public enum OderPriceRule {

    ORDERPRICECARGO("1"),

    ORDERPRICEFIRSTRULE("1"), ORDERPRICESECONDRULE("2"), ORDERPRICETHRITHRULE("3"), ORDERPRICEFOURTHRULE("4"),

    ORDERINFOACCOUNTID("0"), ORDERINFOACCOUNTIDHAVE("1"), ORDERINFOACCOUNTIDUNABLE("2"),

    BILLINCOME("1"), BILLPAY("2"),

    ORDERCOMPANYID(""),

    ORDERPRICE("0"),

    TAB("1"),
    
    ZH_CN("zh_CN"),
    
    EN_US("en_US");

    private String value;

    private OderPriceRule(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
