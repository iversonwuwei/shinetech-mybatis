package com.walden.webservice;

import com.walden.service.iservice.IQueryService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/7/2.
 */
@Controller
@Path("/test")
public class TestController {

    @Autowired
    private IQueryService orderQueryService;


    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JSONArray testString(){
        return (JSONArray) orderQueryService.query();
    }

    @GET
    @Path("/hello1")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JSONObject testString1(@QueryParam(value = "orderid")String orderid){
        return (JSONObject) orderQueryService.queryBy(orderid);
    }
}
