package com.lwl.system;

import com.lwl.system.entity.Student;
import com.lwl.system.view.MainView;

//界面内容
//学生类、界面类、系统类、测试类、文件io
//属性：姓名，学号，籍贯
//功能:1、录入学生信息
//功能:2、删除学生信息
//功能:3、修改学生信息
//功能:4、查看学生信息(功能:4：可以根据学号，姓名，籍贯查找学生信息)
//功能:
public class Test {
    public static void main(String[] args) {
     new MainView().enterStudentSystem();


    }
}
