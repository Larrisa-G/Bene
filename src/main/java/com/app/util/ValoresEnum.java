
package com.app.util;

public class ValoresEnum {
    public static <T extends Enum<T>> String[] obterValoresEnum(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        String[] valores = new String[enumConstants.length];
        for (int i = 0; i < enumConstants.length; i++) {
            valores[i] = enumConstants[i].name(); // Obtém o nome do valor enum como uma string
        }
        return valores;
    }
}
