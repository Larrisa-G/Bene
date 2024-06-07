package com.app.util;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {
    public static File getFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }

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
