package com.mySpring.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySpring.api.pojo.Employee;
import com.mySpring.api.repogetroy.EmployeeRepo;

@Service
public class EmployeeDao {
	@Autowired
	private EmployeeRepo repo;
	
	public Employee insertData(Employee emp) {
		
		return repo.save(emp);
	}
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	public String deleteByid(int id) {
		repo.deleteById(id);
		return "Deleted  id is "+id;
	}
	public Employee update(Employee e) {
		System.out.println(e.getEId());
		Employee emp=repo.findById(e.getEId()).orElse(null);

		emp.setEName(e.getEName());
		emp.setEAge(e.getEAge());
		emp.setEEmail(e.getEEmail());
		
		return repo.save(emp);
	}


}
