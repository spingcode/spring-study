package com.netease.kaola.study.spring01.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class startSpring02_anno {

    @Bean
    public Department department()
    {
        return new Department();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(startSpring02_anno.class);
        Department department = applicationContext.getBean(Department.class);
        System.out.println(department);
    }
}
