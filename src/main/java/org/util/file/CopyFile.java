package org.util.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFile {
    public static void CopyFile(String sourceFilePath, String targetFilePath) {
        try {
            File sourceFile = new File(sourceFilePath);
            File targetFile = new File(targetFilePath);
            String command = "cmd /c copy " + sourceFile + " " + targetFile;
            Process process = Runtime.getRuntime().exec(command);
            new BufferedReader(new InputStreamReader(process.getInputStream()));
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
