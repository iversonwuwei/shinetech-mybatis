package com.walden.common.implement.order;

import com.mysql.cj.mysqlx.protobuf.MysqlxDatatypes;
import com.walden.common.IDelete;
import com.walden.dao.auto.OrderDao;
import com.walden.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class OrderDelete implements IDelete {
    @Autowired
    private OrderDao orderDao;

    private boolean isDeleted = false;

    @Override
    public boolean delete(Object object) {
        if ((object != null) || !object.equals("")) {
            orderDao.deleteOrderBy((String) object);
            isDeleted = true;
        }
        return isDeleted;
    }
}
