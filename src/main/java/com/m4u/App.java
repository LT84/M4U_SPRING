package com.m4u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        //Launching SpringBoot app and getting context
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

    }
}
