package com.lwl.system.service;

import com.lwl.system.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{

    ArrayList<Student> studentArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addStudent() {
        Student student = new Student();
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        student.setStudentName(name);
        System.out.println("请输入您的年龄：");
        student.setStudentAge(scanner.nextInt());
        System.out.println("请输入您的学号：");
        student.setStudentID(scanner.nextInt());
        System.out.println("请输入您的籍贯：");
        String origin = scanner.next();
        student.setStudentOrigin(origin);
        studentArrayList.add(student);
    }

    @Override
    public void deleteStudentById() {
        System.out.println("请输入您的学号：");
        Integer id = scanner.nextInt();
        int length = studentArrayList.size();
        for (int i = 0; i < length; i++) {
                if(id.equals(studentArrayList.get(i).getStudentID())){
                    studentArrayList.remove(i);
                    System.out.println("该学生信息已经删除");
                    return;
                }
            }
        System.out.println("未找到该学生信息");
    }

    @Override
    public void changeStudentById() {
        System.out.println("请输入您的学号：");
        Integer id = scanner.nextInt();
        int length = studentArrayList.size();
        for (int i = 0; i < length; i++) {
                if(id.equals(studentArrayList.get(i).getStudentID())){
                    studentArrayList.remove(i);
                    addStudent();
                    System.out.println("该学生信息已经修改");
                    return;
            }
        }
        System.out.println("未找到该学生信息，请检查学号是否输入正确");
    }

    @Override
    public void checkStudent() {
        System.out.println("请输入您的学号：");
        Integer id = scanner.nextInt();
        int length = studentArrayList.size();
        for (int i = 0; i < length; i++) {
                if(id.equals(studentArrayList.get(i).getStudentID())){
                    System.out.println(studentArrayList.get(i));
                    return;
            }
        }
        System.out.println("未找到该学生信息，请检查学号是否输入正确");
    }
}
