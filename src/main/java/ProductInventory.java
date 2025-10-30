package main.java;

import java.util.ArrayList;
import java.util.Comparator;
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

    // видаляє товар, кидає OutOfStockException, якщо товару немає.
    private void removeProduct(String product) {
        if (!isHere(product)) {
            throw new OutOfStockException(product);
        }
        products.remove(product);
    }

    // сортує товари за алфавітом (Collections.sort())
    public void sortProducts() {
        products.sort((Comparator<? super String>) products);
    }

    // повертає список товарів
    public List<String> getProducts() {
        return new ArrayList<>(products);
    }
}
