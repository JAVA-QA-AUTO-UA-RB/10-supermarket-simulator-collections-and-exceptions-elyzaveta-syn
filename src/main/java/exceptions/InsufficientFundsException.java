package main.java.exceptions;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("Оплати недостатньо!");
    }
}
