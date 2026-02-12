package com.demo.service;

import com.demo.domain.Order;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest extends Assert{

Assert as = new Assert();

    @Test(expected = RuntimeException.class)
    public void testPlaceOrderWithoutCC() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Laptop", 1000);

        orderService.placeOrder(order);
    }

    @Test
    public void testPlaceOrderWithCC() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Laptop", 1000);

        boolean result = orderService.placeOrder(order, "cc@test.com");

        assertTrue(result);
        assertEquals(1200.0, order.getPriceWithTax(), 0.0);
        assertTrue(order.isCustomerNotified());
    }

}
