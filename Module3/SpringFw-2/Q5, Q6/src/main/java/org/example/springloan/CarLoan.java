package org.example.springloan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CarLoan implements Loan {

    public CarLoan() {
        System.out.println("Constructor of CarLaon is called ");
    }

    @Override
    public Double loanInterest() {
        return 11.5;
    }
}
