package org.example;


import com.netflix.discovery.EurekaClient;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientDemo {

    private EurekaClient eurekaClient;

    //EurekCleintDemo has in an instace of EurekClient and it getting compiled without an issue, that prooves the spring-cloud-starter-netflix-eureka-client dependency is injected successfully
}
