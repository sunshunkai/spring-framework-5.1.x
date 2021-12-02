package com.ssk.anno;


import com.ssk.aop.MethodAdvice;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.ssk")
@Configuration
@EnableAspectJAutoProxy
public class Appconfig {

	/**
	 * 将自定义的代理加入拦截规则
	 * @see MethodAdvice
	 * @return
	 */
	@Bean
	public NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor(){
		NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
		nameMatchMethodPointcutAdvisor.setAdvice(new MethodAdvice());
		// AOP 拦截的方法名
		nameMatchMethodPointcutAdvisor.setMappedName("*");
		return nameMatchMethodPointcutAdvisor;
	}



}
