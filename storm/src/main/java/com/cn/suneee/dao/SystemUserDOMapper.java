package com.cn.suneee.dao;

import java.util.List;
import java.util.Map;

import com.cn.suneee.model.SystemUserDO;

public interface SystemUserDOMapper {
    int insert(SystemUserDO record);

    int insertSelective(SystemUserDO record);

    List<SystemUserDO> selectSystemUserDO(Map<String, Object> reqMap);
}