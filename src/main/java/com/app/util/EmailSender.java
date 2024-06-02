package com.app.util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
    public static void sendEmail(String to, String subject, String body, String attachmentPath) throws Exception {
        // Configurações do servidor de e-mail
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Seu servidor SMTP
        props.put("mail.smtp.port", "587"); // Porta do servidor SMTP

        // Credenciais do seu e-mail
        final String username = "javinatorturbo2.0@gmail.com";
        final String password = "ewmx gbha fjzh sjko";

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);

        // Parte do corpo do e-mail
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(body);

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Parte do anexo
        if (attachmentPath != null && !attachmentPath.isEmpty()) {
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(attachmentPath);
            multipart.addBodyPart(attachmentBodyPart);
        }

        message.setContent(multipart);

        Transport.send(message);
    }
}
