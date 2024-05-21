
package com.app.util;

import java.util.regex.Pattern;

public class Validador {
    
    
    public void validaCep(String value) {
       String regex = "\\d{8}";
       boolean isValid =Pattern.matches(regex, value);
       
       if (!isValid) {
        throw new IllegalArgumentException("Formato de CEP inválido");
       }
    }
    
    public boolean isEmpty(String value) {
        return value.isBlank();
    }

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        if (!(cpf.charAt(9) - '0' == digito1 && cpf.charAt(10) - '0' == digito2)){
            return false;
        }
        return true;
    }

    public static boolean validarCNPJ(String cnpj) {
        cnpj = cnpj.replaceAll("[^0-9]", "");

        if (cnpj.length() != 14 || cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * ((i < 4) ? 5 - i : 13 - i);
        }
        int digito1 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * ((i < 5) ? 6 - i : 14 - i);
        }
        int digito2 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        if (!(cnpj.charAt(12) - '0' == digito1 && cnpj.charAt(13) - '0' == digito2)){
            return false;
        }

        return true;

    }

    public static boolean validarData(String data) {

        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        int anoAtual = java.time.LocalDate.now().getYear();
        if (ano < 1900 || ano > anoAtual) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {31, 28 + (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    public static boolean validarDataTermino(String dataInicio, String dataFim) {

        String[] partesInicio = dataInicio.split("/");
        int diaInicio = Integer.parseInt(partesInicio[0]);
        int mesInicio = Integer.parseInt(partesInicio[1]);
        int anoInicio = Integer.parseInt(partesInicio[2]);

        String[] partesFim = dataFim.split("/");
        int diaFim = Integer.parseInt(partesFim[0]);
        int mesFim = Integer.parseInt(partesFim[1]);
        int anoFim = Integer.parseInt(partesFim[2]);

        LocalDate dataInicioLocalDate = LocalDate.of(anoInicio, mesInicio, diaInicio);
        LocalDate dataFimLocalDate = LocalDate.of(anoFim, mesFim, diaFim);

        return !dataFimLocalDate.isBefore(dataInicioLocalDate);
    }
}
