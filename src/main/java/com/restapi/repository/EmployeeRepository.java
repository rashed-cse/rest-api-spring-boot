package com.restapi.repository;

import java.lang.annotation.Native;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restapi.entity.Manager;
import com.restapi.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee getById(Integer id);

	@Query("SELECT e FROM Employee e WHERE LOWER(e.manager) = LOWER(:manager)")
	public List<Employee> findByManager(@Param("manager") Manager manager);
}
