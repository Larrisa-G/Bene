
package com.app.pdfs;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import lombok.Setter;

public class PDFGenerator {
    
    private HWPFDocument document;
    @Setter
    private String inputFilePath;
    @Setter
    private String outputFilePath;
    
    public void openWord() throws IOException{
        
        try(FileInputStream fis = new FileInputStream(inputFilePath);) {
            
            document = new HWPFDocument(fis);
            fis.close();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
    
    public void modifyWord(String searchText, String replacementText) {
        Range range = document.getRange();
        String text = range.text();
        if (text.contains(searchText)) {
            //text = text.replace(searchText, replacementText);
            range.replaceText(searchText, replacementText);
        }
    };
    
    public void close() throws IOException{
        try (FileOutputStream fos = new FileOutputStream(outputFilePath);) {   
            document.write(fos);
            fos.close();
            document.close();
        } catch (FileNotFoundException e) {
            throw new IOException(e.getMessage());
        }
    }
}
