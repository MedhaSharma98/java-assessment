package com.hashmap.assessment.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
public class Leaves {
    private Map<LeaveType,Integer> leaveTypeMap =new HashMap<>();

    public void addTOLeaveTypeMap(LeaveType leaveType,int number){
        leaveTypeMap.put(leaveType,number);
    }

    public void updateLeaveTypeMap(LeaveType leaveType,int number){
        leaveTypeMap.put(leaveType,number);
    }

    public int totalLeaveCredited(Employee employee){
        int count=0;
        if(employee.getType().equals(EmployeeType.PERMANENT)){
            for (Map.Entry<LeaveType,Integer> entry : leaveTypeMap.entrySet()){
                count+=entry.getValue();
            }
            return count;
    }
            return count;
    }

    public void deductLeave(String employeeId,int noOFDays){

    }

    public Map<LeaveType,Integer> getLeaveTypeMap(EmployeeType type){
        if(type.equals(EmployeeType.PERMANENT)){
           return this.leaveTypeMap;
        }
        return getLeaveTypeMapforProbation();
    }

    public Map<LeaveType,Integer> getLeaveTypeMapforProbation(){
        Map<LeaveType,Integer> map=new HashMap<>();

        for (Map.Entry<LeaveType,Integer> entry : leaveTypeMap.entrySet()){
            map.put(entry.getKey(),0);
        }
        return map;
    }


}
