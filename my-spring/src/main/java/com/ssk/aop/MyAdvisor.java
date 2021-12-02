package com.ssk.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * @author 惊云
 * @date 2021/12/2 14:33
 * @see Advisor
 */
@Component
public class MyAdvisor implements PointcutAdvisor {

	@Override
	public Advice getAdvice() {
		return new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				System.out.println("BeforeAdvice实现，在目标方法被调用前调用，目标方法是：" + method.getDeclaringClass().getName() + "."
						+ method.getName());
			}
		};
	}

	@Override
	public boolean isPerInstance() {
		return true;
	}

	@Override
	public Pointcut getPointcut() {
		/**
		 * 简单的Pointcut定义，切点。
		 */
		return new Pointcut() {

			@Override
			public ClassFilter getClassFilter() {
				return ClassFilter.TRUE;
			}

			@Override
			public MethodMatcher getMethodMatcher() {
				return new MethodMatcher() {

					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						String methodName = method.getName();
						// 拦截规则
						if ("hello".equals(methodName)) {
							return true;
						}
						return false;
					}

					@Override
					public boolean isRuntime() {
						return false;
					}

					@Override
					public boolean matches(Method method, Class<?> targetClass, Object... args) {
						return false;
					}
				};
			}
		};

	}
}
