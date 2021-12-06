package com.ssk.anno;


import com.alibaba.druid.pool.DruidDataSource;
import com.ssk.aop.MethodAdvice;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@ComponentScan(basePackages = "com.ssk")
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Appconfig {

	/**
	 * 将自定义的代理加入拦截规则
	 * InvocationHandler实现动态代理：如果被代理的类未实现任何接口，那么不能采用通过InvocationHandler动态代理的方式去代理它的行为。
	 * CGLIB实现动态代理：通过CGLIB成功创建的动态代理，实际是被代理类的一个子类。那么如果被代理类被标记成final，也就无法通过CGLIB去创建动态代理。
	 *
	 * @see MethodAdvice
	 * @return
	 */
//	@Bean
	public NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor(){
		NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
		nameMatchMethodPointcutAdvisor.setAdvice(new MethodAdvice());
		// AOP 拦截的方法名
		nameMatchMethodPointcutAdvisor.setMappedName("*");
		return nameMatchMethodPointcutAdvisor;
	}

	@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssk");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		dataSource.setMaxActive(10);
		return dataSource;
	}

	@Bean
	@Primary
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}

	@Bean
	public DataSourceTransactionManager platformTransactionManager(DataSource dataSource){
		DataSourceTransactionManager platformTransactionManager = new DataSourceTransactionManager();
		platformTransactionManager.setDataSource(dataSource);
		return platformTransactionManager;
	}



}
