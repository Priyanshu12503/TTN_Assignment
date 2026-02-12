package org.example.springloan;

import org.springframework.stereotype.Service;

@Service
public class EMICalculator {

    private final Loan loan;

    public EMICalculator(Loan loan)
    {
        this.loan = loan;
    }

    public double calculateEMI(double amount) {
        return amount * loan.loanInterest() / 100;
    }

    public Object getLoan() {
        return loan;
    }
}
