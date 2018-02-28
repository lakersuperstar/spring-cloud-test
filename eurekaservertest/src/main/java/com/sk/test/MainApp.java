package com.sk.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * A Camel Application
 */
@SpringBootApplication
@EnableEurekaServer
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        new SpringApplicationBuilder(MainApp.class).web(true).run(args);
    }

}

