/*
 * 项目名: 全球大联盟
 * 文件名: SocketServerService.java
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
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.common.bean.IResponse;
import com.yto.globalunion.common.enums.ErrorCode;
import com.yto.globalunion.common.exception.YtoBusinessException;
import com.yto.globalunion.common.parameter.SystemParameter;

public class SocketServerService extends Thread {

    private static final Logger LOGGER = Logger.getLogger(SocketServerService.class);

    private int                 port;

    private IDispatchService    dispatchService;

    public void init() {

        if (SystemParameter.localPort > 0) {
            port = SystemParameter.localPort;
        }

        setDaemon(true);
        setName("网络监听服务");
        if (!SystemParameter.shutdown) {
            this.start();
        }
    }

    @Override
    public void run() {
        LOGGER.debug("Start socket service");
        try (ServerSocket server = new ServerSocket(port)) {
            LOGGER.debug("Socket service started. Waiting for job command...");
            while (true) {
                final Socket client = server.accept();
                LOGGER.debug("New job command");
                final Thread t = new Thread(() -> {
                    try (ObjectInputStream is = new ObjectInputStream(client.getInputStream());//
                            ObjectOutputStream os = new ObjectOutputStream(client.getOutputStream())) {

                        final IRequest req = (IRequest) is.readObject();
                        IResponse res = null;

                        try {
                            Thread.currentThread().setName("执行指令:" + req.getType());
                            res = dispatchService.service(req);
                        } catch (final YtoBusinessException e) {
                            res = dispatchService.newResponseInstance(req);
                            if (null != res) {
                                res.setErrorCode(e.getCode());
                            }
                            LOGGER.warn(e.getMessage(), e);
                        } catch (final Throwable e) {
                            res = dispatchService.newResponseInstance(req);
                            if (null != res) {
                                res.setErrorCode(ErrorCode.DEFAULT_ERROR);
                            }

                            LOGGER.warn(e.getMessage(), e);
                        }
                        os.writeObject(res);

                    } catch (IOException | ClassNotFoundException e) {
                        LOGGER.error(e.getMessage(), e);
                    } finally {
                        if (null != client) {
                            try {
                                client.close();
                            } catch (final Exception e) {
                                LOGGER.info(e.getMessage(), e);
                            }
                        }
                    }
                }, "执行指令");
                t.setDaemon(true);
                t.start();
            }
        } catch (final IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public IDispatchService getDispatchService() {
        return dispatchService;
    }

    public void setDispatchService(final IDispatchService dispatchService) {
        this.dispatchService = dispatchService;
    }
}
