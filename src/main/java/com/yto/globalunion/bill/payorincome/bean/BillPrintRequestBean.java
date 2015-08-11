package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.common.bean.RequestBaseBean;

public class BillPrintRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;
    private String            billInfo;
    private String            id;

    public String getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(String billInfo) {
        this.billInfo = billInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
