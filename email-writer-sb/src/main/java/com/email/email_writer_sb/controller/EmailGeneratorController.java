package com.email.email_writer_sb.controller;

import com.email.email_writer_sb.dto.EmailRequest;
import com.email.email_writer_sb.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "http://localhost:3000")
public class EmailGeneratorController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<Map<String,String>> generateEmail(@RequestBody EmailRequest request){
        System.out.println("Email Content: " + request.getEmailContent());
        System.out.println("Tone: " + request.getTone());
        String response = emailGeneratorService.generateEmailReply(request);
        return ResponseEntity.ok(Map.of("reply",response));
    }
}
