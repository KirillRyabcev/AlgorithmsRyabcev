package main.java.exception;

public class FirstAlgorithmLogicException extends Exception{
    public FirstAlgorithmLogicException(){
    }
    public FirstAlgorithmLogicException(String message){
        super(message);
    }
    public FirstAlgorithmLogicException(String message, Throwable cause){
        super(message,cause);
    }
    public FirstAlgorithmLogicException(Throwable cause){
        super(cause);
    }
}
