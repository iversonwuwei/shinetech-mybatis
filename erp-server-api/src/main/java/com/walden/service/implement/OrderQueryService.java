package com.walden.service.implement;

import com.walden.action.*;
import com.walden.service.QueryService;
import net.sf.json.JSONArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by walden on 16/7/8.
 */
public class OrderQueryService implements QueryService {

    private static Logger logger = LogManager.getLogger(OrderQueryService.class);

    private IQuery query;

    public OrderQueryService(IQuery query) {
        this.query = query;
    }

    @Override
    public JSONArray find() {
        JSONArray jsonObject = (JSONArray) query.find();
        return jsonObject;
    }

    @Override
    public Object findBy(Object requestParams) {
        return null;
    }
}
