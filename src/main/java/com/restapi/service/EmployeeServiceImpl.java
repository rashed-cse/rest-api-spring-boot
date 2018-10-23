
package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.entity.Employee;
import com.restapi.entity.Manager;
import com.restapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	@Transactional
	public Employee findById(Integer id) {
		return employeeRepository.getById(id);
	}

	@Override
	public List<Employee> findAllByManager(Manager manager) {
		return employeeRepository.findByManager(manager);
	}

	@Override
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}

}
