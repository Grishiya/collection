package com.example.employeebook.controller;

import com.example.employeebook.service.EmployeeService;
import com.example.employeebook.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName,
                        @RequestParam int department,@RequestParam double salary) {
        return employeeService.addEmployee(firstName, lastName,department,salary);

    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName,
                           @RequestParam int department,@RequestParam double salary) {
        return employeeService.addEmployee(firstName, lastName,department,salary);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName,
                         @RequestParam int department,@RequestParam double salary) {
        return employeeService.addEmployee(firstName, lastName,department,salary);
    }

}
