package com.mybatis.demo1.dao;

import com.mybatis.demo1.mode.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    SysUser selectById(Long id);

    List<SysUser> selectByCondition();

    int insertTo(SysUser record);

    int userDelete(Long id);

}
