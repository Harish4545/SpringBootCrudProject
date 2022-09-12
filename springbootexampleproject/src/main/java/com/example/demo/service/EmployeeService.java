package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee postingdetails(Employee employee) {
		// TODO Auto-generated method stub
		
	return	employeeRepository.save(employee);
		
	}

	public Optional<Employee> gettingDetails(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	public void deletedetails(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	public void updatedetails(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getId()!=null && employeeRepository.existsById(employee.getId()))
			employeeRepository.save(employee);
	}

	public List<Employee> getalldetails() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	

}
