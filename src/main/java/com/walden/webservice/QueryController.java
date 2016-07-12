package com.walden.webservice;

import com.walden.service.iservice.IQueryService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/7/3.
 */
@Controller
@Path("/query")
public class QueryController {

    private static Logger logger = LogManager.getLogger(QueryController.class);
    @Autowired
    private IQueryService orderQueryService;

    @Autowired
    private IQueryService utilQueryService;


    @GET
    @Path("/orders")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JSONArray testString(){
        logger.error("hello log");
        logger.debug("Hello Log Debug");
        return (JSONArray) orderQueryService.query();
    }

    @GET
    @Path("/order")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JSONObject testString1(@QueryParam(value = "id")String id){
        return (JSONObject) orderQueryService.queryBy(id);
    }

    @GET
    @Path("/util")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public JSONArray util(){
        return (JSONArray) utilQueryService.query();
    }
}
