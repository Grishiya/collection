package com.example.employeebook.controller;

import com.example.employeebook.dto.Employee;
import com.example.employeebook.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee findMaxSalaryEmployee(@RequestParam int department) {
        return departmentService.findMaxSalaryEmployee( department );
    }

    @GetMapping("/min-salary")
    public Employee findMinSalaryEmployee(@RequestParam int department) {
        return departmentService.findMinSalaryEmployee( department );
    }
    @GetMapping("/all-department-employee")
    public Collection<Employee> getAllEmployeesDepartment(@RequestParam int department){
        return departmentService.getAllEmployeesDepartment( department );
    }

}