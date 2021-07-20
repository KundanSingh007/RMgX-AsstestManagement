package com.RMgX.kundansingh.ServiceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RMgX.kundansingh.Config.AppConstants;
import com.RMgX.kundansingh.Entity.AssetsEntity.Employee;
import com.RMgX.kundansingh.Entity.EmployeeEntity;
import com.RMgX.kundansingh.repository.EmployeeRepository;
import com.RMgX.kundansingh.service.EmployeeEntityService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeEntityService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Iterable<EmployeeEntity> getALl() {

		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> getById(int id) {

		return EmployeeEntity.findById(id);
	}

	@Override
	public String add(EmployeeEntity EmployeeEntity) {

		Optional<EmployeeEntity> listData = getById(EmployeeEntity.getId());
		String response = "";
		if (listData.isPresent()) {
			response = AppConstants.DATA_ALREADY_EXISTS;
			return response;
		} else {
			employeeRepository.save(EmployeeEntity);
			response = AppConstants.DATA_SAVED;
			return response;
		}
	}

	@Override
	public String update(EmployeeEntity EmployeeEntity) {

		Optional<EmployeeEntity> listData = getById(EmployeeEntity.getId());
		String response = "";
		if (listData.isPresent()) {
			employeeRepository.save(EmployeeEntity);
			response = AppConstants.DATA_UPDATED;
			return response;
		} else {
			response = AppConstants.NO_DATA;
			return response;
		}
	}

	@Override
	public String deleteById(int id) {
		Optional<EmployeeEntity> listData = getById(id);
		String response = "";
		if (listData.isPresent()) {
			employeeRepository.deleteById((long) id);
			response = AppConstants.DATA_DELETED;
			return response;
		} else {
			response = AppConstants.NO_DATA;
			return response;
		}
	}

	@Override
	public Object getAllById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAllByEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
