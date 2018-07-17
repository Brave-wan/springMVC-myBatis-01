package com.mybatis.demo1.service;

import com.mybatis.demo1.dao.StudentMapper;
import com.mybatis.demo1.mode.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(String uid) {
        return studentMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(String uid) {
        return studentMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<Student> selectByCondition(Student record) {
        return studentMapper.selectByCondition(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}
