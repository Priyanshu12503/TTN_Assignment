package Q7;

public class ExceptionHandling {

    public static void main() {
        System.out.println();
        int a = 100;
        int b = 0;
        try{
            int restut = a/b;

        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (OutOfMemoryError e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {

            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Multiple exceptions are tested succesfully ");
        }
    }
}
