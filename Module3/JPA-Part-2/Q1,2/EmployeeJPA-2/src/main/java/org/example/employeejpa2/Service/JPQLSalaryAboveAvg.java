package org.example.employeejpa2.Service;

import org.example.employeejpa2.Entity.Employee;
import org.example.employeejpa2.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPQLSalaryAboveAvg {

    private final EmployeeRepo employeeRepo;

    public JPQLSalaryAboveAvg(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAboveAverage() {
        return employeeRepo.findAboveAverage();
    }
}
