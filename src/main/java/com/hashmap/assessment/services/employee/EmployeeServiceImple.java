package com.hashmap.assessment.services.employee;

import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.model.request.RequestLeaves;
import com.hashmap.assessment.services.DatabaseService;
import com.hashmap.assessment.services.admin.AdminServiceImple;
import com.hashmap.assessment.services.holiday.HolidayServiceImple;
import com.hashmap.assessment.services.leave.AssignLeavesImple;
import com.hashmap.assessment.utilties.date.DateFunctions;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImple implements EmpService{
    private DatabaseService databaseService;
    private AssignLeavesImple assignLeavesImple;
    private HolidayServiceImple holidayServiceImple;

    public EmployeeServiceImple(){
        databaseService=DatabaseService.getInstance();
        assignLeavesImple=new AssignLeavesImple();
        holidayServiceImple=new HolidayServiceImple();
    }


    public List<Holiday> getMonthlyHolidays(int month,int year) {
       return holidayServiceImple.getMonthlyHolidays(month, year); }


    public List<Holiday> getYearlyHolidays(int year) {
        return holidayServiceImple.getYearlyHolidays(year);
    }

    public int totalLeaveCredit(String employeeId){
        return assignLeavesImple.totalLeaveCredit(employeeId);
    }


    @Override
    public int applyLeaves(RequestLeaves request) {
        int numberOfHolidaysNeeded= DateFunctions.noOfDays(request.getDateRange());
        int weekEnds=DateFunctions.noOFWeekDays(request.getDateRange());
        int publicHolidays=holidayServiceImple.returnHolidays(request.getDateRange());

        if(assignLeavesImple.hasSufficeintLeave(request.getEmployeeId(),request.getType(),numberOfHolidaysNeeded-weekEnds-publicHolidays)){
            new AdminServiceImple(new Admin()).deductLeave(request.getEmployeeId(),request.getType(),numberOfHolidaysNeeded-weekEnds-publicHolidays);
            return 1;
        }
        return 0;
    }


}
