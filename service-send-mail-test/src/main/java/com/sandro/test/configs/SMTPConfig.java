package com.sandro.test.configs;

import com.radix.mail.implementations.ISMTPConfig;
import org.springframework.stereotype.Component;

@Component
public class SMTPConfig implements ISMTPConfig {

    private final String host = "mail.test";
    private Integer port = 465;
    private Boolean ssl = true;
    private Boolean tls = true;
    private String user = "username";
    private String password = "password";


    @Override
    public String getHost() {
        return host;
    }

    @Override
    public Integer getPort() {
        return port;
    }

    @Override
    public Boolean getUseSSL() {
        return ssl;
    }

    @Override
    public Boolean getUseTLS() {
        return tls;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
