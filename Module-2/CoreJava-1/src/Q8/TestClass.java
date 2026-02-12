package Q8;

public class TestClass {

    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.DummyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
