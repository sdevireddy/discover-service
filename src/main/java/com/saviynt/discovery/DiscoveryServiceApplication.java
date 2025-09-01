package com.saviynt.discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {
    org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration.class
})
@EnableEurekaServer
public class DiscoveryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceApplication.class,args);
    }

}
