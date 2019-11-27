package com.ayushee.employeeportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushee.employeeportal.domain.EmployeeDTO;
import com.ayushee.employeeportal.repository.EmployeeRepository;
import com.ayushee.employeeportal.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void addEmployee(EmployeeDTO employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		return employeeRepository.findAllByOrderByFirstnameAsc();
	}

}
