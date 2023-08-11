package com.example.employeebook.service;

import com.example.employeebook.exception.EmployeeAlreadyAddedException;
import com.example.employeebook.exception.EmployeeNotFoundException;
import com.example.employeebook.exception.EmployeeStorageIsFullException;
import com.example.employeebook.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;
    private static final int EMPLOYEES_MAX_SIZE = 10;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee addEmployee(String firstName, String lastName,int department,double salary) {
        if (employees.size() == EMPLOYEES_MAX_SIZE) {
            throw new EmployeeStorageIsFullException("Превышен лимит сотрудников");

        }

        Employee employee = new Employee( firstName, lastName, department, salary);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("В компании уже есть такой сотрудник.");
        }
        employees.put(employee.getFullName(),employee);
        return employee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName,int department,double salary) {
        Employee employee = new Employee(firstName,lastName,department, salary);
        if (employees.containsKey(employee.getFullName())) {
        return employees.remove(employee.getFullName());

        }
        throw new EmployeeNotFoundException("Cотрудник не найден");
    }
    @Override
    public Employee searchEmployee(String firstName, String lastName,int department,double salary) {
        Employee employee = new Employee(firstName, lastName,department,salary);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());

        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }
@Override
    public Collection<Employee> findAll(){
        return Collections.unmodifiableCollection(employees.values());
}
}
