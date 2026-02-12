package Q4;

import java.util.HashMap;
import java.util.Map;

public class TestingEmployee {

    public static void main(String[] args) {

        HashMap<Employee, Double> employeeData = new HashMap<>();

        Employee e1 = new Employee("Rohit","Enginner", 24);
        Employee e2 = new Employee("Riya","Analyst", 44);
        Employee e3 = new Employee("Json","HR", 37);


        employeeData.put(e1, 50000.00);
        employeeData.put(e2, 98000.10);
        employeeData.put(e3, 75000.50);

        for(Map.Entry<Employee,Double> e: employeeData.entrySet())
        {
            Employee employee = e.getKey();
            System.out.println("Name is "+employee.name+"," +
                    " Designation is "+ employee.designation+
                    ", age is "+ employee.age +
                    " and the salary is " + e.getValue());

        }

    }
}
