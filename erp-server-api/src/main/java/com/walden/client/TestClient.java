package com.walden.client;

import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.action.implement.query.OrderQuery;
import com.walden.action.implement.query.UserQuery;
import com.walden.configure.OrderRequestParams;
import com.walden.configure.UserRequestParams;
import com.walden.configure.param.IRequestParam;
import com.walden.enumeration.ActionEnum;
import com.walden.service.IService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by walden on 16/7/6.
 */
public class TestClient {
    private static Logger logger = LogManager.getLogger(TestClient.class);

    public TestClient(){
    }

    public JSONArray jsonTest(){
        IRequest request = new MyBatisServerRequest();
        UserRequestParams orderRequestParams = new UserRequestParams();
        orderRequestParams.setUserid("1");
        orderRequestParams.setActionEnum(ActionEnum.userQuery);
        IService orderQueryService = new com.walden.service.implement.QueryService();
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(new UserQuery(request), orderRequestParams);
        return jsonObject;
    }

    public JSONArray single(){
        IRequest request = new MyBatisServerRequest();
        IService orderQueryService = new com.walden.service.implement.QueryService();
        IQuery query = new UserQuery(request);
        JSONArray jsonObject = (JSONArray) orderQueryService.find(query);
        return jsonObject;
    }

    public JSONArray OwnerOrders(){
        IRequest request = new MyBatisServerRequest();
        OrderRequestParams orderRequestParams = new OrderRequestParams();
        orderRequestParams.setOwner("walden");
        orderRequestParams.setActionEnum(ActionEnum.ownerOrderQuery);
        IService orderQueryService = new com.walden.service.implement.QueryService();
        IQuery query = new OrderQuery(request);
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(query, orderRequestParams);
        return jsonObject;
    }

    public JSONArray order(){
        IRequest request = new MyBatisServerRequest();
        OrderRequestParams orderRequestParams = new OrderRequestParams();
        orderRequestParams.setOrderid("ggg20160624112155");
        //orderRequestParams.setOwner("walden");
        orderRequestParams.setActionEnum(ActionEnum.orderQuery);
        IService orderQueryService = new com.walden.service.implement.QueryService();
        IQuery query = new OrderQuery(request);
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(query, orderRequestParams);
        return jsonObject;
    }

    public static void main(String[] args){
        TestClient testClient = new TestClient();
        JSONArray jsonObject = testClient.single();
        int size = jsonObject.size();
        System.out.println(size);
        System.out.println(jsonObject);
    }
}
