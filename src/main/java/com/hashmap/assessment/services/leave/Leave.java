package com.hashmap.assessment.services.leave;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.model.request.RequestLeaves;

public interface Leave {

    public int totalLeaveCredit(String employeeId);

}
