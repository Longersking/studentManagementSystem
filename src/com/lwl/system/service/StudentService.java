package com.lwl.system.service;

import com.lwl.system.entity.Student;

import java.util.ArrayList;

//功能:1、录入学生信息
//功能:2、删除学生信息
//功能:3、修改学生信息
//功能:4、查看学生信息(功能:4：可以根据学号，姓名，籍贯查找学生信息)
public interface StudentService {
   void addStudent();
   void deleteStudentById();
   void changeStudentById();
   void checkStudent();
}