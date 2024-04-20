
package com.app.util;
import java.io.File;

public class FilePath {
    
    public static String getPath(String path){
        String caminhoRelativo = path;

        // Obtém o caminho absoluto do arquivo
        String caminhoAbsoluto = new File(caminhoRelativo).getAbsolutePath();
        return caminhoAbsoluto;
    }
}
