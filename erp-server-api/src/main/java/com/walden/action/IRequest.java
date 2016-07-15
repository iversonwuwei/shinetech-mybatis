package com.walden.action;

import com.walden.configure.param.IRequestParam;
import com.walden.enumeration.ActionEnum;

/**
 * Created by walden on 16/7/8.
 */
public interface IRequest {

    Object doPost(ActionEnum actionEnum, IRequestParam postParam);

    Object doGetWithParam(IRequestParam requestParams);

    Object doGet(ActionEnum actionEnum);
}
