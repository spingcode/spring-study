package com.netease.kaola.study.spring04.aop;

import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {

        /*interfaceObject interfaceObject = (com.netease.kaola.study.spring04.aop.interfaceObject) new JDKTargetProxy01(new TargetObject()).getProxyObject();
        System.out.println(interfaceObject);*/
        TargetObject targetObject = new TargetObject();
        interfaceObject proxyInstance = (interfaceObject) Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy");
                return method.invoke(targetObject, args);
            }
        });
        System.out.println(proxyInstance.function01("zz",1));
    }
}
