package com.walden.common.implement.convert;

import com.walden.common.IConvert;
import com.walden.entity.OrderEntity;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class OrderEntityConvert implements IConvert {
    private OrderEntity orderEntity;
    private JSONObject jsonObject;

    public OrderEntityConvert(){

    }

    @Override
    public Object convert(Object object) {
        jsonObject = JSONObject.fromObject(object);
        orderEntity = (OrderEntity) JSONObject.toBean(jsonObject);
        return orderEntity;
    }
}
