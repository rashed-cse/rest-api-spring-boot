package com.restapi.service;

import java.util.List;

import com.restapi.entity.Manager;
import  com.restapi.entity.Employee;

public interface EmployeeService {
	public Employee findById(Integer id);
	public List<Employee> findAll();
	public Employee save(Employee employee);
	public Employee update(Employee employee);
	public void delete(Employee employee);
	public List<Employee> findAllByManager(Manager manager);
}
