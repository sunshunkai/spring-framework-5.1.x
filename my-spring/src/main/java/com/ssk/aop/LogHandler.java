package com.ssk.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogHandler {

	public LogHandler(){
		System.out.println("======");
	}

	@Pointcut("within(com.ssk.controller..*)")
	public void logPrint() {}

	@Around("logPrint()")
	public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
		//环绕通知处理方法
		int numAttempts = 0;
		Exception lockFailureException;
		do {
			numAttempts++;
			try {
				System.out.println("环绕通知方法［ doConcurrentOperation(ProceedingJoinPoint pjp) ］.............");
				return pjp.proceed();
			}
			catch(Exception ex) {
				lockFailureException = ex;
			}
		}
		while(numAttempts <= 3);
		throw lockFailureException;
	}

}
