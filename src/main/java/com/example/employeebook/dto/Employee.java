package com.example.employeebook.dto;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int department;
    private double salary;

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String firstName, String lastName, int department, double salary) {
        this.firstName = StringUtils.capitalize(  firstName);
        this.lastName = StringUtils.capitalize(lastName);
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + lastName;
    }


    @Override
    public String toString() {
        return '{' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}

