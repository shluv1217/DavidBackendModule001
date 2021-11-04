package com.example.demo.dto.mail;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class MailIndexResponseDTO { 
    
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    @Builder
    public static class Response {
        private String returnCode; //00 : 성공, 01 : 부분성공, 99 : 실패
        private String returnMessage;
        private String requestCnt;
        private String errorCnt;
    }
}
