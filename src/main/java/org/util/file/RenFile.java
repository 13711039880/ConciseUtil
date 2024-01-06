package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * 重命名文件
 * @author 8043
 */

public class RenFile {
    /**
     * 获取一个 properties 里面的某个东西的值
     * @param file 文件
     * @param NewName 新名
     */
    public static void RenFile(@NotNull String file, String NewName) {
        File old = new File(file.replace("*fsr*", File.separator));
        File nen = new File(file.replace("*fsr*", File.separator));
        old.renameTo(nen);
    }
}
