package com.RMgX.kundansingh.service;

import java.util.Optional;

import com.RMgX.kundansingh.Entity.AssetsEntity.Employee;
import com.RMgX.kundansingh.Entity.EmployeeEntity;



public interface EmployeeEntityService {

	Iterable<EmployeeEntity> getALl();

	
	public String deleteById(int id);
	
	Optional<EmployeeEntity> getById(int id);


	String update(EmployeeEntity EmployeeEntity);


	String add(EmployeeEntity EmployeeEntity);


	Object getAllById();


	Object getAllByEmployee();


	Object createEmployee(Employee employee);

}
