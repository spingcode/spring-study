package com.netease.kaola.study.spring02.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import com.netease.kaola.study.spring01.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
* 通过构造器进行注入
* */
@Configuration
public class TestIOC01 {

    @Bean
    public User user()
    {
        return new User(12,"aaaa");
    }
    public static void main(String[] args) {
        //XML进行构造器注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        System.out.println(applicationContext.getBean(Department.class));
        applicationContext = new AnnotationConfigApplicationContext(TestIOC01.class);
        System.out.println(applicationContext.getBean(User.class));
    }
}
