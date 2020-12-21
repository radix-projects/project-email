package com.sandro.mail;

import com.radix.mail.implementations.ISMTPConfig;
import com.radix.mail.implementations.SMTPSendMail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SMTPConfig implements ISMTPConfig {


    private final String host = "smtp.mailtrap.io";
    private final Integer port = 2525;
    private final Boolean ssl = false;
    private final Boolean tls = false;
    private final String user = "758475a6e931a9";
    private final String password = "8d04ec25be4dac";


    @Override
    public String getHost() {
        return this.host;
    }

    @Override
    public Integer getPort() {
        return this.port;
    }

    @Override
    public Boolean getUseSSL() {
        return this.ssl;
    }

    @Override
    public Boolean getUseTLS() {
        return this.tls;
    }

    @Override
    public String getUser() {
        return this.user;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
