package Q7;

import java.util.stream.Stream;

public class IteratorStream {

    public static void main(String[] args) {

        Stream<Integer> stream =
                Stream.iterate(1, i -> i <= 10, i -> i + 1);

        stream.forEach(System.out::println);
    }
}
