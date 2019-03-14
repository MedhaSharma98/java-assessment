package com.hashmap.assessment.services.admin;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.leave.LeaveType;

public interface AdminService {
    public void addEmployee(Employee employee);
    public void removeEmployee(String employeeId);
    public void addHoliday(Holiday holiday);
    public void removeHoliday(Holiday holiday);
    public void assignLeaves(String employeeId, EmployeeType type);
    public void modifyLeaves(String employeeId,LeaveType type,Integer number);
    public void setdefaultLeavesOfPermmanentEmployee(LeaveType type,Integer number);
    public void setdefaultLeavesOfProbationEmployee(LeaveType type,Integer number);

}
