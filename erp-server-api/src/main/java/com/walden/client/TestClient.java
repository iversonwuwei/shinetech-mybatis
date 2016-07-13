package com.walden.client;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.walden.action.IQuery;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.action.implement.query.OrderQuery;
import com.walden.action.implement.query.UserQuery;
import com.walden.configure.OrderRequestParams;
import com.walden.configure.UserRequestParams;
import com.walden.service.IService;
import com.walden.service.implement.QueryService;
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
        UserRequestParams orderRequestParams = new UserRequestParams();
        orderRequestParams.setUserid("1");
        IService orderQueryService = new com.walden.service.implement.QueryService();
        JSONArray jsonObject = (JSONArray) orderQueryService.findBy(new UserQuery(request), orderRequestParams);
        return jsonObject;
    }

    public static void main(String[] args){
        TestClient testClient = new TestClient();
        JSONArray jsonObject = testClient.jsonTest();

        System.out.println(jsonObject);
    }
}
