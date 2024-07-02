package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{

	public Employee findById(Integer id);

}
