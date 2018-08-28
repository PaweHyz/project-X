package bank.app;

public class InvalidNipException extends RuntimeException {

    public InvalidNipException(String msg){
        super(msg);
    }
}
