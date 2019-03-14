package com.hashmap.assessment.model.holiday;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Holiday {
  String name;
  Date date;
}
