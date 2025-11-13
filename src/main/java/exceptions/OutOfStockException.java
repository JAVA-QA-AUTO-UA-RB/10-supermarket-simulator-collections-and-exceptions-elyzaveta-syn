package main.java.exceptions;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String product) {
        super("Товар \"" + product + "\" відсутній на складі.");
    }
}
