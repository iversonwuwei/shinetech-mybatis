package com.walden.dao.manual;

import com.walden.common.IMap;
import com.walden.common.implement.convert.UtilJSONArrayConvert;
import com.walden.dao.auto.CutterDao;
import com.walden.dao.auto.DriverDao;
import com.walden.dao.auto.LayerDao;
import com.walden.dao.auto.TurfDao;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/7/4.
 */
@Component
public class UtilJSONDao implements IJSONDao{

    @Autowired
    private CutterDao cutterDao;
    @Autowired
    private DriverDao driverDao;
    @Autowired
    private LayerDao layerDao;
    @Autowired
    private TurfDao turfDao;
    @Autowired
    private UtilJSONArrayConvert utilJSONArrayConvert;

    private Map<String, List> maps;
    private IMap createMap;

    public UtilJSONDao(){

    }

    public JSONArray getJSONString(Object object){
        createMap = (IMap) object;
        createMap.addIntoMap("cutter", cutterDao.getAllCutters());
        createMap.addIntoMap("driver", driverDao.getAllDrivers());
        createMap.addIntoMap("layer", layerDao.getAllLayers());
        createMap.addIntoMap("turf", turfDao.getAllTurf());
        maps = createMap.getMap();
        return (JSONArray) utilJSONArrayConvert.convert(maps);
    }
}
