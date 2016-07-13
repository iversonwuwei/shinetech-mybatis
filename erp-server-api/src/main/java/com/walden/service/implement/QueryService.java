package com.walden.service.implement;

import com.walden.action.IQuery;
import com.walden.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/11.
 */
@Service
public class QueryService implements IService {

    private IQuery query;


    @Autowired
    public QueryService(@Qualifier("orderQuery") IQuery query){
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
