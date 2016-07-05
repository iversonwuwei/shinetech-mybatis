package com.walden.entity;

/**
 * Created by walden on 16/7/3.
 */
public class DriverEntity {

    private String driver_id;
    private String driver_name;
    private String driver_company;
    private String driver_sex;
    private String driver_age;
    private String driver_health;
    private String is_online;
    private String driver_contact_number;
    private String driver_email;
    private String driver_address;

    public String getDriver_id() {
        return driver_id;
    }

    public String getIs_online() {
        return is_online;
    }

    public String getDriver_address() {
        return driver_address;
    }

    public String getDriver_age() {
        return driver_age;
    }

    public String getDriver_company() {
        return driver_company;
    }

    public String getDriver_contact_number() {
        return driver_contact_number;
    }

    public String getDriver_email() {
        return driver_email;
    }

    public String getDriver_health() {
        return driver_health;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public String getDriver_sex() {
        return driver_sex;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online;
    }

    public void setDriver_address(String driver_address) {
        this.driver_address = driver_address;
    }

    public void setDriver_age(String driver_age) {
        this.driver_age = driver_age;
    }

    public void setDriver_company(String driver_company) {
        this.driver_company = driver_company;
    }

    public void setDriver_contact_number(String driver_contact_number) {
        this.driver_contact_number = driver_contact_number;
    }

    public void setDriver_email(String driver_email) {
        this.driver_email = driver_email;
    }

    public void setDriver_health(String driver_health) {
        this.driver_health = driver_health;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public void setDriver_sex(String driver_sex) {
        this.driver_sex = driver_sex;
    }
}