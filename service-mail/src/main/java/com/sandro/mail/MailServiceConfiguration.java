package com.sandro.mail;

import com.radix.mail.implementations.ISMTPConfig;
import com.radix.mail.implementations.SMTPSendMail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailServiceConfiguration {

    @Bean
    public ISMTPConfig smtpConfig(){
        return new SMTPConfig();
    }

    @Bean
    public SMTPSendMail smtp(){
        return new SMTPSendMail();
    }

}
