package com.email.email_writer_sb.controller;

import com.email.email_writer_sb.dto.EmailRequest;
import com.email.email_writer_sb.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest request){
        String response = emailGeneratorService.generateEmailReply(request);
        return ResponseEntity.ok(response);
    }
}
