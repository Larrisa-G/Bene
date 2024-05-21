package com.app.util;

import com.app.entidades.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class EmailUtil {
    private final String username = "seu_email@gmail.com";
    private final String password = "sua_senha";

    public void sendEmail(Email email) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getTo()));
            message.setSubject(email.getSubject());

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(email.getBody());

            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(email.getAttachmentPath()));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Email enviado com sucesso para " + email.getTo());
        } catch (MessagingException | java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}
