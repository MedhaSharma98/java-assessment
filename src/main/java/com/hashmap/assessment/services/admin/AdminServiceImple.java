package com.hashmap.assessment.services.admin;

import com.hashmap.assessment.exception.UserExistenceException;
import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.services.DatabaseService;
import com.hashmap.assessment.services.leave.AssignLeavesImple;


public class AdminServiceImple implements AdminService {
    private DatabaseService databaseService;
    private Admin admin;

    public AdminServiceImple(Admin admin){
        this.admin=admin;
        databaseService=DatabaseService.getInstance();
    }

    @Override
    public void addEmployee(Employee employee){
        databaseService.getDatabase().getEmployeeList().add(employee);
    }

    @Override
    public void removeEmployee(String employeeId) {
      for(Employee e:databaseService.getDatabase().getEmployeeList()){
        if(e.getEmployeeId().equals(employeeId)){
          databaseService.getDatabase().getEmployeeList().remove(e);
          return;
        }
            }
      throw new UserExistenceException("User doesn't exist");
    }


    @Override
    public void addHoliday(Holiday holiday) {

        databaseService.getDatabase().getHolidaysList().add(holiday);
    }

    @Override
    public void removeHoliday(Holiday holiday) {
        databaseService.getDatabase().getHolidaysList().remove(holiday);
    }


    @Override
    public void assignLeaves( String employeeId, EmployeeType type) {
        if(type.equals(EmployeeType.PERMANENT)) {
            databaseService.getDatabase().getEmployeeLeaves().put(employeeId,databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee());
        }
        else{
            databaseService.getDatabase().getEmployeeLeaves().put(employeeId,databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee());
        }
    }

    @Override
    public void deductLeave(String employeeId,LeaveType type, int number) {
        databaseService.getDatabase().getEmployeeLeaves().get(employeeId).remove(type);
        databaseService.getDatabase().getEmployeeLeaves().get(employeeId).put(type,number);
    }

    @Override
    public void modifyLeaves(String employeeId, LeaveType type, Integer number) {
        databaseService.getDatabase().getEmployeeLeaves().get(employeeId).remove(type);
        databaseService.getDatabase().getEmployeeLeaves().get(employeeId).put(type,number);
    }

    @Override
    public void defaultLeavesOfPermmanentEmployee(LeaveType type, Integer number) {
        databaseService.getDatabase().getDefaultLeavesOfPermmanentEmployee().put(type,number);

    }

    @Override
    public void defaultLeavesOfProbationEmployee(LeaveType type, Integer number) {
        databaseService.getDatabase().getDefaultLeavesOfProbationEmployee().put(type,number);
    }
}
