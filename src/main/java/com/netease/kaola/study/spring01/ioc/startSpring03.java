package com.netease.kaola.study.spring01.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import com.netease.kaola.study.spring01.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.util.Date;

/*
* 使用注解配置并且加载其他XML文件，添加包扫描
* */
@Configuration
@ComponentScan(basePackages = {"com.netease.kaola.study.spring01"})
@ImportResource({"spring01.xml"})
@Import({startSpring02_anno.class})
public class startSpring03 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(startSpring03.class);
        System.out.println(applicationContext.getBean(User.class));
        System.out.println(applicationContext.getBean(Date.class));
        System.out.println(applicationContext.getBean(Department.class));
    }
}
