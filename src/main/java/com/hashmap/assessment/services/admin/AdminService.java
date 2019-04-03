package com.hashmap.assessment.services.admin;

import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.leave.LeaveType;

public interface AdminService {
    public void addEmployee(Employee employee);
    public void removeEmployee(String employeeId);
    public void addHoliday(Holiday holiday);
    public void removeHoliday(Holiday holiday);
    public void assignLeaves(String employeeId, EmployeeType type);
    public void deductLeave(String employeeId,LeaveType type,int number);
    public void modifyLeaves(String employeeId,LeaveType type,Integer number);
    public void defaultLeavesOfPermmanentEmployee(LeaveType type,Integer number);
    public void defaultLeavesOfProbationEmployee(LeaveType type,Integer number);

}
