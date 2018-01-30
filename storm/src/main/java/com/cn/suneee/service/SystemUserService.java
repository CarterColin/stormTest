package com.cn.suneee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.suneee.dao.SystemUserDOMapper;
import com.cn.suneee.model.SystemUserDO;

@Service("systemUserService")
public class SystemUserService {

	@Autowired
	SystemUserDOMapper systemUserDOMapper;
	
	public Map User(String name){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("user_name", name);
		List<SystemUserDO> list = new ArrayList<SystemUserDO>();
		list = systemUserDOMapper.selectSystemUserDO(map);
		for (SystemUserDO systemUserDO : list) {
			map.put("name", systemUserDO.getUserName());
			map.put("password", systemUserDO.getPassword());
		}
		return map;
	}
}
