package com.hashmap.assessment.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Admin extends Role {

    public void addHoliday(String name, Date date){
      new Holidays().addTOHoliday(name,date);
    }

    public void deleteHoliday(String name, Date date){
        new Holidays().addTOHoliday(name,date);
    }

}
