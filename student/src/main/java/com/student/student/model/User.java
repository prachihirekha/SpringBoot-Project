package com.student.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Builder
@Table(name ="student")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private  int age;
    private String city;
    //private Date dateOfBirth;
}
