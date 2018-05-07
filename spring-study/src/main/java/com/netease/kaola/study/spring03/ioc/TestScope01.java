package com.netease.kaola.study.spring03.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import com.netease.kaola.study.spring01.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        Department department01 = applicationContext.getBean(Department.class);
        Department department02 = applicationContext.getBean(Department.class);
        System.out.println(department01==department02);
        User user01 = applicationContext.getBean("user", User.class);
        User user02 = applicationContext.getBean("user", User.class);
        System.out.println(user01==user02);
    }
}
