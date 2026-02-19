package org.example.employeejpa2.Service;

import jakarta.transaction.Transactional;
import org.example.employeejpa2.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class NATIVE_deleteEmployee {

    private final EmployeeRepo employeeRepo;

    public NATIVE_deleteEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Transactional
    public int deleteEmployeeWithAgeMore(Integer age){

        return employeeRepo.deleteEmployeesOlderThan(age);
    }
}
