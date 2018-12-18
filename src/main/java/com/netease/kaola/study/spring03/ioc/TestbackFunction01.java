package com.netease.kaola.study.spring03.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestbackFunction01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring04.xml");
        Department department01 = applicationContext.getBean(Department.class);
        System.out.println(department01);
    }
}
