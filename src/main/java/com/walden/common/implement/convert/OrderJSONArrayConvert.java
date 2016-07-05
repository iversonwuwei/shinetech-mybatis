package com.walden.common.implement.convert;

import com.walden.common.IConvert;
import com.walden.entity.OrderEntity;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/7/3.
 */
@Component
public class OrderJSONArrayConvert implements IConvert {

    private JSONArray jsonArray;
    private List<OrderEntity> orders;

    @Autowired
    private JSONObjectConvert jsonObjectConvert;

    public OrderJSONArrayConvert(){
        jsonArray = new JSONArray();
    }

    @Override
    public JSONArray convert(Object object) {
        orders = (List<OrderEntity>) object;
        for (OrderEntity order : orders){
            jsonArray.add(jsonObjectConvert.convert(order));
        }
        return jsonArray;
    }
}
