package com.hashmap.assessment.services.leave;

import com.hashmap.assessment.services.DatabaseService;

public class LeaveServiceImple implements LeaveService {
    private DatabaseService databaseService;
    
    public LeaveServiceImple(){
    databaseService=DatabaseService.getInstance();   
    }
    

}
