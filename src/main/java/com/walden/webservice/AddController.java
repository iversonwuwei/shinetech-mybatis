package com.walden.webservice;

import com.walden.common.IConvert;
import com.walden.service.iservice.IAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/7/4.
 */
@Controller
@Path("/add")
public class AddController {
    @Autowired
    private IAddService addService;
    @Qualifier("orderEntityConvert")
    @Autowired
    private IConvert convert;

    @POST
    @Path("/order")
    @Produces(MediaType.APPLICATION_JSON)
    public void addOrder(String data){
        addService.add(convert.convert(data));
    }
}
