package com.hashmap.assessment.services.leave;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.services.DatabaseService;

public class AssignLeavesImple implements Leave {
    private DatabaseService databaseService;

    public AssignLeavesImple(){
        databaseService=DatabaseService.getInstance();
    }

    @Override
    public void assignLeaves(Admin admin, String employeeId, EmployeeType type) {
        if(type.equals(EmployeeType.PERMANENT)) {
     databaseService.getDatabase().getEmployeeLeaves().put(employeeId,databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee());
        }
        else{
     databaseService.getDatabase().getEmployeeLeaves().put(employeeId,databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee());
        }
    }

    @Override
    public void modifyLeaves(Admin admin,String employeeId, LeaveType type, Integer number) {
        databaseService.getDatabase().getEmployeeLeaves().get(employeeId).put(type,number);
    }

    @Override
    public void setdefaultLeavesOfPermmanentEmployee(LeaveType type, Integer number) {
        databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee().put(type,number);

    }

    @Override
    public void setdefaultLeavesOfProbationEmployee(LeaveType type, Integer number) {
        databaseService.getDatabase().getDefaultLeavesOfProbationEmployee().put(type,number);
    }
}
