package Q3;

public class BottomClass implements LeftInterface, RightInterface{


    @Override
    public void display() {

        System.out.println("Printing from display of bottomClass");
        LeftInterface.super.display();
        RightInterface.super.display();
    }

    public static void main(String[] args) {
        BottomClass obj = new BottomClass();
        obj.display();
    }
}
