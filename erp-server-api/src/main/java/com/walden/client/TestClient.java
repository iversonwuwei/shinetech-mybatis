package com.walden.client;

import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.action.implement.query.OrderQuery;
import com.walden.configure.OrderRequestParams;
import com.walden.service.IService;
import net.sf.json.JSONArray;
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
        OrderRequestParams orderRequestParams = new OrderRequestParams();
        orderRequestParams.setOrderid("nn20160624150722");
        IService orderQueryService = new com.walden.service.implement.QueryService(new OrderQuery(request));
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(orderRequestParams);
        return jsonObject;
    }

    public static void main(String[] args){
        TestClient testClient = new TestClient();
        JSONArray jsonObject = testClient.jsonTest();

        System.out.println(jsonObject);
    }
}
