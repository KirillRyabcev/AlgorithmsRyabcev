package main.java.exception;

public class ThirdAlgorithmLogicException extends Exception{
    public ThirdAlgorithmLogicException(){
    }
    public ThirdAlgorithmLogicException(String message){
        super(message);
    }
    public ThirdAlgorithmLogicException(String message, Throwable cause){
        super(message,cause);
    }
    public ThirdAlgorithmLogicException(Throwable cause){
        super(cause);
    }
}
