package Q2;

import java.util.Scanner;
public class Xdone {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String result="";
        System.out.println("Start entring the text ");
        String s = "";

        while (!s.equalsIgnoreCase("xdone"))
        {
            s = in.nextLine();
            result+=s+"\n";

        }
        System.out.println(result);
    }
}
