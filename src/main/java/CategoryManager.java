package main.java;

import java.util.HashSet;
import java.util.Set;

class DuplicateCategoryException extends RuntimeException {
    public DuplicateCategoryException(String category) {
        super("Зазначена категорія вже існує.");
    }
}

public class CategoryManager {

    Set<String> categories = new HashSet<>();

    private boolean exist(String category) {
        return true;
    }

    public void addCategory(String category) {
        if (!exist(category)) {
            throw new OutOfStockException(category);
        }
        categories.add(category);
    }

    public Set<String> getCategories() {
        return new HashSet<>();
    }
}
