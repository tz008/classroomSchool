package com.example.demo.service;




import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
     //    查询全部课程信息
     List<Course> selectAllCourse();

     //    增加课程
     void insertCourse(Course course);

     //    显示指定学生的所有加入的课程(归档)
     List<Course> selectCourseByStudent(int studentId);

     //        显示指定教师所有加入的课程(归档)
     List<Course> selectCourseByTeacher(int teacherId);

     //    显示指定学生的所有加入的课程(未归档)
     List<Course> selectCourseByStudentNo(int studentId);

     //        显示指定教师所有加入的课程(未归档)
     List<Course> selectCourseByTeacherNo(int teacherId);

     //    归档全部
     void updateAllArchive(int courseId);

     //    选该课程人数+1
     void insertCourseNumber(int courseId);
}

