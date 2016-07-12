package com.walden.action;

import com.walden.configure.OrderRequestParams;
import com.walden.enumeration.ActionEnum;

import java.util.Map;

/**
 * Created by walden on 16/7/8.
 */
public interface IRequest {

    Object doPost(Object postParam);

    Object doGetWithParam(ActionEnum actionEnum, Object requestParams);

    Object doGet(ActionEnum actionEnum);
}
