package com.walden.service.implement;

import com.walden.common.IDelete;
import com.walden.entity.OrderEntity;
import com.walden.service.iservice.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/7/4.
 */
@Service
public class OrderDeleteService implements IDeleteService {

    @Autowired
    private IDelete delete;

    private boolean isDeleted;

    public OrderDeleteService(){

    }

    @Override
    public boolean delete(Object object) {
        if (delete != null){
            isDeleted = delete.delete(object);
        }
        return isDeleted;
    }
}
