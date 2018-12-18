package com.netease.kaola.study.spring10.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAllAnno01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        TargetSubject targetSubject = applicationContext.getBean(TargetSubject.class);
        targetSubject.function01("a",213);
    }
}
