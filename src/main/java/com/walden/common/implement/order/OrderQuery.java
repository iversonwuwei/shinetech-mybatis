package com.walden.common.implement.order;

import com.walden.common.IQuery;
import com.walden.dao.auto.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/15.
 */
@Component
public abstract class OrderQuery implements IQuery {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Object query() {
        return orderDao.getAllOrders();
    }

    @Override
    public Object queryBy(Object object) {
        return orderDao.selectById((String) object);
    }
}
