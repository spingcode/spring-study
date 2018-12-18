package com.netease.kaola.study.spring03.ioc;

import com.netease.kaola.study.spring01.ioc.entity.Student;
import com.netease.kaola.study.spring01.ioc.entity.Teacher;
import com.netease.kaola.study.spring01.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 注解扫描测试
* */
public class TestComponentScan01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring05.xml");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);
        Teacher teacher =applicationContext.getBean(Teacher.class);
        System.out.println(teacher);
    }
}
