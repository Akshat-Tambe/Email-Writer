package com.email.email_writer_sb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {
    private String emailContent;
    private String tone;
}
