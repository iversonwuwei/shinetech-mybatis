package com.walden.common.implement.convert;

import com.walden.common.IConvert;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/3.
 */
@Component
public class JSONObjectConvert implements IConvert {

    private JSONObject jsonObject;

    public JSONObjectConvert(){
    }

    @Override
    public JSONObject convert(Object jsonString) {
        if (jsonString != null || !jsonString.equals("")){
            jsonObject = JSONObject.fromObject(jsonString);
            return jsonObject;
        }
        return null;
    }
}
