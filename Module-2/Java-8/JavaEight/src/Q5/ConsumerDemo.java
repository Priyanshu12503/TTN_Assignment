package Q5;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consume = (s)->{
            System.out.println("the expected output is " + s);
        };

        String s = "achieved ";
        consume.accept(s);
    }

}
