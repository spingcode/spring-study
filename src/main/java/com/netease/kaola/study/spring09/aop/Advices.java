package com.netease.kaola.study.spring09.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {

    @Pointcut("execution(* com.netease.kaola.study.spring09.aop.TargetSubject.*(..))")
    public void init() { }
    @Before(value = "init()")
    public void before(JoinPoint joinPoint)
    {
        System.out.println("=============before================");
    }

    @After(value = "init()")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("=============after================");
    }
    @Around(value = "init()")
    public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===================round before=================");
        Object o = joinPoint.proceed();
        System.out.println("===================round after=================");
        return o;
    }
    @AfterThrowing(value = "init()",throwing = "exp")
    public void afterThrowing(JoinPoint joinPoint,Exception exp)
    {
        System.out.println("--------------------异常后通知，发生了异常："+exp.getMessage()+"--------------------");
    }
    //返回结果后通知
    @AfterReturning(value = "init()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        System.out.println("--------------------返回结果后通知--------------------");
        System.out.println("结果是："+result);
    }
}
