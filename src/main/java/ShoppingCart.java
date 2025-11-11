package main.java;

import main.java.exceptions.InsufficientFundsException;
import main.java.exceptions.NoSuchProductException;

import java.util.ArrayList;
import java.util.List;

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
        double sale = Math.random() * 0.1 + 0.05;
        double finalSum = tax / 100 * sale;

        if (payment < finalSum) {
            throw new InsufficientFundsException();
        }
    }

    public List<String> getCart() {
        return new ArrayList<>();
    }
}
