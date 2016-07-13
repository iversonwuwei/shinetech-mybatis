package com.walden.configure;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by walden on 16/7/8.
 */
@Component
public class OrderRequestParams {

    private String orderid;
    private Map<String, Object> paramsMap;

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public OrderRequestParams(){

    }

    public Map<String, Object> getParamsMap(){
        paramsMap = new HashMap<String, Object>();
        paramsMap.put("id", orderid);
        return paramsMap;
    }
}
