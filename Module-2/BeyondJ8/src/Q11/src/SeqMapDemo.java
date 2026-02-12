

import java.util.*;
public class SeqMapDemo {



    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(2, "B");
        map.put(3, "C");

        map.putFirst(1, "A");
        map.putLast(4, "D");

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map);

        SequencedMap<Integer, String> reversedMap = map.reversed();
        System.out.println(reversedMap);
        }
}
