/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aswin.designpatterns.dao;

import com.aswin.designpatterns.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> empList = new ArrayList<>();

    @Override
    public boolean insert(Employee e) {
        return empList.add(e);

    }

   

    @Override
    public Employee getById(int id) {
        for (Employee e : empList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return empList;
    }

    @Override
    public boolean delete(int id) {
        Employee e = getById(id);
        if (e == null) {
            return false;
        }
        empList.remove(e);
        return true;
    }

}
