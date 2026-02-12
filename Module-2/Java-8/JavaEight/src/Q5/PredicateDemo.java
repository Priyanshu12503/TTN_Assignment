package Q5;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isPositive = (i)->i>0;


        System.out.println("The entered number is Positive "+isPositive.test(-4));
        System.out.println("The entered number is Positive "+isPositive.test(10));

    }

}
