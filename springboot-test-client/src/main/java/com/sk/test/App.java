package com.sk.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class App 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
