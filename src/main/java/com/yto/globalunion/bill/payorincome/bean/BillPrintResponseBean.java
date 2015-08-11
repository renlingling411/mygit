package com.yto.globalunion.bill.payorincome.bean;

import com.yto.globalunion.bill.payorincome.entity.BillInfo;
import com.yto.globalunion.common.bean.ResponseBaseBean;

public class BillPrintResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;

    private BillInfo          billInfo;

    public BillInfo getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }

}
