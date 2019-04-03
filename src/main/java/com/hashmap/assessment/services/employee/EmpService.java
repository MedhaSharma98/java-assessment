package com.hashmap.assessment.services.employee;

import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.model.request.RequestLeaves;

import java.util.List;

public interface EmpService {
    public int applyLeaves(RequestLeaves request);

}
