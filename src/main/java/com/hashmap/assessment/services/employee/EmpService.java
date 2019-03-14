package com.hashmap.assessment.services.employee;

import com.hashmap.assessment.model.holiday.Holiday;

import java.util.List;

public interface EmpService {
    public List<Holiday> getMonthlyHolidays(int month,int year);
    public List<Holiday> getYearlyHolidays(int year);
    public int totalLeaveCredit(String employeeId);
}
