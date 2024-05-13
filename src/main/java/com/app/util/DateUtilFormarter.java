
package com.app.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilFormarter {
    
   
    
    public static String dateToString() {
        Date date = new Date();

        // Criando um objeto SimpleDateFormat para formatar a data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Convertendo a data para uma string no formato desejado
        String dateString = sdf.format(date);

        // Imprimindo a string formatada
       return dateString;
    }
    
    public static String dateToStringContract() {
       // converter o mes para nome talvez
       return "Rio de Janeiro, "+ dateToString();
    }
}
