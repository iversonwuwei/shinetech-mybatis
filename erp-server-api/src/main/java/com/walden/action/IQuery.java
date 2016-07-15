package com.walden.action;

import com.walden.configure.param.IRequestParam;

/**
 * Created by walden on 16/7/7.
 */
public interface IQuery {

    Object find();

    Object findBy(IRequestParam requestParams);
}
