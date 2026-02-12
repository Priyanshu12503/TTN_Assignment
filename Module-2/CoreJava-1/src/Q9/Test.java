package Q9;

public class Test
{
    public static void main(String[] args) throws NoStackTraceException {
        try {
            throw new NoStackTraceException("This exception has no trace ");
        }catch (NoStackTraceException ne)
        {
            System.out.println("Lenght of stack trace is "+ne.getStackTrace().length);
        }
    }
}