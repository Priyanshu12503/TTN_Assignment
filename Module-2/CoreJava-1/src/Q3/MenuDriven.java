package Q3;
import java.util.Scanner;

public class MenuDriven {

    static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("*****MENU*****");
        System.out.println("1. Calculate Area of Circle\n" +
                "2. Calculate Circumference of a Circle\n" +
                "3. Exit.\n" +
                "Choose an option (1-3): ");
        int a = in.nextInt();


        switch (a) {
            case 1:
                double radius;
                System.out.println("Enetr the value of radius ");
                radius = in.nextDouble();
                System.out.println("Area is " + calculateArea(radius));
                break;

            case 2:
                System.out.println("Enetr the value of radius ");
                radius = in.nextDouble();
                System.out.println("Circumference is " + calculateCircumference(radius));
                break;
            case 3:
                System.out.println("Termination the program ");
                return;

            default:
                System.out.println("Enter a valid option");
                break;

        }
    }
}