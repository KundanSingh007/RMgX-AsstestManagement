package com.RMgX.kundansingh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RMgX.kundansingh.Entity.AssetsEntity.Employee;
import com.RMgX.kundansingh.Entity.EmployeeEntity;
import com.RMgX.kundansingh.ServiceImpl.ResourceNotFoundException;
import com.RMgX.kundansingh.repository.EmployeeRepository;
import com.RMgX.kundansingh.service.EmployeeEntityService;

@RestController
@RequestMapping("/api/EmployeeEntity")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepository;
	EmployeeEntityService employeeEntityService;

	@GetMapping("/employees")
	public ResponseEntity<Object> getAllEmployees() {

		return ResponseEntity.ok().body(employeeEntityService.getAllByEmployee());

	}

	// get employee by id rest api

	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable long id) {

		EmployeeEntity employee = employeerepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist: " + id));
		return ResponseEntity.ok(employee);

	}

	// create employee rest Api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {

		return employeerepository.saveAll(employee);

	}

	// update employee rest api

	@PutMapping("employees/{id}")
	public ResponseEntity<Object> entity(@PathVariable Long id, @RequestBody Employee employeeDetails) {

		employeeDetails.setId(employeeDetails.getId());
		return ResponseEntity.ok().body(this.employeeEntityService.createEmployee(employeeDetails));

	}

	// delete api

	@DeleteMapping("/employees/{id}")

	void deleteEmployee(@PathVariable Long id) {
		employeerepository.deleteById(id);
	}
}
