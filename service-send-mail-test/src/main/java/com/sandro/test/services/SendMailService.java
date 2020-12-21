package com.sandro.test.services;

import com.radix.infrastructure.messaging.kafka.CorrelationId;
import com.radix.infrastructure.messaging.kafka.KafkaDispatcher;
import org.springframework.stereotype.Service;
import com.radix.mail.models.Email;

@Service
public class SendMailService {

    private final KafkaDispatcher kafkaDispatcher;

    public SendMailService(KafkaDispatcher kafkaDispatcher) {
        this.kafkaDispatcher = kafkaDispatcher;
    }

    public void kafkaMailProducer() {
        String topic = "TOPIC_MAIL_SEND";
        String subject = "Teste de e-mail";
        CorrelationId correlationId = new CorrelationId("E-mail" + subject);
        Email email = Email.builder()
                .to("teste@ma   il.com")
                .from("sandro@radixeng.com.br")
                .subject(subject)
                .body("<h1>Email de teste<h1>")
                .build();
        kafkaDispatcher.send(topic, correlationId.getId(), correlationId, email);
    }

}
