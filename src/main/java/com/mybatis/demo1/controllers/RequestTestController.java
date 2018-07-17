package com.mybatis.demo1.controllers;

import com.google.gson.Gson;
import com.mybatis.demo1.dao.UserMapper;
import com.mybatis.demo1.mode.Student;
import com.mybatis.demo1.mode.SysUser;
import com.mybatis.demo1.service.IStudentService;
import com.mybatis.demo1.service.IUserService;
import com.mybatis.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {
    @Autowired
    private IStudentService service;

    @Autowired
    private IUserService userService;

    @GetMapping
    public String getTestString() {
//        Student student = new Student();
//        student.setAge(19);
//        student.setName("jreey");
//        student.setClassid(22);
//        student.setUid("003");
//        service.insert(student);
//        String json = new Gson().toJson(student);

        SysUser sysUser = userService.selectById(new Long(1));
        if (sysUser != null) {
            return new Gson().toJson(sysUser);
        }
        return "hello word";
    }
}
