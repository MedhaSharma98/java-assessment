package com.hashmap.assessment.services.leave;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.model.request.RequestLeaves;
import com.hashmap.assessment.services.DatabaseService;
import com.hashmap.assessment.utilties.date.DateFunctions;

import java.util.Map;

public class AssignLeavesImple implements Leave {
    private DatabaseService databaseService;

    public AssignLeavesImple(){
        databaseService=DatabaseService.getInstance();
    }



    public  boolean hasSufficeintLeave(String id, LeaveType type,int number){
        if(databaseService.getDatabase().getEmployeeLeaves().get(id).get(type)>=number){
            return true;
        }
        return false;
    }

    @Override
    public int totalLeaveCredit(String employeeId) {
        int total = 0;
        Map<LeaveType, Integer> map = databaseService.getDatabase().getEmployeeLeaves().get(employeeId);

        for (Map.Entry<LeaveType, Integer> m : map.entrySet()) {
            total += m.getValue();
        }
        return total;
    }


}
