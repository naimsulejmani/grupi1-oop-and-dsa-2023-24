package oop.exceptions;

//Unchecked exception
public class IDontLikeException extends RuntimeException {
    public IDontLikeException() {
    }

    public IDontLikeException(String message) {
        super(message);
    }

    public IDontLikeException(String message, Throwable cause) {
        super(message, cause);
    }
}
