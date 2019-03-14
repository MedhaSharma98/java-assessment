package com.hashmap.assessment.services.admin;

import com.hashmap.assessment.exception.UserExistenceException;
import com.hashmap.assessment.model.employee.EmployeeType;
import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.model.leave.LeaveType;
import com.hashmap.assessment.services.DatabaseService;
import com.hashmap.assessment.services.holiday.ManageHolidayImple;
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
        new ManageHolidayImple().addHoliday(holiday,admin);
    }

    @Override
    public void removeHoliday(Holiday holiday) {
        new ManageHolidayImple().addHoliday(holiday,admin);
    }

    @Override
    public void assignLeaves(String employeeId, EmployeeType type) {
        for(Employee e:databaseService.getDatabase().getEmployeeList()){
            if(e.getEmployeeId().equals(employeeId)){
                new AssignLeavesImple().assignLeaves(admin,employeeId,type);
                return;
            }
        }
        throw new UserExistenceException("User doesn't exist");
    }

    @Override
    public void modifyLeaves(String employeeId, LeaveType type, Integer number) {
        for(Employee e:databaseService.getDatabase().getEmployeeList()){
            if(e.getEmployeeId().equals(employeeId)){
                new AssignLeavesImple().modifyLeaves(admin,employeeId,type,number);
                return;
            }
        }
        throw new UserExistenceException("User doesn't exist");

    }

    @Override
    public void setdefaultLeavesOfPermmanentEmployee(LeaveType type, Integer number) {
        new AssignLeavesImple().setdefaultLeavesOfPermmanentEmployee(type, number);
    }

    @Override
    public void setdefaultLeavesOfProbationEmployee(LeaveType type, Integer number) {
        new AssignLeavesImple().setdefaultLeavesOfProbationEmployee(type, number);
    }

}
