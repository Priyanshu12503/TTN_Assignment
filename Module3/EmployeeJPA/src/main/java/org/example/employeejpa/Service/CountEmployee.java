package org.example.employeejpa.Service;

import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class CountEmployee {

    private final EmployeeRepo employeeRepo;

    public CountEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Long countEmp()
    {
        return employeeRepo.count();
    }
}
