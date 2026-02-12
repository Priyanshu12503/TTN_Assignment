package org.example.employeeh2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(Employeerepo repo) {
        return args -> {
            repo.save(new Employee(1L, "Priyanshu", "IT"));
            repo.save(new Employee(2L, "Jass", "CSE"));
            repo.save(new Employee(3L, "Priya", "Bt"));

            System.out.println("Sample data inserted 🚀");
        };


    }
}