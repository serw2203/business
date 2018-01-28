package ru.desinger.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@Slf4j
public class BusinessApplication {

    public static void main(String[] args) {
        log.info("++++++++++++++++++++++++++++++++++++++++++++");
        SpringApplication.run(BusinessApplication.class, args);
    }
}
