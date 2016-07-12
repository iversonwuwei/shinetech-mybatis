package com.walden.action.implement;

import com.walden.action.IHost;

/**
 * Created by walden on 16/7/8.
 */
public class MyBatisHost implements IHost {

    private String address;
    private int port;
    private StringBuilder server;

    public MyBatisHost(String address, int port){
        this.address = address;
        this.port = port;
    }
    @Override
    public String getServer() {
        server = new StringBuilder();
        server.append("http://");
        server.append(address);
        server.append(":");
        server.append(port);
        return server.toString();
    }
}
