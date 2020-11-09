package main.java.exception;

public class SecondAlgorithmLogicException extends Exception {
    public SecondAlgorithmLogicException(){
    }
    public SecondAlgorithmLogicException(String message){
        super(message);
    }
    public SecondAlgorithmLogicException(String message, Throwable cause){
        super(message,cause);
    }
    public SecondAlgorithmLogicException(Throwable cause){
        super(cause);
    }
}
