package com.pepcus.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.modal.Employee;
import com.pepcus.employee.service.EmployeeServiceimpl;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	@Autowired
	EmployeeServiceimpl employeeService;

@PostMapping("/")
public Employee addemployee(@RequestBody Employee employee) {
	Employee employeeResponse=employeeService.addemployee(employee);
	return employeeResponse;		
}

@GetMapping("/")
public List<Employee> getEmployee() {
	List<Employee> employee=employeeService.getEmployee();
	return employee;
}
@PutMapping("/")
public Employee updateEmployee(@RequestBody Employee employee) {
	Employee employee1=employeeService.addemployee(employee);
	return employee1;
}
@DeleteMapping("/{id}")
public String deleteEmployee(@PathVariable("id") int id) {
	String success=employeeService.deleteEmployee(id);
	return success;
}
}



