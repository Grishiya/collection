package com.example.employeebook;

import java.util.Collection;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee searchEmployee(String firstName, String lastName);

    Collection<Employee> findAll();
}
