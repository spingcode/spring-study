package com.netease.kaola.study.spring09.aop;

import org.springframework.stereotype.Component;

@Component
public class TargetSubject {
    public String function01(String arg, Integer m) {
        System.out.println("com.netease.kaola.study.spring09.aop.TargetSubject");
        return arg+m;
    }
    public String function02(String arg, Integer m) {
        System.out.println("com.netease.kaola.study.spring09.aop.TargetSubject");
        int a=1/0;
        return arg+m;
    }
}
