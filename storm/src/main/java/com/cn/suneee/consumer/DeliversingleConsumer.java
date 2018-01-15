package com.cn.suneee.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.suneee.model.DeliversingleDO;
import com.cn.suneee.service.DeliversingleService;

@Service("deliversingleConsumer")
public class DeliversingleConsumer {
	
	@Autowired
	DeliversingleService deliversingleService;
	
	@Transactional(readOnly=true)
	public DeliversingleDO getUserById(String userId){
		return deliversingleService.getUserById(userId);
	}
}
