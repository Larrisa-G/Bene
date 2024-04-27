
package com.app.util;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileChooser {
    
    public static String getPath() throws IOException{
     JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fileChooser.setDialogTitle("Escolha um diretório para salvar");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos Word", "doc");
            fileChooser.setFileFilter(filter);

            int returnValue = fileChooser.showSaveDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                String selectedDirectory = fileChooser.getSelectedFile().getAbsolutePath();
                if(!selectedDirectory.endsWith(".doc")) {
                    selectedDirectory += ".doc";
                    
                }
                return selectedDirectory;
                
            } else {
                throw new IOException("Caminho para salvar não especificado");
            }   
    }
    
}
