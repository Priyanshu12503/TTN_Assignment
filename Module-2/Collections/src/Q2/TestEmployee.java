package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

     public static void main() {


         List<Employee> list = new ArrayList<>();

         list.add(new Employee("Rohit sharma ",30,45000.00));
         list.add(new Employee("Riya sharma ",28,78000.10));
         list.add(new Employee("John doe ",40,45000.20));
         list.add(new Employee("Kaur ",65,100000.00));
         list.add(new Employee("Shivani mahajan ",93,30000.00));
         list.add(new Employee("Ziendiya  ",13,30000.00));
         list.add(new Employee("Austin  ",35,30000.00));

         System.out.println("\n Initial data \n");
         for(Employee e: list)
         {
             System.out.println(e.toString());
         }

         Collections.sort(list);

         System.out.println("\n After the sorting using name \n");

         for(Employee e: list)
         {
             System.out.println(e.toString());
         }

         System.out.println("\n After sorting using salaey as parameter \n");

         Collections.sort(list, new SalaryComprator());

         for(Employee e: list)
         {
             System.out.println(e.toString());
         }
     }
}
