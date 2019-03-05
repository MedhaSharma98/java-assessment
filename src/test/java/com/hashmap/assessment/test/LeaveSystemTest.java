package com.hashmap.assessment.test;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.Employee;
import com.hashmap.assessment.model.EmployeeType;
import com.hashmap.assessment.model.Role;
import com.hashmap.assessment.services.LeaveManagementSystem;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class LeaveSystemTest {
    public static class EmployeeTest {
        private static Employee employee ;
        private static LeaveManagementSystem leaveManagementSystem;

        @BeforeClass
        public static void setUp(){

            Date d =new Date(2018,2,12);
             employee=new Employee("Rahul","rahulsharma9@gmail.com",d, EmployeeType.PERMANENT,new Admin());
        }

        @Test
        public void gettotalLeaveCredit(){
            
        }
    }
}
