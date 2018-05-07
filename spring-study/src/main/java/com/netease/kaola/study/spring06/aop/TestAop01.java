package com.netease.kaola.study.spring06.aop;

import com.netease.kaola.study.spring05.aop.TargetClass;
import org.springframework.aop.framework.ProxyFactory;

public class TestAop01 {
    public static void main(String[] args) {
        ProxyFactory factory= new ProxyFactory();
        factory.setTarget(new TargetClass());
        factory.addAdvice(new BeforeAdvice());
        factory.addAdvice(new AfterAdvice());
        factory.addAdvice(new SurroundAdvice());
        TargetClass proxy = (TargetClass)factory.getProxy();
        proxy.function01("aaaaaaaa",13567);
    }
}
