package com.walden.configure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by walden on 16/7/13.
 */
public class UserRequestParams {

    private String userid;
    private Map<String, Object> paramsMap;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public UserRequestParams(){

    }

    public Map<String, Object> getParamsMap(){
        paramsMap = new HashMap<String, Object>();
        paramsMap.put("id", userid);
        return paramsMap;
    }
}
