package com.netease.kaola.study.spring10.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启包扫描：类似<context:component-scan base-package="com.netease.kaola.study.spring10.aop"/>
@ComponentScan(basePackages = {"com.netease.kaola.study.spring10.aop"})
//自动开启代理：类似<aop:aspectj-autoproxy proxy-target-class="true"/>
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

}
