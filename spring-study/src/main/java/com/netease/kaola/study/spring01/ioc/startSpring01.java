package com.netease.kaola.study.spring01.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class startSpring01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        System.out.println(applicationContext.getBean(Date.class));
    }
}
