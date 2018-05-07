package com.netease.kaola.study.spring08.aop;

import com.netease.kaola.study.spring05.aop.TargetClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring08.xml");
        TargetClass targetClass = (TargetClass)applicationContext.getBean("targetClass");
        targetClass.function02("aaa",212342425);
    }
}
