package com.chcpc.registryservercentertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerCenterTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServerCenterTwoApplication.class, args);
    }

}
