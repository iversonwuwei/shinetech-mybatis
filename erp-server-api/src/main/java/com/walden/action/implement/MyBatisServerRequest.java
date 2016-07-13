package com.walden.action.implement;

import com.walden.action.IHost;
import com.walden.action.IRequest;
import com.walden.content.ActionContent;
import com.walden.enumeration.ActionEnum;
import com.walden.helper.RequestHelper;
import com.walden.helper.WebParamHelper;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by walden on 16/7/8.
 */
@Component
public class MyBatisServerRequest implements IRequest {

    private IHost host;
    private String myBatisHost;
    private RestTemplate restTemplate;
    private StringBuilder requesturl;

    public MyBatisServerRequest() {
        host = new MyBatisHost("localhost", 8088);
        myBatisHost = host.getServer();
        restTemplate = new RestTemplate();
    }

    @Override
    public Object doPost(ActionEnum actionEnum, Object postParam) {
        requesturl = new StringBuilder();
        requesturl.append(myBatisHost);
        switch (actionEnum){
            case orderAdd:
                requesturl.append(ActionContent.ADDORDER);
                requesturl = new WebParamHelper(requesturl).doPostParam(postParam);
                break;
        }
        restTemplate.setMessageConverters(RequestHelper.setHeepMessageConverter());
        return null;
    }

    @Override
    public JSONArray doGet(ActionEnum actionEnum) {
        requesturl = new StringBuilder();
        requesturl.append(myBatisHost);
        switch (actionEnum) {
            case orderQueryAll:
                requesturl.append(ActionContent.ORDERS);
                break;
            case utils:
                requesturl.append(ActionContent.UTILS);
                break;
            case userQuery:
                requesturl.append(ActionContent.USERS);
                break;
        }
        restTemplate.setMessageConverters(RequestHelper.setHeepMessageConverter());
        return JSONArray.fromObject(restTemplate.getForObject(requesturl.toString(), Object.class));
    }

    @Override
    public Object doGetWithParam(ActionEnum actionEnum, Object requestParams) {
        requesturl = new StringBuilder();
        requesturl.append(myBatisHost);
        switch (actionEnum) {
            case orderQuery:
                requesturl.append(ActionContent.ORDER);
                requesturl = new WebParamHelper(requesturl).doGetParam(requestParams);
                break;
            case userQuery:
                requesturl.append(ActionContent.USER);
                requesturl = new WebParamHelper(requesturl).doGetParam(requestParams);
                break;
        }
        restTemplate.setMessageConverters(RequestHelper.setHeepMessageConverter());
        JSONArray jsonArray = JSONArray.fromObject(restTemplate.getForObject(requesturl.toString(), Object.class));
        return jsonArray;
    }
}
