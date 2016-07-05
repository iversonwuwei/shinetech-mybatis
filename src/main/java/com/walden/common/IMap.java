package com.walden.common;

import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/7/4.
 */
public interface IMap {

    Map<String, List> getMap();

    void addIntoMap(Object key, Object value);
}
