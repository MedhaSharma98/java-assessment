package com.hashmap.assessment.utilties.date;

import java.util.Calendar;
import java.util.Date;

public  class DateFunctions {

    public static int noOfDays(String dateRange){
        String s[]=dateRange.split(" ");
        return s.length;
    }

    public static int noOFWeekDays(String dateRange){
        int number=0;
        String s[]=dateRange.split(" ");

        for (String date:s) {
            Date d = new Date(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(d);
            if(calendar.get(Calendar.DAY_OF_WEEK)==7||calendar.get(Calendar.DAY_OF_WEEK)==1){

                number++;
            }
        }
        return number;
    }



}
