package com.hashmap.assessment.services.employee;

import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.services.DatabaseService;
import com.hashmap.assessment.services.holiday.ManageHolidayImple;

import java.util.List;
import java.util.Map;

public class EmployeeServiceImple implements EmpService{
    private DatabaseService databaseService;

    public EmployeeServiceImple(){
        databaseService=DatabaseService.getInstance();
    }

    @Override
    public List<Holiday> getMonthlyHolidays(int month,int year) {

        return new ManageHolidayImple().getMonthlyHolidays(month,year);
    }

    @Override
    public List<Holiday> getYearlyHolidays(int year) {
        return new ManageHolidayImple().getYearlyHolidays(year);
    }

    @Override
    public int totalLeaveCredit(String employeeId) {
        int total = 0;
        Map<LeaveType, Integer> map = databaseService.getDatabase().getEmployeeLeaves().get(employeeId);

        for (Map.Entry<LeaveType, Integer> m : map.entrySet()) {
            total += m.getValue();
        }
        return total;
    }
}
