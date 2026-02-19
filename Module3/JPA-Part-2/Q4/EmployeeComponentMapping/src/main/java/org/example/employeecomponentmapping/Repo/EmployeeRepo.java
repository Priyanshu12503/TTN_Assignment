package org.example.employeecomponentmapping.Repo;

import org.example.employeecomponentmapping.Enity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
