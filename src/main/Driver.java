package main;

import model.AdminDepartment;
import model.HrDepartment;
import model.TechDepartment;
import service.DisplayService;

public class Driver {

    public static void main(String[] args) {
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        AdminDepartment adminDepartment = new AdminDepartment();
        DisplayService displayService = new DisplayService();

        //call to service to display functionalities
        displayService.displayFunctionalities(adminDepartment);
        displayService.displayFunctionalities(hrDepartment);
        displayService.displayFunctionalities(techDepartment);
    }
}
