package com.walden.client;

import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.client.RestTemplate;

/**
 * Created by walden on 16/7/6.
 */
public class TestClient {

    private JSONObject jsonArray;
    private static Logger logger = LogManager.getLogger(TestClient.class);

    public TestClient(){

    }

    public JSONObject printTest(String orderid){
        try {
            if (orderid != null || !orderid.equals("")) {
                RestTemplate restTemplate = new RestTemplate();
                String URL = "http://localhost:8088/query/order?orderid={orderid}";
                jsonArray = restTemplate.getForObject(URL, JSONObject.class, orderid);
            }
        }catch (Exception e){
            logger.error(e.getMessage()+e.getStackTrace());
        }
        return jsonArray;
    }
}
