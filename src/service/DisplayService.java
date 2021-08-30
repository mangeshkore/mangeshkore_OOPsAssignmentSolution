package service;

import model.SuperDepartment;

public class DisplayService {
    public void displayFunctionalities(SuperDepartment superDepartment){
        System.out.println("Welcome to "+superDepartment.departmentName());
        System.out.println(superDepartment.getTodaysWork());
        System.out.println(superDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday()+"\n");
    }
}
