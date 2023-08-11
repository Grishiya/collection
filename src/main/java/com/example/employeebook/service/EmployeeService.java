package com.example.employeebook.service;

import com.example.employeebook.dto.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName,int department,double salary);

    Employee removeEmployee(String firstName, String lastName, int department, double salary);

    Employee searchEmployee(String firstName, String lastName,int department,double salary);

    Collection<Employee> findAll();
}
