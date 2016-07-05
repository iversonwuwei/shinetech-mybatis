package com.walden.common.implement.combine;

import com.walden.common.IMap;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class CombineAsMap implements IMap {

    private Map<String, List> maps;

    public CombineAsMap(){
        maps = new HashMap<String, List>();
    }

    @Override
    public Map<String, List> getMap() {
        return maps;
    }

    @Override
    public void addIntoMap(Object key, Object value) {
        maps.put((String) key, (List) value);
    }
}
