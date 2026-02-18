package org.example.employeejpa.Repo;

import org.example.employeejpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Q2- Created employee repository

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByAgeBetween(Integer minAge, Integer maxAge);
}
