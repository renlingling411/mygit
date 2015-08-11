/*
 * 项目名: 全球大联盟
 * 文件名: BLCUpdateResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.blc.bean;

import com.yto.globalunion.basedata.blc.entity.BLC;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author longwang
 *
 */
public class BLCUpdateResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    private BLC               blc;
    private String            rs;

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public BLC getBlc() {
        return blc;
    }

    public void setBlc(BLC blc) {
        this.blc = blc;
    }

}
