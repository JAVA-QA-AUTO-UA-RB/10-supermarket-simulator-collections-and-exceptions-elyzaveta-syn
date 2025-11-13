package main.java.exceptions;

public class DuplicateCategoryException extends RuntimeException {
    public DuplicateCategoryException(String category) {
        super("Зазначена категорія вже існує.");
    }
}
