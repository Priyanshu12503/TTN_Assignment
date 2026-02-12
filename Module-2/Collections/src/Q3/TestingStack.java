package Q3;

public class TestingStack   {

    static void main(String[] args) {

        SpecialStack stack = new SpecialStack();


        stack.push(5);
        stack.push(1);
        stack.push(15);
        stack.push(2);
        stack.push(100);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println("Minimum is "+ stack.getMin());
        stack.push(0);
        System.out.println("Minimum is "+ stack.getMin());
    }
}
