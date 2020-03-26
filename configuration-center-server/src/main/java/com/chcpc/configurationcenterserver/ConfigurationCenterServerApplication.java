package com.chcpc.configurationcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigurationCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationCenterServerApplication.class, args);
    }

}
