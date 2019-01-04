package com.netease.kaola.study.spring05.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestProxy {
    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //代理对象
                System.out.println("o:"+o.getClass());
                //第一个是方法对象可以调用反射的方法，第二个是cglib代理产生的方法代理对象
                System.out.println("method:"+method.getClass());
                System.out.println("methodProxy:"+methodProxy.getClass());
                System.out.println("method.invoke(targetClass,args):"+method.invoke(targetClass,objects));
                System.out.println("methodProxy.invoke(targetClass, objects):"+methodProxy.invoke(targetClass, objects));
                System.out.println("--------------------------------------------------------------");
                return methodProxy.invoke(targetClass, objects);
            }
        });
        enhancer.setSuperclass(targetClass.getClass());
        TargetClass o = (TargetClass) enhancer.create();
        System.out.println(o.function01("zz", 12));
    }
}
