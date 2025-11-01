package main.java;

import java.util.HashMap;
import java.util.Map;

public class StockManager {

    Map<String, Integer> stock = new HashMap<>();

    public void addStock(String product, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Кількість не може бути негативною.");
        }
        stock.put(product, quantity);
    }

    public void reduceStock(String product) {
        Integer quantity = stock.get(product);
        if (quantity <= 0) {
            throw new OutOfStockException(product);
        }
        stock.put(product, quantity - 1);
    }

    public Map<String, Integer> getStock() {
        return new HashMap<>();
    }
}
