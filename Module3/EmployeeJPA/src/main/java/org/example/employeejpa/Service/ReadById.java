package org.example.employeejpa.Service;

import org.example.employeejpa.Controller.EmployeeController;
import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class ReadById {

    private final EmployeeRepo employeeRepo;


    public ReadById(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee getemp(Long id)
    {

        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }


}
