/*
 * 项目名: 全球大联盟
 * 文件名: ExpressstatusUpdateResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.expressstatus.bean;

import com.yto.globalunion.basedata.expressstatus.entity.ExpressStatus;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author longwang
 *
 */
public class ExpressStatusUpdateResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;

    private ExpressStatus     expressstatus;

    public ExpressStatus getExpressstatus() {
        return expressstatus;
    }

    public void setExpressstatus(ExpressStatus expressstatus) {
        this.expressstatus = expressstatus;
    }

}
