/*
 * 项目名: 全球大联盟
 * 文件名: PortUpdateResponseBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.basedata.port.bean;

import com.yto.globalunion.basedata.port.entity.Port;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * @author hengchen
 *
 */
public class PortUpdateResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    // 口岸信息
    private Port              port;

    /**
     * @return the port
     */
    public Port getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(Port port) {
        this.port = port;
    }

}
