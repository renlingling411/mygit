/*
 * 项目名: 全球大联盟
 * 文件名: HeartBeatBean.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.spi.LoggingEvent;

public class HeartBeatBean implements Serializable {
    private static final long        serialVersionUID = 1L;
    private String                   ip;
    private int                      port;
    private final List<LoggingEvent> loggingEvents    = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<LoggingEvent> getLoggingEvents() {
        return loggingEvents;
    }
}
