package com.mybatis.demo1.dao;

import com.mybatis.demo1.mode.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String uid);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
