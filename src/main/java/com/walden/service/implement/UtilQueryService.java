package com.walden.service.implement;

import com.walden.common.IConvert;
import com.walden.common.IMap;
import com.walden.dao.auto.CutterDao;
import com.walden.dao.auto.DriverDao;
import com.walden.dao.auto.LayerDao;
import com.walden.dao.auto.TurfDao;
import com.walden.dao.manual.IJSONDao;
import com.walden.service.iservice.IQueryService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by walden on 16/7/3.
 */
@Service
public class UtilQueryService implements IQueryService {

    @Autowired
    private IJSONDao ijsonDao;
    @Autowired
    private IMap iMap;

    private Map<String, List> map;

    @Override
    public JSONArray query() {
        return (JSONArray) ijsonDao.getJSONString(iMap);
    }

    @Override
    public Object queryBy(Object object) {
        return null;
    }
}
