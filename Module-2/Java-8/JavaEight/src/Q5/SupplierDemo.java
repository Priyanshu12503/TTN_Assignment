package Q5;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Integer> supplier = ()->{
            return 145;

        };

        System.out.println("The value is "+supplier.get());

    }
}
