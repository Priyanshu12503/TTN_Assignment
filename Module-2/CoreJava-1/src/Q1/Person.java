package Q1;

public class Person {

    static String firstName = "Priyanshu";
    static String lastName = "dutt";
    static int age = 21;

    static {
        System.out.println("The first name of person is " + firstName);
    }

    public static void printLastName()
    {
        System.out.println("last name is "+ lastName);
    }

    public static void main(String[] args) {

        printLastName();
        System.out.println("Age is "+age);
    }
}

