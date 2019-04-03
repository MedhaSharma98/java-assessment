package com.hashmap.assessment.services.holiday;

import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.services.DatabaseService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HolidayServiceImple implements Manage {

    private DatabaseService databaseService;

    public HolidayServiceImple(){
        databaseService=DatabaseService.getInstance();
    }

    @Override
    public List<Holiday> getMonthlyHolidays(int month, int year) {
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

    public int returnHolidays(String dateRange) {
        String s[] = dateRange.split(" ");

        int total = 0;

        for (String date : s) {
            for (Holiday h : databaseService.getDatabase().getHolidaysList()) {
               Date d=new Date(date);
                if (h.getDate().getDay()==d.getDay()+1&&h.getDate().getMonth()==d.getMonth()+1&&h.getDate().getYear()==d.getYear()+1903) {
                    total++;
                    break;
                }
            }

        }

        return total;
    }

}
