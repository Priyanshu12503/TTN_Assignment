package Q1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalToStream {
    public static void main(String[] args) {


        Optional<String> optional1 = Optional.of("Car");
        Stream<String> stream1 = optional1.stream();
        stream1.forEach(System.out::println);


        Optional<String> optional2 = Optional.empty();

        Stream<String> stream2 = optional2.stream();
        System.out.println("Count of elements: " + stream2.count());

        List<Optional<String>> list = List.of(
                Optional.of("Bike"),
                Optional.empty(),
                Optional.of("jeep"),
                Optional.of("Truck")
        );

        List<String> result =
                list.stream()
                        .flatMap(Optional::stream)
                        .toList();

        System.out.println("Final Result: " + result);
    }
}