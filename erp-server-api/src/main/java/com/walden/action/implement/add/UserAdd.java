package com.walden.action.implement.add;

import com.walden.action.IAdd;
import com.walden.action.IRequest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walden on 16/7/13.
 */
public class UserAdd implements IAdd {
    private IRequest request;

    @Autowired
    public UserAdd(IRequest request){
        this.request = request;
    }

    @Override
    public Object insert(Object o) {
        return null;
    }
}
