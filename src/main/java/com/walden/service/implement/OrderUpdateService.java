package com.walden.service.implement;

import com.walden.common.IUpdate;
import com.walden.entity.OrderEntity;
import com.walden.service.iservice.IUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/4.
 */
@Service
public class OrderUpdateService implements IUpdateService {

    @Autowired
    private IUpdate update;

    private boolean updated = false;
    private OrderEntity orderEntity;


    @Override
    public boolean update(Object entity) {
        orderEntity = (OrderEntity) entity;
        if (orderEntity != null){
            updated = update.update(entity);
        }
        return updated;
    }
}
