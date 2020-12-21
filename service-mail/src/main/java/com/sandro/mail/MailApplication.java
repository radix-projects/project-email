package com.sandro.mail;

import com.radix.infrastructure.messaging.kafka.config.consumer.KafkaConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@Import(KafkaConsumerConfig.class)
public class MailApplication {


    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }

}
