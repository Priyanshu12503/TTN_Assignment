public class SingleTon {


    private static SingleTon element;
    private SingleTon()
    {
        System.out.println("Constructor of SingleTon is being called ");
    }

    public static SingleTon getInstance()
    {
        if(element == null){
            element = new SingleTon();
            System.out.println("Instance is been created ");

        }
        return element;
    }
}
