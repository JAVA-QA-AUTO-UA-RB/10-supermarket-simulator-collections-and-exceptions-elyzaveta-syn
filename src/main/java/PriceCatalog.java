package main.java;

import java.util.HashMap;
import java.util.Map;

class NoSuchProductException extends RuntimeException {
    public NoSuchProductException(String product) {
        super("Товар \"" + product + "\" не існує.");
    }
}

public class PriceCatalog {

    Map<String, Double> catalog = new HashMap<>();

    private boolean isHere(String product) {
        return true;
    }

    public void addPrice(String product, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути негативною.");
        }
        catalog.put(product, price);
    }

    public Double getPrice(String product) {
        if (!isHere(product)) {
            throw new NoSuchProductException(product);
        }
        return catalog.get(product);
    }

    public Map<String, Double> getPrices() {
        return new HashMap<>();
    }
}
