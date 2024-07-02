package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Employee;
import com.velocity.repository.EmployeeRepository;
import com.velocity.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee getEmployee(Integer id) {
		 Employee emp=employeeRepository.findById(id);
		return emp;
	}

}
