package com.netease.kaola.study.spring05.aop;

import com.netease.kaola.study.spring04.aop.TargetObject;

public class TestProxy {
    public static void main(String[] args) {
        Testcglib01 testcglib01 = new Testcglib01(new TargetClass());
        TargetClass proxyObject = (TargetClass) testcglib01.getProxyObject();
        System.out.println(proxyObject.function01("aaa",1212));
    }
}
