package com.walden.service.implement.order;

import com.walden.common.IConvert;
import com.walden.common.implement.order.OrderQuery;
import com.walden.dao.auto.OrderDao;
import com.walden.entity.OrderEntity;
import com.walden.service.iservice.IQueryService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/3.
 */
@Service
public class OrderQueryService implements IQueryService {

    private static Logger logger = LoggerFactory.getLogger(OrderQueryService.class);

    private JSONArray jsonArray = null;
    private OrderEntity orderEntity = null;

    @Autowired
    private OrderDao orderDao;

    @Qualifier("JSONObjectConvert")
    @Autowired
    private IConvert jsonObjectConvert;

    @Override
    public JSONArray query() {
        try{
            jsonArray = JSONArray.fromObject(orderDao.getAllOrders());
        }catch (Exception e){
            logger.info(e.getMessage(), e.fillInStackTrace());
        }
        return jsonArray;
    }

    @Override
    public Object queryBy(Object object) {
        try{
            orderEntity = orderDao.selectById((String) object);
        }catch (Exception e){
            logger.info(e.getMessage(), e.fillInStackTrace());
        }
        return jsonObjectConvert.convert(orderEntity);
    }
}
