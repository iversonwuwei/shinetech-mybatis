package com.walden.configure.param;

import com.walden.action.IMap;
import com.walden.enumeration.ActionEnum;

import java.awt.*;
import java.util.Map;

/**
 * Created by walden on 16/7/15.
 */
public interface IRequestParam extends IMap {

    ActionEnum getActionEnum();

    void setActionEnum(ActionEnum actionEnum);

    Map<Object, Object> getMap();
}
