package Q6;

public class SealedClass {

    public static void main(String[] args) {

            Vehicle v1 = new Car();
            Vehicle v2 = new Bike();
            Vehicle v3 = new ElectricCar();

            System.out.println(v1.getType());
            System.out.println(v2.getType());
            System.out.println(v3.getType());
        }
    }

    sealed abstract class Vehicle permits Car, Bike, ElectricCar {

        abstract String getType();
    }

    final class Car extends Vehicle {

        String getType() {
            return "Car";
        }
    }

    non-sealed class Bike extends Vehicle {

        String getType() {
            return "Bike";
        }
    }

    sealed class ElectricCar extends Vehicle permits Tesla {

        String getType() {
            return "Electric Car";
        }
    }

    final class Tesla extends ElectricCar {

        String getType() {
            return "Tesla";
        }
    }


