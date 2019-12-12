package com.ssk.controller;

import com.ssk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class TestController {

	@Autowired
	private TestService testService;

	public TestController(){
		System.out.println("test");
	}

}
