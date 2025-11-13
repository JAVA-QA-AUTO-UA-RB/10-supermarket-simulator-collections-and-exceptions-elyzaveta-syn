package main.java.exceptions;

public class NoSuchProductException extends RuntimeException {
    public NoSuchProductException(String product) {
        super("Товар \"" + product + "\" не існує.");
    }
}
