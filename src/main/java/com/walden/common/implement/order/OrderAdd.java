package com.walden.common.implement.order;

import com.walden.common.IAdd;
import com.walden.dao.auto.OrderDao;
import com.walden.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class OrderAdd implements IAdd {

    @Autowired
    private OrderDao orderDao;
    private OrderEntity orderEntity;

    @Override
    public void add(Object object) {
        orderEntity = (OrderEntity) object;
        orderDao.insertInto(orderEntity);
    }
}
