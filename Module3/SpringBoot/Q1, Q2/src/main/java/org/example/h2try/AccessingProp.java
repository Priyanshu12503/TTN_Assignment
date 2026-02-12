package org.example.h2try;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class AccessingProp {

    @Value("${one.key}")
    private int key;

    @Value("${one.pass}")
    private  String pass;

    public void printingVal() {
        System.out.println("The key is " + key);
        System.out.println("The pass is " + pass);
    }
}

