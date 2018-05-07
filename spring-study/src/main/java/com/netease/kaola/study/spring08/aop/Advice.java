package com.netease.kaola.study.spring08.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
    public void before(JoinPoint joinPoint)
    {
        System.out.println("=============before================");
    }
    public void after(JoinPoint joinPoint)
    {
        System.out.println("=============after================");
    }
    public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===================round before=================");
        Object o = joinPoint.proceed();
        System.out.println("===================round after=================");
        return o;
    }
    public void afterThrowing(JoinPoint joinPoint,Exception exp)
    {
        System.out.println("--------------------异常后通知，发生了异常："+exp.getMessage()+"--------------------");
    }
    //返回结果后通知
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        System.out.println("--------------------返回结果后通知--------------------");
        System.out.println("结果是："+result);
    }
}
