package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Test
    public void testPlaceOrderCalculates() {

        Order order = new Order(1, "Laptop", 1000);

        doNothing().when(emailService).sendEmail(order);

        orderService.placeOrder(order);
        assertEquals(1200, order.getPriceWithTax(), 0.01);
        assertEquals(true, order.isCustomerNotified());

        verify(emailService).sendEmail(order);
    }

    @Test
    public void testPlaceOrderWithReturnsTrue() {

        Order order = new Order(1, "Phone", 500);

        when(emailService.sendEmail(order, "abc@gmail.com"))
                .thenReturn(true);

        boolean result = orderService.placeOrder(order, "abc@gmail.com");

        assertEquals(true, result);
        assertEquals(true, order.isCustomerNotified());
    }

    @Test
    public void testPlaceOrderWithReturnsFalse() {

        Order order = new Order(1, "Tablet", 300);

        when(emailService.sendEmail(order, "abc@gmail.com"))
                .thenReturn(false);
        boolean result = orderService.placeOrder(order, "abc@gmail.com");

        assertEquals(false, result);
        assertEquals(false, order.isCustomerNotified());
    }
}
