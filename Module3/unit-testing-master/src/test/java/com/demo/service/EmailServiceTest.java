package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    private EmailService emailService = new EmailService();

    @Test(expected = RuntimeException.class)
    public void testSendEmailThrowsException() {

        Order order = new Order(1, "Laptop", 1000);
        emailService.sendEmail(order);
    }

    @Test
    public void testSendEmailWithCCReturnsTrue() {

        Order order = new Order(1, "Phone", 500);
        boolean result = emailService.sendEmail(order, "abc@gmail.com");

        assertEquals(true, result);
        assertEquals(true, order.isCustomerNotified());
    }
}
