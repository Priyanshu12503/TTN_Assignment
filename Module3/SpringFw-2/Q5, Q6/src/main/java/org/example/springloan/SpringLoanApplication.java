package org.example.springloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLoanApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringLoanApplication.class, args);

        EMICalculator calculator = context.getBean(EMICalculator.class);

        System.out.println("Injected Loan Bean: " + calculator.getLoan().getClass().getSimpleName());
        System.out.println("Calculated EMI for amount 5000: " + calculator.calculateEMI(5000));
    }
}
