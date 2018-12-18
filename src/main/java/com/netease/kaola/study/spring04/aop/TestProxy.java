package com.netease.kaola.study.spring04.aop;

public class TestProxy {
    public static void main(String[] args) {

        interfaceObject interfaceObject = (com.netease.kaola.study.spring04.aop.interfaceObject) new JDKTargetProxy01(new TargetObject()).getProxyObject();
        System.out.println(interfaceObject.function01("aaaaa",11));
    }
}
