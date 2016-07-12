package com.walden.client;

import com.walden.action.implement.OrderQuery;
import com.walden.configure.OrderRequestParams;
import com.walden.factory.QueryServiceFactory;
import com.walden.service.IService;
import com.walden.service.QueryService;
import net.sf.json.JSONArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by walden on 16/7/6.
 */
public class TestClient {
    private static Logger logger = LogManager.getLogger(TestClient.class);

    private TestClient(){

    }

    public JSONArray jsonTest(){
        OrderRequestParams orderRequestParams = new OrderRequestParams();
        orderRequestParams.setOrderid("nn20160624150722");
        IService orderQueryService = new com.walden.service.implement.QueryService(new OrderQuery());
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(orderRequestParams);
        return jsonObject;
    }

    public static void main(String[] args){
        TestClient testClient = new TestClient();
        JSONArray jsonObject = testClient.jsonTest();

        System.out.println(jsonObject);
    }
}
