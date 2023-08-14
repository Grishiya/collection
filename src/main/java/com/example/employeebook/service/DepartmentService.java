package com.example.employeebook.service;

import com.example.employeebook.dto.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findMaxSalaryEmployee(int department);

    Employee findMinSalaryEmployee(int department);

    Collection<Employee> getAllEmployeesDepartment(int department);
Map<Integer, List<Employee>> getAllGroupingByDepartment();
}
