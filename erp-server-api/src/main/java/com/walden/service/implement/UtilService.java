package com.walden.service.implement;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.action.implement.query.UtilQuery;
import com.walden.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/12.
 */
@Service
public class UtilService implements IService {

    private IQuery query;

    @Autowired
    public UtilService(@Qualifier("utilQuery") IQuery query) {
        this.query = query;
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
