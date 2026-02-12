package Q4;

public class TestCar {

    public static void main(String[] args) {

        CarMaker cm = Car::new;

        Car c1 = cm.makeCar("Skoda", 22000.00);
        Car c2 = cm.makeCar("BMW", 4500.56);
        Car c3 = cm.makeCar("Tata", 500.00);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}
