package com.cn.suneee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.suneee.consumer.DeliversingleConsumer;
import com.mysql.jdbc.log.Log;


@Controller  
@RequestMapping("/deliversingle")
public class DeliversingleController {
	
	@Autowired
	DeliversingleConsumer deliversingleConsumer;
	
	@RequestMapping("/showUser1")
	public String showUser1(){
		System.out.println("ok==============ok");
		return "showUser";
	}
	
			
	@RequestMapping(value = { "/getDeliverCarPage" }, method = RequestMethod.GET,produces="text/html;charset=utf-8")
	public String getDeliverCarPage(String message1){
		System.out.println("ok==============ok"+message1);
		return "showUser";
	}
}
