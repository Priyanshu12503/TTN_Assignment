package org.example.employeejpa.Service;

import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class DeleteEmployee {

    private final EmployeeRepo employeeRepo;


    public DeleteEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public String deleteEmp(Long id)
    {
        if(employeeRepo.existsById(id)) {
            employeeRepo.deleteById(id);
            return "Employee is deleted successfully";
        } else {
           return "Employee not found";
        }

    }
}
