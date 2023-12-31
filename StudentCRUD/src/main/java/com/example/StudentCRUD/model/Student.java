package com.example.StudentCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String  gender;
   private String branch;
   private int  year;
   private int semester;
}
