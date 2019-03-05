package com.hashmap.assessment.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Holidays {
  private  Map<String,Date> holidayList=new HashMap<>();

  public void addHoliday(String string,Date date){
      holidayList.put(string,date);
  }
}
