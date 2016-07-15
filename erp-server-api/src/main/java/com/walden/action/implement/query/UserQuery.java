package com.walden.action.implement.query;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.configure.param.IRequestParam;
import com.walden.enumeration.ActionEnum;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/13.
 */
@Component
public class UserQuery implements IQuery {

    private IRequest request;

    @Autowired
    public UserQuery(IRequest request){
        this.request = request;
    }

    @Override
    public Object find() {
        JSONArray jsonArray = (JSONArray) request.doGet(ActionEnum.userQuery);
        return jsonArray;
    }

    @Override
    public Object findBy(IRequestParam requestParams) {
        JSONArray jsonArray = (JSONArray) request.doGetWithParam(requestParams);
        return jsonArray;
    }
}
