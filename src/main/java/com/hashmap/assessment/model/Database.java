package com.hashmap.assessment.model;

import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.leave.LeaveType;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@EqualsAndHashCode
public class Database {
    private List<Employee> employeeList;
    private List<Admin> adminList;
    private List<Holiday> holidaysList;
    private Map<LeaveType,Integer> defaultLeavesOfPermmanentEmployee;
    private Map<LeaveType,Integer> defaultLeavesOfProbationEmployee;
    private Map<String, Map<LeaveType,Integer>> employeeLeaves;

    public Database(){
        employeeList= new ArrayList<Employee>();
        adminList=new ArrayList<Admin>();
        holidaysList=new ArrayList<Holiday>();
        defaultLeavesOfPermmanentEmployee=new HashMap<LeaveType,Integer>();
        defaultLeavesOfProbationEmployee=new HashMap<LeaveType,Integer>();
        employeeLeaves=new HashMap<String, Map<LeaveType,Integer>>();
    }
}
