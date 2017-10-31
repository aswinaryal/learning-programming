/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aswin.designpatterns.dao;

import com.aswin.designpatterns.entity.Employee;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public interface EmployeeDAO {
    
    boolean insert(Employee e); //public abstract lekhna pardaina kina vane interface ma by default harek method abstract hunai parxa ra abstract vai sake paxi telai child class le implement garnai parxa ...so public abstract nalekhe pani vayo
    
    Employee getById(int id);
    List<Employee> getAll();
    boolean delete(int id);
    
    
}
