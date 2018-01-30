package com.cn.suneee.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cn.suneee.service.SystemUserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	SystemUserService systemUserService;
	
	@RequestMapping(value="login",method={RequestMethod.GET, RequestMethod.POST})
	public String loing(HttpSession session, Model model,
			@RequestParam(value="name", required=false) String name,
			@RequestParam(value="password", required=false) String password){
		if(name == null && password == null) return "login";
		Map map = systemUserService.User(name);
		if(name.equals(map.get("name")) && password.equals(map.get("password"))){
			return "showUser";
		}else{
			return "login";
		}
	}
}
