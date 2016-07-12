package com.walden.action.implement.query;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.enumeration.ActionEnum;

/**
 * Created by walden on 16/7/12.
 */
public class UtilQuery implements IQuery {
    private IRequest request;

    public UtilQuery(){
        request = new MyBatisServerRequest();
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
