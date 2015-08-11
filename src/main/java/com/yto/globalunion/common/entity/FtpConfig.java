/*
 * 项目名: 全球大联盟
 * 文件名: FtpConfig.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;

import com.yto.globalunion.basedata.company.enums.FtpType;
import com.yto.globalunion.common.contants.Encoding;

/**
 * @author murphy
 *
 */
public class FtpConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            server;                            // ftp主机
    private String            port;                              // ftp端口
    private String            username;                          // 用户名
    private String            passwd;                            // 密码
    private FtpType           type             = FtpType.UNKNOWN; // 服务器类型
    private String            filePath;                          // 文件夹路径
    private String            filePattern;                       // 文件pattern
    private String            lastModifyTime;                    // 上次修改时间
    private String            encoding         = Encoding.UTF_8; // ftp操作编码格式

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePattern() {
        return filePattern;
    }

    public void setFilePattern(String filePattern) {
        this.filePattern = filePattern;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public FtpType getType() {
        return type;
    }

    public void setType(FtpType type) {
        this.type = type;
    }

    /**
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

}
