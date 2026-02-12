package Q10;

import java.util.*;

public class SewCollection {
    public static void main(String[] args) {

        Deque<String> list = new LinkedList<>();


        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        Integer first = set.iterator().next();
        Integer last = null;
        for (Integer i : set) {
            last = i;
        }

        System.out.println(first);
        System.out.println(last);

        set.remove(first);
        set.remove(last);

        System.out.println(set);
    }
}
