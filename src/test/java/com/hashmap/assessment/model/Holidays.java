package com.hashmap.assessment.model;

import lombok.Getter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Holidays {
  private  Map<String,Date> holidayList=new HashMap<>();

  public void addTOHoliday(String string,Date date){
      holidayList.put(string,date);
  }
}
