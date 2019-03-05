package com.hashmap.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RequestLeaves {
    private String employeeId;
    private LeaveType type;
    private String dateRange;
}
