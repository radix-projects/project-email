package com.sandro.test.resources;

import com.sandro.test.services.SendMailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/email")
public class SendMailResource {

    private SendMailService sendMailService;

    public SendMailResource(SendMailService sendMailService) {
        this.sendMailService = sendMailService;
    }

    @GetMapping
    public ResponseEntity send(){
        this.sendMailService.kafkaMailProducer();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
