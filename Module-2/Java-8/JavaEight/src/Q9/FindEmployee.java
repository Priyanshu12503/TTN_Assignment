package Q9;

import java.util.ArrayList;
import java.util.List;

public class FindEmployee {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Priyanshu Bhushan Dutt", 100L,"Delhi"));
        list.add(new Employee("joseph sharma uncle", 30000L,"Noida"));
        list.add(new Employee("Karan kaushik sharma", 5000L,"Delhi"));
        list.add(new Employee("Jasmin kaur ", 4000L,"Delhi"));
        list.add(new Employee("Viraj bell sharma", 6500L,"London"));

        List<String> solution = list.stream()
                .filter(a->a.getSalary()<5000)
                .filter(a->a.getCity().equalsIgnoreCase("delhi"))
                .map(a->a.getFullName().split(" ")[0])
                .distinct()
                .toList();

        System.out.println("Printing required first names");

        for(String s: solution)
        {
            System.out.println(s);
        }
    }
}
