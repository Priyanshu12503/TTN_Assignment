package org.example.employeejpa2.Service;

import jakarta.transaction.Transactional;
import org.example.employeejpa2.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;



@Service
public class JPQLDeleteEmployee {

    private final EmployeeRepo employeeRepo;

    public JPQLDeleteEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Transactional
    public int deleteEmployeesWithMinimumSalary() {

        Double minSalary = employeeRepo.findMinimumSalary();

        return employeeRepo.deleteBySalary(minSalary);
    }
}
