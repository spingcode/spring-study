package com.netease.kaola.study.spring07.aop;

import com.netease.kaola.study.spring05.aop.TargetClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProxy01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring07.xml");
        TargetClass targetClass = (TargetClass)applicationContext.getBean("targetClass");
        targetClass.function01("aaaaaaaa",213214);
    }
}
