package com.hashmap.assessment.model.employee;

import com.hashmap.assessment.utilties.LengthValidation;
import com.hashmap.assessment.exception.EmailException;
import com.hashmap.assessment.exception.LengthException;
import com.hashmap.assessment.utilties.EmailValidation;
import com.hashmap.assessment.model.employee.role.Role;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
@EqualsAndHashCode
public class Employee {
    private String name;
    private String email;
    private Date dateOfJoining;
    private EmployeeType type;
    private String employeeId;
    private Role role;

    public Employee(String name,String email,Date dateOfJoining,EmployeeType type,Role role){
        if(LengthValidation.isValidLength(name,50)){
          throw new LengthException("length limit max 50 characters");
        }

        if(!(EmailValidation.isValidEmail(email))){
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
