package oop.exceptions.ushtrime;

public class RequiredException extends Exception {
    public RequiredException() {
    }

    public RequiredException(String message) {
        super(message);
    }

    public RequiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
