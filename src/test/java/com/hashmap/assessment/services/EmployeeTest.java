package com.hashmap.assessment.services;

import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.NonAdmin;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.services.admin.AdminServiceImple;
import com.hashmap.assessment.services.employee.EmployeeServiceImple;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;


public class EmployeeTest {
     private  Employee employee;
    private  AdminServiceImple adminService;
     private Map<LeaveType,Integer> mapLeaves;
     private EmployeeServiceImple employeeServiceImple;

     @Before
     public  void init1(){
     Admin a=new Admin();
     adminService=new AdminServiceImple(a);
     employeeServiceImple=new EmployeeServiceImple();

     employee=new Employee("Prikshit","Prikshit1@gmail.com",new Date(2018,1,12),
             EmployeeType.PERMANENT,a);
    adminService.addEmployee(employee);
    adminService.addEmployee(new Employee("Kunal","Kunal2@gmail.com",new Date(2018,2,12),
            EmployeeType.PROBATION,new NonAdmin()));
    adminService.addEmployee(new Employee("Kartik","Kartik3@gmail.com",new Date(2018,3,12),
            EmployeeType.PERMANENT,new Admin()));
    adminService.addEmployee(new Employee("Harish","Harish4@gmail.com",new Date(2018,4,12),
                 EmployeeType.PROBATION,new NonAdmin()));
    adminService.addEmployee(new Employee("Vedant","Vedant5@gmail.com",new Date(2018,2,16),
                 EmployeeType.PERMANENT,new NonAdmin()));

     adminService.setdefaultLeavesOfPermmanentEmployee(LeaveType.SICK,5);
     adminService.setdefaultLeavesOfPermmanentEmployee(LeaveType.CASUAL,5);
     adminService.setdefaultLeavesOfPermmanentEmployee(LeaveType.PRIVILEAGE,5);

     adminService.setdefaultLeavesOfProbationEmployee(LeaveType.SICK,0);
     adminService.setdefaultLeavesOfProbationEmployee(LeaveType.CASUAL,0);
      adminService.setdefaultLeavesOfProbationEmployee(LeaveType.PRIVILEAGE,0);

         adminService.assignLeaves(employee.getEmployeeId(),EmployeeType.PERMANENT);

     }

     @Test
      public void gettotalLeaveCredit(){

         int expectedTotal=employeeServiceImple.totalLeaveCredit(employee.getEmployeeId());

         Assert.assertEquals(15,expectedTotal);
     }



        }



