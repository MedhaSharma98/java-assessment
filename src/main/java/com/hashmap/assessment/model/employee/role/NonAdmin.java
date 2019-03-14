package com.hashmap.assessment.model.employee.role;

import java.util.UUID;

public class NonAdmin extends Role {
    String nonadminId;
    public NonAdmin(){
        this.nonadminId= UUID.randomUUID().toString();
    }

    public String toString(){
        return "NonAdmin";
    }
}
