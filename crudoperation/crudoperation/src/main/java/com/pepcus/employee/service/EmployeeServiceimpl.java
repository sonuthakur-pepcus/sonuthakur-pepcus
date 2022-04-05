package com.pepcus.employee.service;

import java.util.List;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.modal.Address;
import com.pepcus.employee.modal.Employee;
import com.pepcus.employee.repository.EmployeeRepositoy;

@Service
public class EmployeeServiceimpl  {
	@Autowired
	EmployeeRepositoy employeeRepositoy;

	public Employee addemployee(Employee employee) {
		employee.setAdress(employee.getAddress());
		return employeeRepositoy.save(employee);
	}

	
	public List<Employee> getEmployee() {
		List<Employee> emplist=(List<Employee>)employeeRepositoy.findAll(); 
		return emplist;
	}

	
	public String deleteEmployee(int id) {
	    try {
	    	employeeRepositoy.deleteById(id);
	    }catch(Exception e) {
	    	return "employee id not found"+id;
	    }
		return "employee delete successfully"+id;
	}



	}

