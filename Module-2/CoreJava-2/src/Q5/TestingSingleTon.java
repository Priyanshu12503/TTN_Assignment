import java.util.Scanner;

public class TestingSingleTon {

    public static void main() {

        SingleTon one = SingleTon.getInstance();

       SingleTon two = SingleTon.getInstance();

       if(one == two)
       {
           System.out.println("Only one object is created ");
       }

    }
}
