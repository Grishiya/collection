package com.example.employeebook.service;

import com.example.employeebook.dto.Employee;
import com.example.employeebook.exception.EmployeeNotFoundException;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findMaxSalaryEmployee(int department) {
        return employeeService.findAll().stream()
                .filter( employee -> employee.getDepartment() == department )
                .max( Comparator.comparingDouble( empl -> empl.getSalary() ) )
                .orElseThrow( () -> new EmployeeNotFoundException( "Нет сотрудников в отделе" + department ) );
    }

    @Override
    public Employee findMinSalaryEmployee(int department) {
        return employeeService.findAll().stream()
                .filter( employee -> employee.getDepartment() == department )
                .min( Comparator.comparingDouble( empl -> empl.getSalary() ) )
                .orElseThrow( () -> new EmployeeNotFoundException( "Нет сотрудников в отделе" + department ) );
    }

    @Override
    public Collection<Employee> getAllEmployeesDepartment(int department) {
        return null;
    }

    @Override
    public Map<Integer, Collection<Employee>> getAllGroupingByDepartment() {
        return null;
    }
}
