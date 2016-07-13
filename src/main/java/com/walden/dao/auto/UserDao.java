package com.walden.dao.auto;

import com.walden.entity.UserEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by walden on 16/7/13.
 */
@Component
@Transactional
public interface UserDao {

    @Select("")
    List<UserEntity> findUsers();

    @Select("")
    UserEntity findUserBy(Object userid);
}
