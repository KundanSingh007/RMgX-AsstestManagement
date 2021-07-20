package com.RMgX.kundansingh.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.kundansingh.Entity.AssetsEntity.Employee;
import com.RMgX.kundansingh.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{

	Object ok();

	Employee saveAll(Employee employee);

	}

