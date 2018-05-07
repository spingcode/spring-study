package com.netease.kaola.study.spring07.aop;

import org.aspectj.lang.JoinPoint;

public class Advice {
    public void before(JoinPoint joinPoint)
    {
        System.out.println(joinPoint.getSignature()+":"+joinPoint.getArgs()+":"+joinPoint.getTarget());
    }
    public void after()
    {
        System.out.println("after=========================================");
    }
}
