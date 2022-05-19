package com.pepcus.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pepcus.employee.modal.Employee;
import com.pepcus.employee.repository.AddressRepository;
import com.pepcus.employee.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;
  @Autowired
  AddressRepository addressrepository;

  @Override
  public Employee insertEmployee(Employee employee) {
    employeeRepository.save(employee);
    addressrepository.saveAll(employee.getAddress());
    return employee;
  }

  @Override
  public List<Employee> getAllEmployee() {
    List<Employee> employeelist = (List<Employee>) employeeRepository.findAll();

    return employeelist;
  }

  @Override
  public String getDeleteEmployeeById(int id) {
    try {
      employeeRepository.deleteById(id);
    } catch (Exception e) {
      return "Employee id not found==>" + id;
    }
    return "Employee delete Successfully==>" + id;
  }

  @Override
  public Employee updateEmployee(Employee employee) {

    return employeeRepository.save(employee);
  }

  @Override
  public List<Employee> findAllOrderByNameAsc() {
    return employeeRepository.findAllOrderByNameAsc();
  }

  @Override
  public List<Employee> filterByDepartment(String department) {

    return employeeRepository.filterByDepartment(department);
  }

}
