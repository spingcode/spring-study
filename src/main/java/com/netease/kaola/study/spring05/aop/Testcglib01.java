package com.netease.kaola.study.spring05.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Testcglib01 implements MethodInterceptor{

    Object targetObject;

    public Testcglib01(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(targetObject.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        //代理对象，不知道在这干嘛
        System.out.println(o.getClass());
        //第一个是方法对象可以调用反射的方法，第二个是cglib代理产生的方法代理对象
        System.out.println(method.getClass());
        System.out.println(methodProxy.getClass());
        return methodProxy.invoke(targetObject,objects);
    }
}
