
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {

    private static Object writer;
    String firstName;
    String lastName;
    int age;
    String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    static void main(String[] args) {

        try {String name;
            Scanner in = new Scanner(System.in);
            FileWriter writer = new FileWriter("UserData.txt", true);
            while (true) {


                System.out.println("Enter the First name ");
                String fn = in.nextLine();
                System.out.println("Enter the Last name ");
                String ln = in.nextLine();
                System.out.println("Enter the age ");
                int age = Integer.parseInt(in.nextLine());
                System.out.println("Enter the phone number ");
                String pn = in.nextLine();

                User one = new User(fn, ln, age, pn);
                String s = one.toString();
                writer.write(s + System.lineSeparator());
                writer.flush();

                System.out.println("Data saved Successfully ");
                System.out.println("Do you want to continue adding more users if not then enter quit ");
                String check = in.nextLine();

                if (check.equalsIgnoreCase("QUIT")) {
                    break;
                }

            }
            }catch(IOException e)
            {
                System.out.println("File not found ");
            }

    }
}
