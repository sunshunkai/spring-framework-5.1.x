/**
 * @author jingyun
 * @date 2019-11-23
 * @describe
 *
 * 1、切面(Aspect)
 * "切面"的官方抽象定义为"一个关注点的模块化,这个关注点可能会横切多个对象".
 * "切面"由ApplicationContext中<aop:aspect>来配置.
 *
 * 2、连接点(JoinPoint)
 * 连接点是指程序执行过程中的某一行为,例如MemberService.get的调用或者MemberService. elete
 * 执行抛出异常等行为.
 *
 * 3、通知(Advice)
 * 通知是指切面对于某个连接点所产生的动作.其中,一个切面可以包含多个通知.
 * 通知有如下几种类型：
 * 	(1)、前置通知
 * 	前置通知是指在某个连接点之前执行的通知,但这个通知不能阻止连接点之前的代码的执行.
 * 	ApplicationContext中在<aop:aspect>里面是有<aop:before>元素进行声明,例如TestAspect中的
 * 	doBefore()方法
 * 	(2)、后置通知
 * 	后置通知是指当某个连接点退出时执行的通知(不论是正常退出还是异常退出).
 * 	ApplicationContext中在<aop:aspect>里面使用<aop:after>元素进行声明.例如,ServiceAspect中
 * 	retrunAfter()方法,Teser中调用UserService.delete抛出异常时,returnAfter方法依然执行.
 * 	(3)返回后置通知
 * 	返回后通知是指在某个连接点正常完成后执行的通知,不包括抛出异常的情况.
 * 	ApplicationContext中在<aop:aspect>里面使用<after-returning>元素声明
 * 	(4)环绕通知
 * 	环绕通知是指包围一个连接点的通知,类似Web的Servlet规范中Filter的doFilter()方法。可以在
 * 	方法的调用前后完成自定义的行为,也可以选择不执行.ApplicationContext中在<aop:aspect>里面
 * 	使用<aop:around>元素进行声明,例如ServiceAspect中的around()方法.
 * 	(5)异常通知
 * 	异常通知是指在方法抛出异常导致退出时执行的通知,ApplicationContext中<aop:aspect>里面
 * 	使用<aop:after-throwing>元素进行声明,例如ServiceAspect中的returnThrow()方法.
 *
 * 4、切入点
 * 切入点是指匹配连接点中的断言,在AOP中通知和一个切入点表达式关联.切面中的所有通知所关注的连接点都是
 * 由切入点表达式决定的.
 *
 * 5、目标对象
 * 目标对象是指被一个或者多个切面所通知的对象.例如AserviceImpl和BserviceImpl.当然在实际运用时,
 * Spring AOP采用代理实现,实际上AOP操作的是TargeObject的代理对象.
 *
 * 6、AOP代理
 * 在Spring AOP中有两种代理方式:JDK动态代理和CGLib代理.默认情况下,目标对象实现了接了时,采用
 * JDK动态代理,例如AserviceImpl;反之,采用CGLib代理,例如BServiceImpl.
 * 强制使用CGLib代理需要将<aop:config>的proxy-target-class属性设置为true
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */















