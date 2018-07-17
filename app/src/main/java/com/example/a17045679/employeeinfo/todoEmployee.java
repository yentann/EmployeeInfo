package com.example.a17045679.employeeinfo;

import java.util.Calendar;

public class todoEmployee {

    private String name;
    private String course;
    private double money;

    public todoEmployee(String name, String course, double money) {
        this.name = name;
        this.course = course;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

//toString()

    @Override
    public String toString() {
        return "todoEmployee{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", money=" + money +
                '}';
    }
}
