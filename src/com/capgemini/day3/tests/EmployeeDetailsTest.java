package com.capgemini.day3.tests;

import org.junit.jupiter.api.BeforeEach;
import com.capgemini.day3.Employee;

class EmployeeDetailsTest {
       Employee employee;
       
	@BeforeEach
	void setUp() {
		//fail("Not yet implemented");
		employee = new Employee(1234,"priya",13000, 2500);
	}
   
}
