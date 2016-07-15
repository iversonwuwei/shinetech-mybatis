package com.walden.common.implement.order;

import com.walden.dao.auto.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/15.
 */
@Component
public class OwnerOrderQuery extends OrderQuery {

    @Autowired
    private OrderDao orderDao;

    public OwnerOrderQuery(){
        super();
    }

    @Override
    public Object queryBy(Object object) {

        return orderDao.findByOwner((String) object);
    }
}
