package com.netease.kaola.study.spring04.aop;

public class TargetObject implements interfaceObject{

    @Override
    public String function01(String arg, Integer m) {
        System.out.println("com.netease.kaola.study.spring04.aop.TargetObject");
        return arg+m;
    }
}
