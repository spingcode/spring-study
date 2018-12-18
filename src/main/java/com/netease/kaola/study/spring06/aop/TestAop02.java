package com.netease.kaola.study.spring06.aop;

import com.netease.kaola.study.spring04.aop.TargetObject;
import com.netease.kaola.study.spring05.aop.TargetClass;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring06.xml");
        TargetObject proxy = (TargetObject)applicationContext.getBean("proxy");
        proxy.function01("aaaaaaa",213213);
    }
}
