package com.app.util;

import javax.swing.*;
import java.io.File;

public class FileChooser {
    public static File getFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }

    public static String getPath() {
        File file = getFile();
        return (file != null) ? file.getAbsolutePath() : null;
    }
}
