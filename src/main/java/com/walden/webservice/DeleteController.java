package com.walden.webservice;

import com.walden.common.IConvert;
import com.walden.common.IDelete;
import com.walden.common.implement.convert.JSONObjectConvert;
import com.walden.service.iservice.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by walden on 16/7/4.
 */
@Controller
@Path("/delete")
public class DeleteController {
    @Autowired
    private IDeleteService deleteService;
    @Autowired
    private IDelete delete;

    private boolean isDeleted;

    @POST
    @Path("/order/{orderid}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteOrder(@PathParam(value = "orderid") String orderid){
        isDeleted = deleteService.delete(orderid);
        return isDeleted;
    }
}
