
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
}
