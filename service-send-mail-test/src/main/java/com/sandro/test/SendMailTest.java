package com.sandro.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(scanBasePackages = {"com.radix.*", "com.sandro.*"})
@EnableKafka
public class SendMailTest {

    public static void main(String[] args) {
        SpringApplication.run(SendMailTest.class, args);
    }

}
