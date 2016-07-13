package com.walden.common.implement.convert;

import com.walden.common.IConvert;
import com.walden.entity.ComplexUserEntity;
import com.walden.entity.UserEntity;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/7/13.
 */
@Component
public class UserJSONArrayConvert implements IConvert {
    private JSONArray jsonArray;
    private List<UserEntity> users;

    @Autowired
    private JSONObjectConvert jsonObjectConvert;

    public UserJSONArrayConvert(){
        jsonArray = new JSONArray();
    }

    @Override
    public JSONArray convert(Object object) {
        users = (List<UserEntity>) object;
        for (UserEntity user : users){
            jsonArray.add(jsonObjectConvert.convert(user));
        }
        return jsonArray;
    }
}
