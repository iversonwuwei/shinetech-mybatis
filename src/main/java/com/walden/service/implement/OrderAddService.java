package com.walden.service.implement;

import com.walden.common.IAdd;
import com.walden.entity.OrderEntity;
import com.walden.service.iservice.IAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/4.
 */
@Service
public class OrderAddService implements IAddService {

    @Autowired
    private IAdd addOrder;

    private OrderEntity orderEntity;

    @Override
    public void add(Object object) {
        orderEntity = (OrderEntity) object;
        if (orderEntity != null) {
            addOrder.add(orderEntity);
        }
    }
}
