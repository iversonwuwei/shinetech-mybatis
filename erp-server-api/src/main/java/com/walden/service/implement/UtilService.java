package com.walden.service.implement;

import com.walden.action.IQuery;
import com.walden.action.implement.query.UtilQuery;
import com.walden.service.IService;

/**
 * Created by walden on 16/7/12.
 */
public class UtilService implements IService {

    private IQuery query;

    public UtilService(){
        query = new UtilQuery();
    }

    @Override
    public Object find() {
        return query.find();
    }

    @Override
    public Object findBy(Object requestParams) {
        return null;
    }
}
