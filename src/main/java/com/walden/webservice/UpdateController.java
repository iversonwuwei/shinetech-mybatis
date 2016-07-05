package com.walden.webservice;

import com.walden.common.IConvert;
import com.walden.common.IUpdate;
import com.walden.service.iservice.IUpdateService;
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
@Path("/update")
public class UpdateController {
    @Autowired
    private IUpdateService updateService;
    @Qualifier("orderEntityConvert")
    @Autowired
    private IConvert convert;

    private boolean updated;

    @POST
    @Path("/order")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateOrder(String data){
        updated = updateService.update(convert.convert(data));
        return updated;
    }
}
