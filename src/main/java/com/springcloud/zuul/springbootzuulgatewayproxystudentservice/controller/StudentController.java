package com.springcloud.zuul.springbootzuulgatewayproxystudentservice.controller;

import com.springcloud.zuul.springbootzuulgatewayproxystudentservice.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StudentController {

    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name="name") String name){
        return "Hello <strong style=\"color: red;\">"+name+"</strong> Responsed on :"+ new Date();
    }

    @RequestMapping(value = "/getStudentDeatils/{name}")
    public Student getStudentDetails(@PathVariable("name") String name){
        return new Student(name, "Pune", "MCA");
    }
}
