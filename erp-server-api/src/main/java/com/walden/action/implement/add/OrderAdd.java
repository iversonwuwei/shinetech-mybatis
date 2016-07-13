package com.walden.action.implement.add;

import com.walden.action.IAdd;
import com.walden.action.IRequest;
import com.walden.action.implement.MyBatisServerRequest;
import com.walden.enumeration.ActionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/12.
 */
@Component
public class OrderAdd implements IAdd {

    private IRequest request;
    private Object isAdded;

    @Autowired
    public OrderAdd(IRequest request){
        this.request = request;
    }

    @Override
    public Object insert(Object o) {
        isAdded = request.doPost(ActionEnum.orderAdd, o);
        return isAdded;
    }
}
