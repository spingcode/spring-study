package com.netease.kaola.study.spring02.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 通过属性进行注入：必须要有set方法
* */
public class TestIOC02 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring02.xml");
        System.out.println(applicationContext.getBean(Department.class));
    }
}
