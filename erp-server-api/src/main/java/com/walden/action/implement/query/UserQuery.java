package com.walden.action.implement.query;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.configure.UserRequestParams;
import com.walden.enumeration.ActionEnum;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walden on 16/7/13.
 */
public class UserQuery implements IQuery {

    private IRequest request;

    @Autowired
    private UserRequestParams userRequestParams;

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
    public Object findBy(Object requestParams) {
        JSONArray jsonArray = (JSONArray) request.doGetWithParam(ActionEnum.userQuery, userRequestParams);
        return jsonArray;
    }
}
