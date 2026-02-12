package org.example.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devtool")
public class Controller {


    @GetMapping
   public String printHello()
   {
       return "Current T "+System.currentTimeMillis();
   }
}
