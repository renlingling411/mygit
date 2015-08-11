/*
 * 项目名: 全球大联盟
 * 文件名: SocketClientService.java
 *
 * 版权声明:
 *     本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *     如未经特殊说明，其版权均属圆通速递所有。
 *
 *     Copyright (c) 2014 圆通速递
 *     版权所有
 */
package com.yto.globalunion.common.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.IResponse;
import com.yto.globalunion.common.bean.RequestType;
import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;

public class SocketClientService {
    private static final Logger LOGGER = Logger.getLogger(SocketClientService.class);

    public IResponse service(final IRequest req, final String ip, final int port) {
        try (Socket socket = new Socket(ip, port); ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream()); ObjectInputStream is = new ObjectInputStream(socket.getInputStream());) {
            os.writeObject(req);
            os.flush();
            socket.shutdownOutput();
            if (req.getType() == RequestType.EXIT_EXECUTOR || req.getType() == RequestType.EXIT_JOB_MANAGER) {
                return null;
            }
            return (IResponse) is.readObject();
        } catch (final IOException e) {
            LOGGER.error("Connect fail:" + ip + ":" + port, e);
            throw new YtoBusinessException(e.getMessage(), e, ErrorCode.IO_EXCEPTION);
        } catch (final ClassNotFoundException e) {
            LOGGER.error("Response class cast fail:" + ip + ":" + port, e);
            throw new YtoBusinessException(e.getMessage(), e, ErrorCode.DEFAULT_ERROR);
        }
    }
}
