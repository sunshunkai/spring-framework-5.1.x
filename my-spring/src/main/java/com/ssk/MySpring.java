package com.ssk;

import com.ssk.anno.Appconfig;
import com.ssk.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpring {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		TestController bean = applicationContext.getBean(TestController.class);

		bean.hello();


	}
}
