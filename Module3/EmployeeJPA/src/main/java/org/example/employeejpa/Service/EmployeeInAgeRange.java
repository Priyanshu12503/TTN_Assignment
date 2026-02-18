package org.example.employeejpa.Service;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInAgeRange {

    private final EmployeeRepo employeeRepo;

    public EmployeeInAgeRange(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> employeeInRange(){
        return employeeRepo.findByAgeBetween(28,32);
    }
}
