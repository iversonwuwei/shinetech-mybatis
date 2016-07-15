package com.walden.helper;

import com.walden.configure.OrderRequestParams;
import com.walden.configure.UserRequestParams;
import com.walden.configure.param.IRequestParam;

import java.util.Set;

/**
 * Created by walden on 16/7/11.
 */
public class WebParamHelper extends RequestHelper {

    private StringBuilder requesturl;
    private OrderRequestParams orderRequestParams;
    private UserRequestParams userRequestParams;
    private Set<Object> keys = null;

    public WebParamHelper(StringBuilder requesturl) {
        this.requesturl = requesturl;
    }

    @Override
    public StringBuilder doPostParam(Object params) {
        requesturl = requesturl.append(params);
        return requesturl;
    }

    @Override
    public StringBuilder doGetParam(Object params) {
        if (params instanceof OrderRequestParams) {
            orderRequestParams = (OrderRequestParams) params;
            keys = orderRequestParams.getMap().keySet();
            getParamsString(keys, orderRequestParams);
        }
        if (params instanceof UserRequestParams) {
            userRequestParams = (UserRequestParams) params;
            if (userRequestParams != null && userRequestParams.getMap() != null
                    && userRequestParams.getUserid() != null) {
                keys = userRequestParams.getMap().keySet();
                getParamsString(keys, userRequestParams);
            }
        }
        return requesturl;
    }

    private void getParamsString(Set<Object> keys, IRequestParam requestParam) {
        requesturl.append("?");
        int i = 1;
        for (Object key : keys) {
            requesturl.append(key);
            requesturl.append("=");
            requesturl.append(requestParam.getMap().get(key));
            if (i < keys.size()) {
                requesturl.append("&");
            }
            i++;
        }
    }
}
