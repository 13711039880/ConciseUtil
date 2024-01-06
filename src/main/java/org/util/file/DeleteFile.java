package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * 删除文件
 * @author 8043
 */

public class DeleteFile {
    /**
     * 删除文件
     * @param file 文件
     */
    public static void DeleteFile(@NotNull String file) {
        File DeleteFile = new File(file.replace("*fsr*", File.separator));
        DeleteFile.delete();
    }
}
