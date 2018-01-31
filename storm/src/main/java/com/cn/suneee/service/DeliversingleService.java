package com.cn.suneee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.suneee.dao.DeliversingleDOMapper;
import com.cn.suneee.model.DeliversingleDO;


@Service("deliversingleService") 
public class DeliversingleService {
	
	@Autowired
	DeliversingleDOMapper deliversingleDOMapper;
	
	public DeliversingleDO getUserById(String userId) {   
        return deliversingleDOMapper.selectByPrimaryKey(userId);
    }  
}
