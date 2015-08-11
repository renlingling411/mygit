package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.bill.payorincome.entity.BillInfo;
import com.yto.globalunion.common.bean.RequestBaseBean;

public class BillUpdateRequestBean extends RequestBaseBean {

    private static final long serialVersionUID = 1L;

    private BillInfo          billInfo;
    private String            id;

    public BillInfo getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
