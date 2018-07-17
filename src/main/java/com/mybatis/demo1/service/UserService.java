package com.mybatis.demo1.service;

import com.mybatis.demo1.dao.UserMapper;
import com.mybatis.demo1.mode.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> selectByCondition() {
        return userMapper.selectByCondition();
    }

    @Override
    public int insertTo(SysUser record) {
        return userMapper.insertTo(record);
    }

    @Override
    public int userDelete(Long id) {
        return userMapper.userDelete(id);
    }
}
