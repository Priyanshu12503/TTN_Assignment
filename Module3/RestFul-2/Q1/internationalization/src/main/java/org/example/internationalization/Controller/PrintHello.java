package org.example.internationalization.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/hello")
public class PrintHello {


    private final MessageSource messageSource;

    @Autowired
    public PrintHello(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public String hello(@RequestParam String s, Locale locale)
    {
        return messageSource.getMessage("greeting",new Object[]{s},locale);

    }


}
