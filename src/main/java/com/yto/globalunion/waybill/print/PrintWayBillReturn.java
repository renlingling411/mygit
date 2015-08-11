/*
 * 项目名: 全球大联盟
 * 文件名: WayBillNoJiNanHG.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2015 圆通速递
 *     版权所有
 */
package com.yto.globalunion.waybill.print;

import java.util.List;

import com.yto.globalunion.waybill.BillInfo;

/**
 * @author dongdongliu
 *
 */
public class PrintWayBillReturn {
    private String         seqNo;
    private String         sendTimeStamp;
    private int         recordCount;
    private List<BillInfo> billInfos;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getSendTimeStamp() {
        return sendTimeStamp;
    }

    public void setSendTimeStamp(String sendTimeStamp) {
        this.sendTimeStamp = sendTimeStamp;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<BillInfo> getBillInfos() {
        return billInfos;
    }

    public void setBillInfos(List<BillInfo> billInfos) {
        this.billInfos = billInfos;
    }
}
