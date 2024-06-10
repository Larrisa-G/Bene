
package com.app.word;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import lombok.Setter;

public class WordGenerator {
    
    private HWPFDocument document;
    @Setter
    private String inputFilePath;
    @Setter
    private String outputFilePath;
    
    public void openWord() throws IOException,FileNotFoundException{
        
        try(FileInputStream fis = new FileInputStream(inputFilePath);) {
            
            document = new HWPFDocument(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(String.format("Arquivo: %s não encontrado",inputFilePath));
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        } 
    }
    
    public void modifyWord(String searchText, String replacementText) {
        Range range = document.getRange();
        String text = range.text();
        if (text.contains(searchText)) {
            range.replaceText(searchText, replacementText);
        }
    };
    
    public void close() throws IOException{
         try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            document.write(fos);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Arquivo de saída não encontrado: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException("Erro ao fechar o arquivo: " + e.getMessage());
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }
}
