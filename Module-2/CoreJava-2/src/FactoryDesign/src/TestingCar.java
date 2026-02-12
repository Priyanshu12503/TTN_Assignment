import java.util.Scanner;

public class TestingCar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter type of engine: ");
        String e = in.nextLine();

        Car car = CarMaker.createCar(e);
        if (car != null) {
            car.drive();
        }
    }
}