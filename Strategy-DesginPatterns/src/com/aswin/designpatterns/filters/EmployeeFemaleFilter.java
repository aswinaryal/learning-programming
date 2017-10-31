/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aswin.designpatterns.filters;

import com.aswin.designpatterns.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public class EmployeeFemaleFilter implements EmployeeFilter {

    @Override
    public List<Employee> getFilter(List<Employee> collections) {
        List<Employee> empList = new ArrayList<>();
        for(Employee e: collections){
            if(e.getGender() == 'F'){
                empList.add(e);
            }
        }
        return empList;
    }
    
}
