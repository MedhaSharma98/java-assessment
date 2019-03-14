package com.hashmap.assessment.services;

import com.hashmap.assessment.model.employee.role.Admin;
import com.hashmap.assessment.model.holiday.Holiday;
import com.hashmap.assessment.services.admin.AdminServiceImple;
import com.hashmap.assessment.services.employee.EmployeeServiceImple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HolidayTest {
    private EmployeeServiceImple employeeServiceImple;
    private  AdminServiceImple adminService;
    private List<Holiday> holidayList=new ArrayList<Holiday>();


    @Before
    public void init(){
        Admin a=new Admin();
        adminService=new AdminServiceImple(a);
        employeeServiceImple=new EmployeeServiceImple();

        adminService.addHoliday(new Holiday("Republic Day",new Date(2018,1,26)));
        adminService.addHoliday(new Holiday("Republic Day",new Date(2019,1,26)));
        adminService.addHoliday(new Holiday("Holi",new Date(2018,3,10)));
        adminService.addHoliday(new Holiday("Holi",new Date(2019,3,21)));
        adminService.addHoliday(new Holiday("Independence Day",new Date(2018,8,15)));
        adminService.addHoliday(new Holiday("Teacher's Day",new Date(2018,8,2)));
        adminService.addHoliday(new Holiday("Independence Day",new Date(2019,8,15)));
    }

    @Test
    public void getYearlyHolidays(){
        List<Holiday> requiredHolidayList =new ArrayList<Holiday>();
        requiredHolidayList.add(new Holiday("Republic Day",new Date(2019,1,26)));
        requiredHolidayList.add(new Holiday("Holi",new Date(2019,3,21)));
        requiredHolidayList.add(new Holiday("Independence Day",new Date(2019,8,15)));

        holidayList= employeeServiceImple.getYearlyHolidays(2019);
        Assert.assertEquals(requiredHolidayList.get(2),holidayList.get(2));
    }

    @Test
    public void getMonthlyHolidays1(){
        List<Holiday> requiredHolidayList =new ArrayList<Holiday>();
        requiredHolidayList.add(new Holiday("Independence Day",new Date(2018,8,15)));
        requiredHolidayList.add(new Holiday("Teacher's Day",new Date(2018,8,2)));

        holidayList= employeeServiceImple.getMonthlyHolidays(8,2018);
        Assert.assertEquals(requiredHolidayList.get(1),holidayList.get(1));
    }

   @Test
    public void getMonthlyHolidays2(){
       List<Holiday> requiredHolidayList =new ArrayList<Holiday>();
       requiredHolidayList.add(new Holiday("Independence Day",new Date(2018,8,15)));
       requiredHolidayList.add(new Holiday("Teacher's Day",new Date(2018,7,2)));

       holidayList= employeeServiceImple.getMonthlyHolidays(8,2018);
       Assert.assertNotEquals(requiredHolidayList.get(1),holidayList.get(1));
   }
    }

