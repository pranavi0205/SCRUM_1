package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
   @Autowired
   private EmployeeDao repo;
   
   public EmployeeService() {}

   public EmployeeService(EmployeeDao repo) {
	super();
	this.repo = repo;
    }
   
    public void SaveEmployee(Employee emp) {
    	repo.save(emp);
    }
    public Iterable<Employee> showAllEmp()
    {
    	return repo.findAll();
    }
    public Employee findByEmail(String email)
    {
    	return repo.findByEmail(email);
    }
    
   public Employee findByUsername(String username)
   {
    	return repo.findByUsername(username);
    }
    
    
    
    
}
