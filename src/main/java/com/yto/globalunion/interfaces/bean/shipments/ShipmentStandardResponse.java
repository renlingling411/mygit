/*
 * 项目名: 全球大联盟
 * 文件名: ReturnResponseMsg.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.interfaces.bean.shipments;

import java.io.Serializable;

/**
 * @author penglan
 *
 */
public class ShipmentStandardResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            seqNo;

    /**
     * @return the seqNo
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

}
