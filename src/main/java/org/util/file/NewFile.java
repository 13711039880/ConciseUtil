package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

/**
 * 创建新文件
 * @author 8043
 */

public class NewFile {
    /**
     * 创建新文件
     * @param file 文件
     */
    public static void NewFile(@NotNull String file) {
        File NewFile = new File(file.replace("*fsr*", File.separator));

        try {
            NewFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
