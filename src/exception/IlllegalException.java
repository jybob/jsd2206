package exception;

public class IlllegalException extends Exception{
    public IlllegalException() {
    }

    public IlllegalException(String message) {
        super(message);
    }

    public IlllegalException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlllegalException(Throwable cause) {
        super(cause);
    }

    public IlllegalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {

    }
}
