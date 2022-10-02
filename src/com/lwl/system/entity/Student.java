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

}
