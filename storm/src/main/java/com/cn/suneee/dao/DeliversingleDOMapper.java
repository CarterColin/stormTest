package com.cn.suneee.dao;

import com.cn.suneee.model.DeliversingleDO;

public interface DeliversingleDOMapper {
    int deleteByPrimaryKey(String deliverno);

    int insert(DeliversingleDO record);

    int insertSelective(DeliversingleDO record);

    DeliversingleDO selectByPrimaryKey(String deliverno);

    int updateByPrimaryKeySelective(DeliversingleDO record);

    int updateByPrimaryKey(DeliversingleDO record);
}