package com.example.demo.serviceImp;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//实现类
@Service
public class StudentServiceImp implements StudentService {


    @Autowired(required = false)
    StudentMapper studentMapper;

//    查询全部学生信息
@Override
    public List<Student> selectAllStudent(){
        return studentMapper.selectAllStudent();
    }



//    学生登陆验证
    @Override
    public List<Student> studentLogin(String userName, String passWord) {
    return studentMapper.studentLogin(userName,passWord);
    }


}
