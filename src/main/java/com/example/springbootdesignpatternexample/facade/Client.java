package com.example.springbootdesignpatternexample.facade;

public class Client {

    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("service");
        emailMessage.setTo("customer");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이야~");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }
}
