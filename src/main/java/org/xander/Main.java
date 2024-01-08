package org.xander;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product laptop = new Product(1, "Acer Aspire X", 50000.1);
        Product smartphone = new Product(2, "YPhone", 10800.0);

        Cart cart = new Cart();

        cart.addProduct(laptop);
        cart.addProduct(smartphone);

        System.out.println("Кошик після додавання продуктів:");
        displayCart(cart);

        cart.removeProduct(laptop);

        System.out.println("Кошик після видалення продукту:");
        displayCart(cart);

        Order order = placeOrder(cart);

        System.out.println("Статус замовлення: " + order.getStatus());
    }

    private static void displayCart(Cart cart) {
        List<Product> products = cart.getProducts();
        for (Product product : products) {
            System.out.println("ID: " + product.getId() +
                    ", Назва: " + product.getName() +
                    ", Ціна: " + product.getPrice());
        }
        System.out.println("Загальна вартість: " + calculateTotalPrice(cart) + "\n");
    }

    private static double calculateTotalPrice(Cart cart) {
        return cart.getProducts().stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    private static Order placeOrder(Cart cart) {

        int orderId = 1;
        String orderStatus = "Pending...";
        List<Product> orderedProducts = cart.getProducts();

        return new Order(orderId, orderedProducts, orderStatus);
    }
}
