package org.xander;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductProperties() {
        Product product = new Product(1, "Acer Aspire 8", 9999.9);

        assertEquals(1, product.getId());
        assertEquals("Acer Aspire 8", product.getName());
        assertEquals(9999.9, product.getPrice(), 0.001);
    }
}
