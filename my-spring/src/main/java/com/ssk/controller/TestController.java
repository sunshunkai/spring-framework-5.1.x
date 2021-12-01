package com.ssk.controller;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

import com.ssk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class TestController implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Autowired
	private TestService testService;

	public TestController(){
		System.out.println("test");
	}

	public String hello(){
		System.out.println("hello");
		return "hello";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}
}
