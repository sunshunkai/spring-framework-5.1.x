package com.ssk.anno;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.ssk")
@Configuration
@EnableAspectJAutoProxy
public class Appconfig {
}
