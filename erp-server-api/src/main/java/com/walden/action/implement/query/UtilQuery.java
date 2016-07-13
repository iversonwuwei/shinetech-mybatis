package com.walden.action.implement.query;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.enumeration.ActionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/12.
 */
@Component
public class UtilQuery implements IQuery {

    private IRequest request;

    @Autowired
    public UtilQuery(IRequest request){
        this.request = request;
    }

    @Override
    public Object find() {
        return request.doGet(ActionEnum.utils);

    }

    @Override
    public Object findBy(Object requestParams) {
        return null;
    }
}
