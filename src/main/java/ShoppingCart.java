package main.java;

import java.util.ArrayList;
import java.util.List;

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("Оплати недостатньо!");
    }
}

public class ShoppingCart {

    List<String> productCart = new ArrayList<>();

    public void addToCart(String product) {
        productCart.add(product);
    }

    public void checkout(PriceCatalog catalog, double payment) {
        double sum = 0.0;

        for (String product : productCart) {
            double price = catalog.getPrice(product);
            if (price <= 0) {
                throw new NoSuchProductException(product);
            }
            sum += price;
        }

        double tax = sum * (10 / 100);
        double sale = (5 / 100) + Math.random() * 10 / 100;
        double finalSum = tax / 100 * sale;

        if (payment < finalSum) {
            throw new InsufficientFundsException();
        }
    }

    public List<String> getCart() {
        return new ArrayList<>();
    }
}
