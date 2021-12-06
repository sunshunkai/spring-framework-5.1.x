package com.ssk;

import com.ssk.anno.Appconfig;
import com.ssk.controller.TestController;
import com.ssk.service.TestService;
import com.ssk.service.TxService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MySpring {
	public static void main(String[] args) throws SQLException {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);

//		TestController bean = applicationContext.getBean(TestController.class);
//		bean.hello();

//		TestService testService = applicationContext.getBean(TestService.class);
//		testService.tx();

		TxService txService = applicationContext.getBean(TxService.class);
		txService.tx();


	}
}
