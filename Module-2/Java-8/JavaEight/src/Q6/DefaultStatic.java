package Q6;

public interface DefaultStatic {

    default void displayDefualt(){
        System.out.println("Called from Default function ");

    }

    static void displayStatic(){
        System.out.println("Called from static function ");
    }
}
