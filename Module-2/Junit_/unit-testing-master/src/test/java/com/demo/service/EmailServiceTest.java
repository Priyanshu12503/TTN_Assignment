package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;


public class EmailServiceTest {

    @Test(expected = RuntimeException.class)
    public void testSendEmailWithoutCC() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Pen", 100);

        emailService.sendEmail(order);
    }

    @Test
    public void testSendEmailWithCC() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Pen", 100);

        boolean result = emailService.sendEmail(order, "cc@test.com");
        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }

}