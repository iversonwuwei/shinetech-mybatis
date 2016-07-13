package com.walden.helper;

import com.walden.configure.OrderRequestParams;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by walden on 16/7/11.
 */
public class WebParamHelper extends RequestHelper {

    private StringBuilder requesturl;
    private OrderRequestParams orderRequestParams;
    private Set<String> keys = null;

    public WebParamHelper(StringBuilder requesturl){
        this.requesturl = requesturl;
    }

    @Override
    public StringBuilder doPostParam(Object params) {
        requesturl = requesturl.append(params);
        return requesturl;
    }

    @Override
    public StringBuilder doGetParam(Object params) {
        if (params instanceof OrderRequestParams){
            orderRequestParams = (OrderRequestParams) params;
            if (orderRequestParams != null && orderRequestParams.getParamsMap() != null
                    && orderRequestParams.getOrderid()!=null){
                keys = orderRequestParams.getParamsMap().keySet();
                for (String key : keys){
                    requesturl.append("?");
                    requesturl.append(key);
                    requesturl.append("=");
                    requesturl.append(orderRequestParams.getParamsMap().get(key));
                }
            }
        }
        return requesturl;
    }
}
