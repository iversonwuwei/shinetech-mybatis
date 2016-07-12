package com.walden.helper;

import com.walden.configure.OrderRequestParams;
import java.util.Set;

/**
 * Created by walden on 16/7/11.
 */
public class WebParamHelper {

    private StringBuilder requesturl;
    private OrderRequestParams orderRequestParams;
    private Set<String> keys = null;

    public WebParamHelper(StringBuilder requesturl){
        this.requesturl = requesturl;
    }

    public StringBuilder getRequestUrlWithParams(Object requestParams){
        if (requestParams instanceof OrderRequestParams){
            orderRequestParams = (OrderRequestParams) requestParams;
        }
        return getUrl();
    }

    private StringBuilder getUrl(){
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
        return requesturl;
    }
}
