package com.ssk.controller;

<<<<<<< HEAD
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
=======
import com.ssk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

>>>>>>> a6582a8f32433b57552f077ee01e64154f44c427

@Controller
public class TestController implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Autowired
	private TestService testService;

	public TestController(){
		System.out.println("test");
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
