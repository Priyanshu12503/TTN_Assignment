package Q10;

import java.time.LocalDate;
import java.util.Scanner;

public class CompareDates {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first date in format of yyyy-mm-dd");
        String first = in.nextLine();

        System.out.println("Enter the second date in format of yyyy-mm-dd");
        String second = in.nextLine();

        LocalDate date1 = LocalDate.parse(first);
        LocalDate date2 = LocalDate.parse(second);

        if(date1.isBefore(date2)){
            System.out.println("First date is before the second date ");
        } else if(date1.isAfter(date2)){
            System.out.println("First date is after the second date ");

        }
        else {
            System.out.println("Both the dates are same ");
        }
    }
}
