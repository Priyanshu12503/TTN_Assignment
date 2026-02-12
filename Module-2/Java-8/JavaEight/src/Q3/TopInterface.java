package Q3;

public interface TopInterface {

    default public void display(){
        System.out.println("Called from the TopInterface ");
    }
}
