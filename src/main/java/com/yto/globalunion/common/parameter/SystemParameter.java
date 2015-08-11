/*
 * 项目名: 全球大联盟
 * 文件名: SystemParameter.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.parameter;

/**
 * @author murphy
 *
 */
public class SystemParameter {
    public static int     localPort      = -1;
    public static int     serverPort     = -1;

    public static String  localIp        = null;
    public static String  serverIp       = null;

    public static boolean shutdown       = false;

    public static int     jobManagerPort = -1;
}
