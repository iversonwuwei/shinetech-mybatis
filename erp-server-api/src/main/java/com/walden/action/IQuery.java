package com.walden.action;

import net.sf.json.JSONObject;

/**
 * Created by walden on 16/7/7.
 */
public interface IQuery {

    Object find();

    Object findBy(Object requestParams);
}
