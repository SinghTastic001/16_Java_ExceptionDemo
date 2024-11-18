package ExceptionHandling1;

public class AgeInvalidException extends RuntimeException {

    public AgeInvalidException(String message) {
        super(message);
    }
}