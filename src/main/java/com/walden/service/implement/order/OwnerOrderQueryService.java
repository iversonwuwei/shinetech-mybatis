package com.walden.service.implement.order;

import com.walden.common.implement.order.OrderQuery;
import com.walden.common.implement.order.OwnerOrderQuery;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/15.
 */
@Service
public class OwnerOrderQueryService extends OrderQueryService {

    @Autowired
    private OrderQuery ownerOrderQuery;

    public OwnerOrderQueryService(){
        super();
    }

    public JSONArray findOrdersBy(String owner){

        return JSONArray.fromObject(ownerOrderQuery.queryBy(owner));
    }
}
