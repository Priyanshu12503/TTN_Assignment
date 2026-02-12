package Q7;

import java.util.ArrayList;

public class StreamSum {

     public static void main(String[] args) {

         ArrayList<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(5);
         list.add(20);
         list.add(2);
         list.add(30);
         list.add(4);

         int solution = list.stream()
                 .filter((a)->a>5)
                 .mapToInt(Integer::intValue)
                 .sum();

         System.out.println("Sum of numbers greater then 5 is "+solution);
    }
}
