package org.util.file;

import java.io.File;

public class DeleteFile {
    public static void DeleteFile(String file) {
        File DeleteFile = new File(String.valueOf(file));
        DeleteFile.delete();
    }
}
