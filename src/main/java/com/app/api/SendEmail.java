package com.app.api;

import com.app.entidades.Email;
import com.app.util.EmailUtil;

public class EmailApi {
    public static void main(String[] args) {
        Email email = new Email(
                "destinatario@example.com",
                "Assunto de Teste",
                "Corpo do email de teste",
                "caminho/para/seu/arquivo.pdf"
        );

        EmailUtil emailUtil = new EmailUtil();
        emailUtil.sendEmail(email);
    }
}
