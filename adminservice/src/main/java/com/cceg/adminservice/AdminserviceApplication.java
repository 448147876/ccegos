package com.cceg.adminservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminserviceApplication.class, args);
    }

}
