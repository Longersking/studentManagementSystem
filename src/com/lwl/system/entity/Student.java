package com.lwl.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String studentName;
    private Integer studentAge ;
    private Integer studentID;
    private String studentOrigin;
    @Override
    public String toString(){
        String str = "姓名:"+this.studentName+"\t\t\t年龄:"+this.studentAge+"\t\t\t学号:"+this.studentID+"\t\t\t籍贯："+this.studentOrigin;
        return str;
    }
}
