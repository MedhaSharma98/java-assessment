package com.hashmap.assessment.services;

import com.hashmap.assessment.model.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class LeaveManagementSystem implements Manage{
    private Leaves leaves;
    private Holidays holidays;

    private Map<LeaveType,Integer> map;
    private List<Employee> employeeList;

    public LeaveManagementSystem(Leaves leaves, Holidays holidays,List<Employee> employeeList){
        this.leaves = leaves;
        this.holidays=holidays;
        this.employeeList=employeeList;
    }

    @Override
    public int applyLeaves(RequestLeaves request) {
        int numberOfHolidaysNeeded=noOfDays(request.getDateRange());
        if(hasSufficeintLeave(request.getEmployeeId(),request.getType(),numberOfHolidaysNeeded)){
           leaves.deductLeave(request.getEmployeeId(),numberOfHolidaysNeeded);
        }

        return 0;
    }

    private boolean hasSufficeintLeave(String id, LeaveType type,int number){
        if(getMap(id).get(type)>number){
            return true;
        }
        return false;
    }

    private int noOfDays(String dateRange){
        return 2;
    }

    private Map<LeaveType,Integer> getMap(String id){
        for(Employee e:employeeList) {
            if (e.getEmployeeId().equals(id)) {
                return map = e.getEmployeeLeaves();
            } }
        return null;
    }

    public int getLeavecredit(Employee employee){
        return new Leaves().totalLeaveCredited(employee);
    }

    public Map<String,Date> viewPublicHolidays(){
       return holidays.getHolidayList();
    }
}
