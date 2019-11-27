package com.ayushee.employeeportal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayushee.employeeportal.domain.EmployeeDTO;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDTO, String>{ 
	List<EmployeeDTO> findAllByOrderByFirstnameAsc();
}
