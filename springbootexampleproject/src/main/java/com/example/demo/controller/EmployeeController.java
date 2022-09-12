package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/post")
	public Employee postingdetails(@RequestBody Employee employee) {
		return employeeService.postingdetails(employee);

	}

	@GetMapping("/get/{id}")
	public Optional<Employee> gettingdetails(@PathVariable("id") Integer id ) {
		return employeeService.gettingDetails(id);

	}


	@GetMapping("/get")
	public	List<Employee> gettingalldetails() {
		return employeeService.getalldetails();
	}

	@DeleteMapping("/delete/{id}")
	public void deletedetails(@PathVariable Integer id) {
		employeeService.deletedetails(id);

	}

	@PutMapping("/update")
	public void updatedetails(@RequestBody Employee employee) {
		employeeService.updatedetails(employee);
	}



}
