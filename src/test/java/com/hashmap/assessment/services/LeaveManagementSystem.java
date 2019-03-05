package com.hashmap.assessment.services;

import com.hashmap.assessment.model.Employee;
import com.hashmap.assessment.model.Holidays;
import com.hashmap.assessment.model.Leaves;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class LeaveManagementSystem {
    private Leaves leaves;
    private Holidays holidays;

    public LeaveManagementSystem(Leaves leaves, Holidays holidays){
    this.leaves = leaves;
    this.holidays=holidays;
    }

    public int getLeavecredit(Employee employee){
        return new Leaves().totalLeaveCredited(employee);
    }

    public Map<String, Date> viewPublicHolidays(){
       return holidays.getHolidayList();
    }
}
