package org.xander;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;


public class CartTest {

    private Cart cart;

    @Before
    public void setUp() {
        cart = new Cart();
    }

    @Test
    public void testAddProductToCart() {
        Product product = new Product(1, "Laptop", 1000.0);
        cart.addProduct(product);

        assertEquals(1, cart.getProducts().size());
        assertEquals(product, cart.getProducts().get(0));
    }

    @Test
    public void testRemoveProductFromCart() {
        Product product1 = new Product(1, "Laptop", 1000.0);
        Product product2 = new Product(2, "Smartphone", 500.0);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.removeProduct(product1);

        assertEquals(1, cart.getProducts().size());
        assertEquals(product2, cart.getProducts().get(0));
    }

    @Test
    public void testClearCart() {
        Product product = new Product(1, "Laptop", 1000.0);
        cart.addProduct(product);

        cart.clearCart();

        assertEquals(0, cart.getProducts().size());
    }
}
