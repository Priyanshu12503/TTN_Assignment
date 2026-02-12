package org.example.h2try;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class H2TryApplication {

    public static void main(String[] args) {


       ApplicationContext applicationContext = SpringApplication.run(H2TryApplication.class, args);

      AccessingProp ap =  applicationContext.getBean(AccessingProp.class);

      ap.printingVal();


    }
}
