package com.hashmap.assessment.services.leave;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.leave.LeaveType;

public interface Leave {
    public void assignLeaves(Admin admin, String employeeId, EmployeeType type);
    public void modifyLeaves(Admin admin,String employeeId,LeaveType type,Integer number);
    public void setdefaultLeavesOfPermmanentEmployee(LeaveType type,Integer number);
    public void setdefaultLeavesOfProbationEmployee(LeaveType type,Integer number);
}
