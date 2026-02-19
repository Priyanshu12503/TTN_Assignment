package org.example.employeejpa2.Repo;

import jakarta.transaction.Transactional;
import org.example.employeejpa2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Query("""
        select e
        from Employee e
        where e.salary > (select avg(e2.salary) from Employee e2)
        order by e.age asc, e.salary desc
    """)
    List<Employee> findAboveAverage();

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double findAverageSalary();

    @Modifying
    @Query("UPDATE Employee e SET e.salary = :newSalary WHERE e.salary < :avg")
    int updateSalaryBelowAverage(@Param("newSalary") Double newSalary,
                                 @Param("avg") Double avg);

    @Query("SELECT MIN(e.salary) FROM Employee e")
    Double findMinimumSalary();

    @Modifying
    @Query("DELETE FROM Employee e WHERE e.salary = :minSalary")
    int deleteBySalary(@Param("minSalary") Double minSalary);

    @Query(value = """
            SELECT emp_id, emp_first_name, emp_age
            FROM employeeTable
            WHERE emp_last_name LIKE %:suffix
            """, nativeQuery = true)
    List<Object[]> findEmployeesByLastNameEndingWith(@Param("suffix") String suffix);

    @Modifying
    @Query(value = """
        DELETE FROM employeeTable
        WHERE emp_age > :age
        """, nativeQuery = true)
    int deleteEmployeesOlderThan(@Param("age") Integer age);

}

