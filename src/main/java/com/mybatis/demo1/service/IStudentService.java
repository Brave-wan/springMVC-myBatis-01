package com.mybatis.demo1.service;

import com.mybatis.demo1.mode.Student;

import java.util.List;

public interface IStudentService {
    int deleteByPrimaryKey(String uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String uid);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
