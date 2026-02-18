package org.example.employeejpa.Service;

import org.example.employeejpa.Entity.Employee;
import org.example.employeejpa.Repo.EmployeeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PagingSorting {

    private final EmployeeRepo employeeRepo;

    public PagingSorting(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Page<Employee> sortedEmp(int pageNumber,int pageSize)
    {
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("age").ascending());
        return employeeRepo.findAll(pageable);
    }
}
