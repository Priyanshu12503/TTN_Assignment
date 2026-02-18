package org.example.employeejpa.Service;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateEmployee {

    private final EmployeeRepo employeeRepo;

    public UpdateEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee updateEmp(Long id, Employee newEmp){
        Employee oldEmp = employeeRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found "));

        oldEmp.setAge(newEmp.getAge());
        oldEmp.setName(newEmp.getName());
        oldEmp.setLocation(newEmp.getLocation());

        employeeRepo.save(oldEmp);

        return oldEmp;


    }
}
