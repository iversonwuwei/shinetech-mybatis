package com.walden.configure;

import com.walden.configure.param.IRequestParam;
import com.walden.enumeration.ActionEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by walden on 16/7/8.
 */
@Component
public class OrderRequestParams implements IRequestParam {

    private String orderid;
    private Map<Object, Object> paramsMap;
    private String owner;
    private ActionEnum actionEnum;

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public OrderRequestParams(){

    }

    @Override
    public ActionEnum getActionEnum() {
        return this.actionEnum;
    }

    @Override
    public void setActionEnum(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    public Map<Object, Object> getMap(){
        paramsMap = new HashMap<>();
        paramsMap.put("id", orderid);
        paramsMap.put("owner", owner);
        return paramsMap;
    }
}
