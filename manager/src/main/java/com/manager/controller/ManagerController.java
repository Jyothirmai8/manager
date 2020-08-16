package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manager.dao.ManagerDAOInterface;
import com.manager.entity.Manager;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@DefaultProperties(defaultFallback = "defaultMethod")
public class ManagerController {
	
	String defaultMethod() {
		return "manager services";
	}
	
	@Autowired
	private ManagerDAOInterface mgrdao;
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/mgrdetails")
	public List<Manager> displayAllManagerjpa(){
		System.out.println("Test");
		List<Manager> ml=mgrdao.getdaoalljpa();
		System.out.println("Test"+ml);
		return ml;
	}
	
}
