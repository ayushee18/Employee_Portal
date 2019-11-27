package com.ayushee.employeeportal.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushee.employeeportal.domain.EmployeeDTO;
import com.ayushee.employeeportal.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/employee")
@Api(value="Employee Prtal Service", description="Operations Pertaining to Employee Services")
public class EmployeeController {

	@Autowired EmployeeService employeeService;
	
	@ApiOperation(value="View all employee details", response=List.class)
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		List<EmployeeDTO> empList = employeeService.getAllEmployees();
		return new ResponseEntity<List<EmployeeDTO>>(empList, HttpStatus.OK);
	}
	
	@ApiOperation(value="Add an employee")
	@PostMapping
	public ResponseEntity addEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.addEmployee(employee);
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "Registered Successfully");
		return ResponseEntity.ok(map);
	}
}
