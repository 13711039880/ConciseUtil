package org.util.file;

import java.io.File;

public class RenFile {
    public static void RenFile(String file, String NewName) {
        File old = new File(file);
        File nen = new File(file);
        old.renameTo(nen);
    }
}
