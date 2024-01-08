package org.xander;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void testGetOrderStatus() {
        Order order = Mockito.mock(Order.class);
        when(order.getStatus()).thenReturn("Shipped by Nova Po4ta");

        assertEquals("Shipped by Nova Po4ta", order.getStatus());

        verify(order, times(1)).getStatus();
    }
}