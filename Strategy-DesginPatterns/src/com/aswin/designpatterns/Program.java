package com.aswin.designpatterns;

import com.aswin.designpatterns.mediator.EmployeeMediator;
import com.aswin.designpatterns.dao.EmployeeDAO;
import com.aswin.designpatterns.dao.EmployeeDAOImpl;
import com.aswin.designpatterns.entity.Employee;
import com.aswin.designpatterns.filters.EmployeeFemaleFilter;
import com.aswin.designpatterns.filters.EmployeeFilter;
import com.aswin.designpatterns.filters.EmployeeMaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        EmployeeMediator employeeMediator = new EmployeeMediator(employeeDAO);
        //create
        employeeDAO.insert(new Employee(1, "Rajesh", "Khadka", 'F', true));
        employeeDAO.insert(new Employee(2, "Saroj", "Karki", 'M', true));
        employeeDAO.insert(new Employee(3, "Mina", "Satyal", 'F', true));
        employeeDAO.insert(new Employee(3, "Dhiraj", "Rana", 'M', true));
        employeeDAO.insert(new Employee(3, "Hari", "Bajracharya", 'M', true));
        
      
        EmployeeFilter filter  = new EmployeeMaleFilter();
        employeeMediator.printListMaleEmployees(new EmployeeMaleFilter());
        employeeMediator.printListMaleEmployees(new EmployeeFemaleFilter());
      

        //getting all records
        System.out.println("======Records at the begining======");
        employeeMediator.printEmployees();

        //update
        Employee emp = employeeDAO.getById(1);
        emp.setFirstName("Binod");
        emp.setLastName("yadav");

        //getting all records
        System.out.println("======Records after update======");
       employeeMediator.printEmployees();

        //Remove
        System.out.println("======Records after deleting one record======");
        employeeDAO.delete(1);
        employeeMediator.printEmployees();
    }
}
