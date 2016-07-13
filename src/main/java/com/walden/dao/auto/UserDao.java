package com.walden.dao.auto;

import com.walden.entity.ComplexUserEntity;
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

    @Select("SELECT * FROM goTurf.user;")
    List<UserEntity> findUsers();

    @Select("SELECT * FROM goTurf.user where user_id = #{userid}")
    UserEntity findUserBy(Object userid);
}
