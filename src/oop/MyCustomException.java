package oop;

public class MyCustomException extends RuntimeException {

    public MyCustomException(String message) {
        super("My Custom Exception Format: " + message);
    }

    @Override
    public String getMessage() {
        final String messagePrefix = "[%date] [%class_name] ";
        String message = super.getMessage();
        return messagePrefix + message;
    }
}
