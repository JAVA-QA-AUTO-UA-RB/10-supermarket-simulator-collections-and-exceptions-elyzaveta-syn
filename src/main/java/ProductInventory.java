package main.java;

import java.util.ArrayList;
import java.util.List;

class OutOfStockException extends RuntimeException {
    public OutOfStockException(String product) {
        super("Товар \"" + product + "\" відсутній на складі.");
    }
}

public class ProductInventory {
    List<String> products = new ArrayList<>();

    private boolean isHere(String product) {
        return true;
    }

    public void addProduct(String product) {
        products.add(product);
    }

    private void removeProduct(String product) {
        if (!isHere(product)) {
            throw new OutOfStockException(product);
        }
        products.remove(product);
    }

    public void sortProducts() {
        products.sort(String::compareTo);
    }

    public List<String> getProducts() {
        return products;
    }
}
