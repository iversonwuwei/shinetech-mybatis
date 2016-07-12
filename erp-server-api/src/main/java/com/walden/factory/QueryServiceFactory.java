package com.walden.factory;

import com.walden.action.IQuery;
import com.walden.action.implement.OrderQuery;
import com.walden.configure.OrderRequestParams;
import com.walden.service.IService;
import com.walden.service.QueryService;
import com.walden.service.implement.OrderQueryService;

/**
 * Created by walden on 16/7/7.
 */
public class QueryServiceFactory {

    private IQuery query;

    public QueryServiceFactory(){
    }

    public QueryService getOrderService(Object requestParams){
        query = new OrderQuery();
        return new OrderQueryService(query);
    }

}
