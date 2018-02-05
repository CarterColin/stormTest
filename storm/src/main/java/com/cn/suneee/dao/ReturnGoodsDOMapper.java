package com.cn.suneee.dao;

import com.cn.suneee.model.ReturnGoodsDO;

public interface ReturnGoodsDOMapper {
    int deleteByPrimaryKey(String returngoodsid);

    int insert(ReturnGoodsDO record);

    int insertSelective(ReturnGoodsDO record);

    ReturnGoodsDO selectByPrimaryKey(String returngoodsid);

    int updateByPrimaryKeySelective(ReturnGoodsDO record);

    int updateByPrimaryKey(ReturnGoodsDO record);
}