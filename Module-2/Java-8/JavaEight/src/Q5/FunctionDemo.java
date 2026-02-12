package Q5;

import java.util.function.Function;

public class FunctionDemo {

    static void main(String[] args) {

        Function<String, String> merge =(a)->a+" merged";

        System.out.println(merge.apply("Passed string is"));

    }
}
