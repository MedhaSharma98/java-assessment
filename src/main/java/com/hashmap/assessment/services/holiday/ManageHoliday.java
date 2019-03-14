package com.hashmap.assessment.services.holiday;

import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;

import java.util.List;

public interface ManageHoliday {
    public void addHoliday(Holiday holiday, Admin admin);
    public void removeHoliday(Holiday holiday,Admin admin);
    public List<Holiday> getMonthlyHolidays(int month,int year);
    public List<Holiday> getYearlyHolidays(int year);
}
