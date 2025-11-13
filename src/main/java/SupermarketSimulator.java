package main.java;

import main.java.exceptions.DuplicateCategoryException;
import main.java.exceptions.InsufficientFundsException;
import main.java.exceptions.NoSuchProductException;
import main.java.exceptions.OutOfStockException;

public class SupermarketSimulator {
    public static void main(String[] args) {

        ProductInventory inventory = new ProductInventory();
        CategoryManager categories = new CategoryManager();
        PriceCatalog prices = new PriceCatalog();
        StockManager stock = new StockManager();
        ShoppingCart cart = new ShoppingCart();

        try {
            inventory.addProduct("Apple");
            inventory.addProduct("Bread");
            inventory.addProduct("Milk");
            categories.addCategory("Fruits");
            categories.addCategory("Bakery");
            prices.addPrice("Apple", 1.5);
            prices.addPrice("Bread", 2.0);
            prices.addPrice("Milk", 1.0);
            stock.addStock("Apple", 10);
            stock.addStock("Bread", 5);
            stock.addStock("Milk", 3);

            cart.addToCart("Apple");
            stock.reduceStock("Apple");
            cart.addToCart("Milk");
            stock.reduceStock("Milk");

            double payment = 5.0; // Імітація оплати
            cart.checkout(prices, payment);

            inventory.sortProducts();
            System.out.println("Товари: " + inventory.getProducts());
            System.out.println("Категорії: " + categories.getCategories());
            System.out.println("Ціни: " + prices.getPrices());
            System.out.println("Запаси: " + stock.getStock());
            System.out.println("Кошик: " + cart.getCart());

        } catch (OutOfStockException | NoSuchProductException | InsufficientFundsException |
                 DuplicateCategoryException | IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
