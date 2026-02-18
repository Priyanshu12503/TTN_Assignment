package org.example.employeejpa.Service;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWithA {

    private final EmployeeRepo employeeRepo;

    public EmployeeWithA(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> nameWithA()
    {
        return employeeRepo.findByNameStartingWith("A");
    }
}
