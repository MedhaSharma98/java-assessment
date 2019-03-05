package com.hashmap.assessment.model;

import com.hashmap.assessment.Utilties.Exception.EmailException;
import com.hashmap.assessment.Utilties.Exception.LengthException;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

import com.hashmap.assessment.Utilties.StringUtilties;


@Getter
public class Employee {
    private String name;
    private String email;
    private Date dateOfJoining;
    private EmployeeType type;
    private String employeeId;
    private Role role;

    public Employee(String name,String email,Date dateOfJoining,EmployeeType type,Role role){
        if(name.length()>50){
          throw new LengthException("length limit max 50 characters");
        }

        if(!(StringUtilties.isValidEmail(email))){
           throw new EmailException("invalid email");
        }

        this.name=name;
        this.email=email;
        this.dateOfJoining=dateOfJoining;
        this.type=type;
        this.employeeId= UUID.randomUUID().toString();
        this.role=role;
    }



}
