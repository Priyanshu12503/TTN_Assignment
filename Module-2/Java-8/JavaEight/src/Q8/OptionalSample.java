package Q8;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        Optional<String> firstName = Optional.of("Priyanshu ");

        Optional<String> lastName = Optional.ofNullable(null);

        if(firstName.isPresent()){
            System.out.println("First name is " + firstName.get());
        }

        if(lastName.isPresent()){
            System.out.println("Last name is "+ lastName.get());
        }

        String temp = lastName.orElse("No last name is provided buddy");
        System.out.println(temp);

    }
}
