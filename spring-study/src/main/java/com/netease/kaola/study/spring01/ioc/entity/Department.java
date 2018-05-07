package com.netease.kaola.study.spring01.ioc.entity;


public class Department {
    private int id;
    private int departmentName;

    public void init()
    {
        System.out.println("init");
    }
    public void destory()
    {
        System.out.println("destory");
    }
    public Department() {
    }

    public Department(int id, int departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName=" + departmentName +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(int departmentName) {
        this.departmentName = departmentName;
    }
}
