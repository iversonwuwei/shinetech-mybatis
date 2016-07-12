package com.walden.action.implement.query;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.configure.OrderRequestParams;
import com.walden.enumeration.ActionEnum;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by walden on 16/7/8.
 */
public class OrderQuery implements IQuery {
    private IRequest request;

    public OrderQuery(){
        request = new MyBatisServerRequest();
    }

    @Override
    public JSONArray find() {
        JSONArray jsonObject = (JSONArray) request.doGet(ActionEnum.orderQueryAll);
        return jsonObject;
    }

    @Override
    public Object findBy(Object requestParams) {
        JSONArray jsonArray = (JSONArray) request.doGetWithParam(ActionEnum.orderQuery, requestParams);
        return jsonArray;
    }

}
