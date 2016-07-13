package com.walden.common.implement.user;

import com.walden.common.IQuery;
import com.walden.dao.auto.UserDao;
import com.walden.entity.ComplexUserEntity;
import com.walden.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by walden on 16/7/13.
 */
public class UserQuery implements IQuery {

    @Autowired
    private UserDao userDao;

    private List<UserEntity> users;

    @Override
    public Object query() {
        users = userDao.findUsers();
        return users;
    }

    @Override
    public Object queryBy(Object object) {
        return null;
    }
}
