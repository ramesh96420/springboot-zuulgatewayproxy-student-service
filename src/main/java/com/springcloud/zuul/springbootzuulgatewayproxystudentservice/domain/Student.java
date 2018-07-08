package com.springcloud.zuul.springbootzuulgatewayproxystudentservice.domain;

public class Student {

    String name;
    String address;
    String cls;

    public Student(String name, String address, String cls) {
        this.name = name;
        this.address = address;
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
