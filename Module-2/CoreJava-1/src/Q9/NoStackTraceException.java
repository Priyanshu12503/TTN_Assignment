package Q9;

public class NoStackTraceException extends Exception{

    public NoStackTraceException(String message){
        super(message,null,false,false);
    }

}
