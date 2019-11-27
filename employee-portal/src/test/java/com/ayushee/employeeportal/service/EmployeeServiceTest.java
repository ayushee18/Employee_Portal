package com.ayushee.employeeportal.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ayushee.employeeportal.domain.EmployeeDTO;
import com.ayushee.employeeportal.repository.EmployeeRepository;
import com.ayushee.employeeportal.service.impl.EmployeeServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}  
	
	@Test
    public void verifyGetAllEmployees()
    {
        List<EmployeeDTO> list = new ArrayList<>();
        EmployeeDTO empOne = new EmployeeDTO();
        empOne.setFirstname("Ayushee");
        empOne.setLastname("Agarwal");
        empOne.setGender("female");
        empOne.setDOB(new Date());
        empOne.setDepartment("IT");
        
        EmployeeDTO empTwo = new EmployeeDTO();
        empTwo.setFirstname("Abhishek");
        empTwo.setLastname("Kumar");
        empTwo.setGender("male");
        empTwo.setDOB(new Date());
        empTwo.setDepartment("HR");
        
        EmployeeDTO empThree = new EmployeeDTO();
        empThree.setFirstname("Amar");
        empThree.setLastname("Kumar");
        empThree.setGender("male");
        empThree.setDOB(new Date());
        empThree.setDepartment("IT");
         
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
         
        when(employeeRepository.findAllByOrderByFirstnameAsc()).thenReturn(list);
         
        //test
        List<EmployeeDTO> empList = employeeService.getAllEmployees();
         
        assertEquals(3, empList.size());
        verify(employeeRepository, times(1)).findAllByOrderByFirstnameAsc();
    }
	
	@Test
	public void verifyAddEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setFirstname("Ayushee");
		employeeDTO.setLastname("Agarwal");
		employeeDTO.setGender("female");
		employeeDTO.setDOB(new Date());
		employeeDTO.setDepartment("IT");
		when(employeeRepository.save(employeeDTO)).thenReturn(employeeDTO);
		employeeService.addEmployee(employeeDTO);
		verify(employeeRepository, times(1)).save(employeeDTO);
	}
}
