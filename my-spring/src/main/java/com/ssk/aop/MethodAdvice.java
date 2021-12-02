package com.ssk.aop;

import org.springframework.aop.*;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author 惊云
 * @date 2021/12/2 15:03
 * @see NameMatchMethodPointcutAdvisor 加入到拦截规则中
 */
public class MethodAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before");
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("afterReturning");
	}

}
