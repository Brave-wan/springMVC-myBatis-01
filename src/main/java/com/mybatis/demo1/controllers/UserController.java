package com.mybatis.demo1.controllers;

import com.google.gson.Gson;
import com.mybatis.demo1.mode.SysUser;
import com.mybatis.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @ResponseBody
    @RequestMapping(value = "/info")
    public String userInfo() {
        SysUser sysUser = service.selectById(new Long(1));
        if (sysUser != null) {
            return new Gson().toJson(sysUser);
        }
        return "hello word";
    }

    @ResponseBody
    @RequestMapping(value = "/list")
    public String getInfoList() {
        List<SysUser> list = service.selectByCondition();
        if (list.size() > 0) {
            return new Gson().toJson(list);
        }
        return "hello word";
    }

    @ResponseBody
    @RequestMapping(value = "/insert")
    public String getInsert() {
        SysUser sysUser = new SysUser();
        sysUser.setCreateTime(new Date());
        sysUser.setUserEmail("185214487@qq.com");
        sysUser.setUserInfo("person info details");
        sysUser.setUserName("jreey");
        sysUser.setUserPassword("123456");
        service.insertTo(sysUser);
        return "hello word";
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public String getUserDelete() {
        int state = service.userDelete(new Long(1002));
        return state == 0 ? "success" : "fail";
    }
}
