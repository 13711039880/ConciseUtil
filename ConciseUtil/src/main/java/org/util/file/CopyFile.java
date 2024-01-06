package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 复制文件
 * @author 8043
 */

public class CopyFile {
    /**
     * 复制文件
     * @param SourceFile 文件
     * @param NewFile 新文件
     */
    public static void CopyFile(@NotNull String SourceFile, @NotNull String NewFile) {
        try {
            File sourceFile = new File(SourceFile.replace("*fsr*", File.separator));
            File targetFile = new File(NewFile.replace("*fsr*", File.separator));
            String command = "cmd /c copy " + sourceFile + " " + targetFile;
            Process process = Runtime.getRuntime().exec(command);
            new BufferedReader(new InputStreamReader(process.getInputStream()));
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
