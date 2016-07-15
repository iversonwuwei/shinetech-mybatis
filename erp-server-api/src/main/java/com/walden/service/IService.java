package com.walden.service;

import com.walden.action.IQuery;
import com.walden.configure.param.IRequestParam;

/**
 * Created by walden on 16/7/11.
 */
public interface IService {

    Object find(IQuery query);

    Object findBy(IQuery query, IRequestParam requestParams);

}
