package org.example.employeejpa.Service;

import lombok.Setter;
import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployee {

    private final EmployeeRepo employeeRepo;


    public CreateEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void createNewEmployee(Employee employee)
    {
        employeeRepo.save(employee);
    }

}
