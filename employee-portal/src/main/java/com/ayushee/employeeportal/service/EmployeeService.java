package com.ayushee.employeeportal.service;

import java.util.List;

import com.ayushee.employeeportal.domain.EmployeeDTO;

public interface EmployeeService {

	void addEmployee(EmployeeDTO employee); 
	List<EmployeeDTO> getAllEmployees();
}
