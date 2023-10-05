package com.employeeapplication.util;

import java.util.Random;

public class GenerateEmployeeName {
    public static String employeeName(){
        String[] name={"Prajwal  Chanore","Suhag AHSDF","Prachi Hirekhan","Radhika Sahade","Pallavi Savalakhe","Ansul xyz","Aman AYS"};
        Random random=new Random();
        int n = random.nextInt(name.length);
        return name[n];
    }

    public static void main(String[] args) {
        System.out.println(employeeName());
    }
}
