package com.hashmap.assessment.services.holiday;

import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.services.DatabaseService;

import java.util.ArrayList;
import java.util.List;

public class ManageHolidayImple implements ManageHoliday{
    private DatabaseService databaseService;

    public ManageHolidayImple(){
        databaseService=DatabaseService.getInstance();
    }


    @Override
    public void addHoliday(Holiday holiday, Admin admin) {
        databaseService.getDatabase().getHolidaysList().add(holiday);
    }

    @Override
    public void removeHoliday(Holiday holiday,Admin admin) {
        databaseService.getDatabase().getHolidaysList().remove(holiday);
    }

    @Override
    public List<Holiday> getMonthlyHolidays(int month,int year) {
        List<Holiday> holidayList=new ArrayList<Holiday>();

        for(Holiday holiday:databaseService.getDatabase().getHolidaysList()){
            if(holiday.getDate().getYear()==year&&holiday.getDate().getMonth()==month){
                holidayList.add(holiday);
            }
        }
        return holidayList;
    }

    @Override
    public List<Holiday> getYearlyHolidays(int year) {
        List<Holiday> holidayList=new ArrayList<Holiday>();

        for(Holiday holiday:databaseService.getDatabase().getHolidaysList()){
            if(holiday.getDate().getYear()==year){
                holidayList.add(holiday);
            }
        }
        return holidayList;
    }

}
