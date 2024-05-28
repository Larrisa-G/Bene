
package com.app.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtilFormarter {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   
    
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
    
    
    public static Date stringToDate(String s) throws ParseException{
         try {
             return dateFormat.parse(s);
         }catch(ParseException e) {
             throw new ParseException("Data inválida",1);
             
         }
    }
    
    public static String sqlDateToString(java.sql.Date d ){
        Date date = new Date(d.getTime());
        return dateFormat.format(date);
    }
}
