package com.walden.configure;

import com.walden.configure.param.IRequestParam;
import com.walden.enumeration.ActionEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by walden on 16/7/13.
 */
@Component
public class UserRequestParams implements IRequestParam {

    private String userid;
    private Map<Object, Object> paramsMap;
    private ActionEnum actionEnum;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public UserRequestParams(){

    }

    @Override
    public ActionEnum getActionEnum() {
        return this.actionEnum;
    }

    @Override
    public void setActionEnum(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    @Override
    public Map<Object, Object> getMap() {
        paramsMap = new HashMap<>();
        paramsMap.put("id", userid);
        return paramsMap;
    }
}
