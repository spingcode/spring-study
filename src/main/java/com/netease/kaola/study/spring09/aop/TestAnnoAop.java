package com.netease.kaola.study.spring09.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring09.xml");
        TargetSubject targetSubject = (TargetSubject)applicationContext.getBean(TargetSubject.class);
        targetSubject.function01("adadasdasd",1321321);
       // targetSubject.function02("adasdasdasdas",2131321);
    }
}
