package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//uc1 code files - It provide CRUD operations
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
