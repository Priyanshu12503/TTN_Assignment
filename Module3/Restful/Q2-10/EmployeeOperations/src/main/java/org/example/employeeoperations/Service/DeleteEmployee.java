package org.example.employeeoperations.Service;

import org.example.employeeoperations.DTO.EmployeeList;
import org.springframework.stereotype.Service;

@Service
public class DeleteEmployee {

    private final EmployeeList employeeList;

    public DeleteEmployee(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public String deleteEmployee(Integer id)
    {
        return employeeList.deleteEmployee(id);
    }
}
