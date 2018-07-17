package com.mybatis.demo1.service;

import com.mybatis.demo1.mode.SysUser;

import java.util.List;

public interface IUserService {
    SysUser selectById(Long id);

    List<SysUser> selectByCondition();

    int insertTo(SysUser record);

    int userDelete(Long id);
}
