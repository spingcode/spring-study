package com.netease.kaola.study.spring05.aop;

public class TargetClass {

    public String function01(String arg, Integer m) {
        System.out.println("com.netease.kaola.study.spring05.aop.TargetClass");
        return arg+m;
    }
    public String function02(String arg, Integer m) {
        System.out.println("com.netease.kaola.study.spring05.aop.TargetClass");
        int a=1/0;
        return arg+m;
    }
}
