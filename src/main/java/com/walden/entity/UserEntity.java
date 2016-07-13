package com.walden.entity;

import java.util.List;

/**
 * Created by walden on 16/7/12.
 */
public class UserEntity {

    private String user_id;
    private String user_name;
    private String user_password;
    private String user_role;
    private CompanyEntity company;
    private List<CutterEntity> cutters;
    private List<DriverEntity> drivers;
    private List<LayerEntity> layers;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public List<CutterEntity> getCutters() {
        return cutters;
    }

    public void setCutters(List<CutterEntity> cutters) {
        this.cutters = cutters;
    }

    public List<DriverEntity> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverEntity> drivers) {
        this.drivers = drivers;
    }

    public List<LayerEntity> getLayers() {
        return layers;
    }

    public void setLayers(List<LayerEntity> layers) {
        this.layers = layers;
    }

}
