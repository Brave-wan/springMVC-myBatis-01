package com.mybatis.demo1.controllers;

import com.mybatis.demo1.mode.Student;
import com.mybatis.demo1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {
    @Autowired
    private IStudentService service;

    @GetMapping
    public String getTestString() {
        List<Student> list = service.selectByCondition(new Student());

        return "hello word"+list.size();
    }
}
