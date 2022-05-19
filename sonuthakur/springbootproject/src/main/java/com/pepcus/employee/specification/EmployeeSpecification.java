package com.pepcus.employee.specification;

import org.springframework.data.jpa.domain.Specification;

import com.pepcus.employee.modal.Employee;

public class EmployeeSpecification {
  public static Specification<Employee> findByFirstName(String firstname) {
    return ((root, criteriaQuery, criteriaBuilder) -> {
      return criteriaBuilder.equal(root.get("name"), firstname);
    });
  }

  public static Specification<Employee> findByphone(String phone) {
    return ((root, criteriaQuery, criteriaBuilder) -> {
      return criteriaBuilder.like(root.get("email"), "%" + phone + "%");
    });
  }

  public static Specification<Employee> findByEmail(String email) {
    return ((root, criteriaQuery, criteriaBuilder) -> {
      return criteriaBuilder.equal(root.get("email"), email);
    });
  }
}
