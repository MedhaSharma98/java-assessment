package com.hashmap.assessment.services.holiday;

import com.hashmap.assessment.model.holiday.Holiday;

import java.util.List;

public interface Manage {
    public List<Holiday> getMonthlyHolidays(int month, int year);
    public List<Holiday> getYearlyHolidays(int year);
}
