package com.walden.service.implement;

import com.walden.action.IQuery;
import com.walden.service.IService;

/**
 * Created by walden on 16/7/11.
 */
public class QueryService implements IService {

    private IQuery query;

    public QueryService(IQuery query){
        this.query = query;
    }

    @Override
    public Object find() {

        return query.find();
    }

    @Override
    public Object findBy(Object requestParams) {
        return query.findBy(requestParams);
    }
}
