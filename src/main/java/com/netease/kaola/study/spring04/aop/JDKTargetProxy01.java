package com.netease.kaola.study.spring04.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKTargetProxy01 implements InvocationHandler{

    Object targetObject;

    public JDKTargetProxy01(Object targetObject) {
        this.targetObject = targetObject;
    }
    public Object getProxyObject()
    {
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass());
        System.out.println(targetObject.getClass());
        Object result = method.invoke(targetObject, args);
        return result;
    }
}
