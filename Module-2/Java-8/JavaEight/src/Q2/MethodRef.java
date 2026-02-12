package Q2;

public class MethodRef {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Calculate addRef = calculator::addition;
        System.out.println("Addition testing "+addRef.operate(25, 10));

        Calculate subRef = calculator::subtraction;
        System.out.println("Subtracton testing "+ subRef.operate(25,10));

        Calculate mulRef = Calculator::multiply;
        System.out.println("Testing the multiply "+mulRef.operate(20, 2));


    }
}
