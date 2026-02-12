package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class TryingFunctionalInterface {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
    CompareValue cv = (a, b) -> {
        if (a > b)
            return true;
        return false;
    };

    IncrementOne io = (a) -> a + 1;

    MergeString ms = (a, b) -> a.concat(b);

    UpperCase uc = (a) -> a.toUpperCase();

        System.out.println("Tesing CompareValue interface ");
        System.out.println(cv.compare(10,20));
        System.out.println(cv.compare(45,32));
        System.out.println();

        System.out.println("Testing IncrementOne interface ");
        System.out.println("Enter value to be incremented");
        int val = Integer.parseInt(in.nextLine());
        System.out.println("The incremented value is "+ io.increase(val));
        System.out.println();

        System.out.println("Testing MergeString interface ");
        System.out.println("Enter string one ");
        String s1 = in.nextLine();
        System.out.println("Enter string two");
        String s2 = in.nextLine();
        System.out.println("The resultant string is "+ ms.concatString(s1,s2));
        System.out.println();

        System.out.println("Testing UpperCase interface ");
        System.out.println("Enter string to be converted ");
        String s3 = in.nextLine();
        System.out.println("Converted string is "+ uc.toupper(s3));




}
}
