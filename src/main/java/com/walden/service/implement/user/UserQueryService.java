package com.walden.service.implement.user;

import com.walden.common.IConvert;
import com.walden.common.IQuery;
import com.walden.common.implement.user.UserDelete;
import com.walden.dao.auto.UserDao;
import com.walden.entity.UserEntity;
import com.walden.service.iservice.IQueryService;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/7/13.
 */
@Service
public class UserQueryService implements IQueryService {
    private static Logger logger = LogManager.getLogger(UserQueryService.class);

    private JSONArray jsonArray = null;
    private JSONObject jsonObject = null;

    @Autowired
    private UserDao userDao;

    @Qualifier("JSONObjectConvert")
    @Autowired
    private IConvert jsonObjectConvert;

    @Override
    public Object query() {
        try{
            List<UserEntity> users = userDao.findUsers();
            System.out.println(users);
            jsonArray = JSONArray.fromObject(users);
        }catch (Exception e){
            logger.info(e.getMessage(), e.fillInStackTrace());
        }
        return jsonArray;
    }

    @Override
    public Object queryBy(Object object) {
        try{
            jsonObject = (JSONObject) jsonObjectConvert.convert(userDao.findUserBy(object));
        }catch (Exception e){
            logger.info(e.getMessage(), e.fillInStackTrace());
        }
        return jsonObject;
    }
}
