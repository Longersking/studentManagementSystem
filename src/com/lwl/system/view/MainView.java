package com.lwl.system.view;

import com.lwl.system.entity.Student;
import com.lwl.system.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

//功能:1、录入学生信息
//功能:2、删除学生信息
//功能:3、修改学生信息
//功能:4、查看学生信息(功能:4：可以根据学号，姓名，籍贯查找学生信息)
public class MainView {
    public boolean check(String choice){
        if(!(choice.equals("yes"))){
            return false;
        }
        return true;
    }
    public void enterStudentSystem(){
        Student student = new Student();
        StudentServiceImpl studentService = new StudentServiceImpl();
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("------------欢迎来到Java2.0------------");
        System.out.println("1、录入学生信息");
        System.out.println("2、删除学生信息");
        System.out.println("3、修改学生信息");
        System.out.println("4、查看学生信息");
        System.out.println("请输入您的选择：");
        String choice = null;
        String flag = null;
        boolean clock = true;
        Scanner scanner = new Scanner(System.in);
        while (clock) {
            choice = scanner.next();
            switch (choice){
                case "1":
                    studentService.addStudent();
                    System.out.println("是否继续使用其他功能（yes/其它）");
                    flag = scanner.next();
                    clock = check(flag);
                    break;
                case "2":
                    studentService.deleteStudentById();
                    System.out.println("是否继续使用其他功能（yes/其它）");
                    flag = scanner.next();
                    clock = check(flag);
                    break;
                case "3":
                    studentService.changeStudentById();
                    System.out.println("是否继续使用其他功能（yes/其它）");
                    flag = scanner.next();
                    clock = check(flag);
                    break;
                case "4":
                    studentService.checkStudent();
                    System.out.println("是否继续使用其他功能（yes/其它）");
                    flag = scanner.next();
                    clock = check(flag);
                    break;
                case "5":
                    System.out.println("------------退出------------");
                    System.exit(0);
                default:
                    System.out.println("------------输入错误请重新输入------------");
            }
        }
        System.out.println("------------退出------------");
    }
}
