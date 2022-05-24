package com.mySpring.api.repogetroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mySpring.api.pojo.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
