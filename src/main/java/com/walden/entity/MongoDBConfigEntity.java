package com.walden.entity;

/**
 * Created by walden on 16/7/7.
 */
public class MongoDBConfigEntity {

    private String server;
    private int port;
    private String dbName;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


}
