/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aswin.designpatterns.mediator;

import com.aswin.designpatterns.dao.EmployeeDAO;
import com.aswin.designpatterns.entity.Employee;
import com.aswin.designpatterns.filters.EmployeeFilter;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public class EmployeeMediator {
    private EmployeeDAO employeeDAO;
    public EmployeeMediator(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }
    public void printEmployees(){
        for (Employee e : employeeDAO.getAll()) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
    }
    
    public void printListMaleEmployees(EmployeeFilter filter){
        for(Employee e: filter.getFilter(employeeDAO.getAll())){
            System.out.println(e.getFirstName()+" "+e.getLastName());
        }
    }
}
