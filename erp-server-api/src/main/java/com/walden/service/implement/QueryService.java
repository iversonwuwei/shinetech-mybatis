package com.walden.service.implement;

import com.walden.action.IQuery;
import com.walden.configure.param.IRequestParam;
import com.walden.service.IService;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/11.
 */
@Service
public class QueryService implements IService {
    public QueryService(){

    }

    @Override
    public Object find(IQuery query) {
        return query.find();
    }

    @Override
    public Object findBy(IQuery query, IRequestParam requestParams) {
        return query.findBy(requestParams);
    }
}
