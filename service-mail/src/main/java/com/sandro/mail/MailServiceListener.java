package com.sandro.mail;

import com.radix.infrastructure.messaging.kafka.Message;
import com.radix.mail.models.Email;
import com.radix.mail.providers.ISendMailProvider;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log
@Service
public class MailServiceListener {

    @Autowired
    private ISendMailProvider smtp;

    @KafkaListener(topics = "TOPIC_MAIL_SEND", groupId = "MAIL_SEND")
    private void listenToMailSenderTopic(Message<Email> message){
        log.info("Fire mail send");
        smtp.sendMail(message.getPayLoad());
    }

}
