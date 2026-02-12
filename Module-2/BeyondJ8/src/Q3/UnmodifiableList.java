package Q3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableList {


    public static void main(String[] args) {

        List<String> list =
                Stream.of("Virat", "Rohit", "Jass")
                        .collect(Collectors.toUnmodifiableList());

        System.out.println(list);
    }
}
