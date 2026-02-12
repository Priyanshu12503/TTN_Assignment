package Q2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

        public static void main(String[] args) {

            List<String> list = List.of("Java", "Core", "Sql");
            System.out.println(list);

            Set<Integer> set = Set.of(10, 20, 30);
            System.out.println(set);

            Map<Integer, String> map = Map.of(
                    1, "One",
                    2, "Two",
                    3, "Three"
            );
            System.out.println(map);
        }
    }

