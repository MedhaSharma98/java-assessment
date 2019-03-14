package com.hashmap.assessment.model.employee.role;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@Getter
@EqualsAndHashCode
public class Admin extends Role {
    String adminId;
 public Admin(){
     this.adminId= UUID.randomUUID().toString();
 }

 public String toString(){
     return "Admin";
 }
}
