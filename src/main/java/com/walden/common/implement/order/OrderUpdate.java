package com.walden.common.implement.order;

import com.walden.common.IUpdate;
import com.walden.dao.auto.OrderDao;
import com.walden.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class OrderUpdate implements IUpdate {

    @Autowired
    private OrderDao orderDao;

    private OrderEntity orderEntity;
    private boolean updated = false;

    @Override
    public boolean update(Object object) {
        orderEntity = (OrderEntity) object;
        if (orderEntity != null){
            orderDao.updateOrder(orderEntity);
            updated = true;
        }

        return updated;
    }
}
