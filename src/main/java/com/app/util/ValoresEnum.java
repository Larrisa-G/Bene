
package com.app.util;

import java.util.ArrayList;

public class ValoresEnum {
    public static <T extends Enum<T>> String[] obterValoresEnum(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        String[] valores = new String[enumConstants.length + 1];
        for (int i = 0; i < valores.length; i++) {
            if(i == 0) {
                 valores[i] = "--Selecione--";
            } else {
                valores[i] = enumConstants[i-1].name().replace("_", " ");
            }
        }
        return valores;
    }
    
    public static <T extends Enum<T>> String[] separarGenero(Class<T> enumClass, String generoArg){
        
        String[] generos = obterValoresEnum(enumClass);
        ArrayList<String> generosSeparados = new ArrayList<>();
        
        for(String genero : generos) {
            if( genero.toLowerCase().endsWith(generoArg)) {
                generosSeparados.add(genero);
            }
        }
        
        return generosSeparados.toArray(String[]::new);
    } 
}
