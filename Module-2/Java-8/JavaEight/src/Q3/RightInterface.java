package Q3;

public interface RightInterface extends TopInterface{

    default public void display(){
        System.out.println("Printing from the RightInterface ");
    }

}
