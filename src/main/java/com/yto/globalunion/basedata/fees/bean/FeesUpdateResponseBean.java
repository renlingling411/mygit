/*
 * 项目名: 全球大联盟
 * 文件名: FeesUpdateResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.fees.bean;

import com.yto.globalunion.basedata.fees.entity.Fees;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author dongdongwang
 *
 */
public class FeesUpdateResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;

    private Fees              fees;

    /**
     * @return the fees
     */
    public Fees getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(Fees fees) {
        this.fees = fees;
    }
}
