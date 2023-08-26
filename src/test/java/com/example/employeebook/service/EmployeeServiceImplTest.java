package com.example.employeebook.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {
    EmployeeServiceImpl underTest=new EmployeeServiceImpl(){

    }
    @Test
    void removeEmployee_employeeIsNotInMap_throwException() {
        assertThrows( )
        underTest.removeEmployee("Grisha", "Volkov");

    }


}