package com.walden.action.implement.delete;

import com.walden.action.IDelete;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/12.
 */
@Component
public class OrderDelete implements IDelete {

    private IRequest request;

    @Autowired
    public OrderDelete(IRequest request){
        this.request = request;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean deleteBy(Object o) {
        return false;
    }
}
