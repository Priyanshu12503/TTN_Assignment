package org.example.employeejpa2.Service;

import jakarta.transaction.Transactional;
import org.example.employeejpa2.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NATIVE_nameWithSingh {

    private final EmployeeRepo employeeRepo;

    public NATIVE_nameWithSingh(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Transactional
    public List<String> getEmployeesEndingWithSingh() {

        List<Object[]> results = employeeRepo.findEmployeesByLastNameEndingWith("singh");

        List<String> result = new ArrayList<>();

        for (Object[] row : results) {

            Integer id = ((Number) row[0]).intValue();
            String firstName = (String) row[1];
            Integer age = ((Number) row[2]).intValue();

            result.add("ID: " +id +
                    ", Name: " +firstName +
                    ", Age: " +age);
        }

        return result;
    }
}
