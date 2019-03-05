package com.hashmap.assessment.model;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    private static Employee employee ;

    @BeforeClass
    public static void setUp(){
         employee=new Employee("Rahul","rahulsharma9@gmail.com",4-12-2018,EmployeeType.PERMANENT,new Role());
    }

    @Test
    public void getName(){

    }
}