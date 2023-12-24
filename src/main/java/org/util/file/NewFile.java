package org.util.file;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void NewFile(String file) {
        File NewFile = new File(file.replace("*fsr*", File.separator));

        try {
            NewFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
