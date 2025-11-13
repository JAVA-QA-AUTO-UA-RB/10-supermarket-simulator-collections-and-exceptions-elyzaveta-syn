package main.java;

import main.java.exceptions.DuplicateCategoryException;

import java.util.HashSet;
import java.util.Set;

public class CategoryManager {

    Set<String> categories = new HashSet<>();

    private boolean exist(String category) {
        return true;
    }

    public void addCategory(String category) {
        if (!exist(category)) {
            throw new DuplicateCategoryException(category);
        }
        categories.add(category);
    }

    public Set<String> getCategories() {
        return categories;
    }
}
