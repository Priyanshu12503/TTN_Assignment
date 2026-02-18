package org.example.employeejpa.Service;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindByName {

    private final EmployeeRepo employeeRepo;

    public FindByName(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public List<Employee> getEmployeesByName(String name) {
        return employeeRepo.findByName(name);
    }
}
