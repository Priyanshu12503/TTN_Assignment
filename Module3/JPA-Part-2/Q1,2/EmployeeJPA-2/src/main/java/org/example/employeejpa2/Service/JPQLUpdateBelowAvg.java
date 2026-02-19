package org.example.employeejpa2.Service;

import jakarta.transaction.Transactional;
import org.example.employeejpa2.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class JPQLUpdateBelowAvg {

    private final EmployeeRepo employeeRepo;

    public JPQLUpdateBelowAvg(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Transactional
    public int updateSalary(Double newSalary)
    {
        Double avgSalary = employeeRepo.findAverageSalary();
        int updated = employeeRepo.updateSalaryBelowAverage(newSalary, avgSalary);
        return updated;
    }
}
