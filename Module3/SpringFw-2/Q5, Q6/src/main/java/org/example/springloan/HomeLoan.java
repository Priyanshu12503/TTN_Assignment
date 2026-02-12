package org.example.springloan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HomeLoan implements Loan{


    public HomeLoan (){
        System.out.println("Home loan constructor is called ");
    }
    @Override
    public Double loanInterest() {
        return 7.5;
    }
}
