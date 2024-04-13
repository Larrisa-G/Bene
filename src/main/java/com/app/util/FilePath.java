
package com.app.util;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FilePath {
    
    public static String getPath(String path){
        String caminhoRelativo = path;

        // Obtém o caminho absoluto do arquivo
        String caminhoAbsoluto = new File(caminhoRelativo).getAbsolutePath();
        return caminhoAbsoluto;
    }
}
