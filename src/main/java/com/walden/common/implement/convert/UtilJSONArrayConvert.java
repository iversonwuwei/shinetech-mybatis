package com.walden.common.implement.convert;

import com.walden.common.IConvert;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/7/3.
 */
@Component
public class UtilJSONArrayConvert implements IConvert {

    public UtilJSONArrayConvert(){

    }

    @Override
    public Object convert(Object object) {
        return JSONArray.fromObject(object);
    }
}
