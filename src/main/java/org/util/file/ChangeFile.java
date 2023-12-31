package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * 用来更改一个文件的内容
 * @author 8043
 */

public class ChangeFile {
    /**
     * 重写
     * @param file 文件
     * @param content 内容
     */
    public static void intact(@NotNull String file, @NotNull String[] content) {
        try (FileWriter fileWriter = new FileWriter(file.replace("*fsr*", File.separator));
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : content) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 指定行写
     * @param file 文件
     * @param line 行数
     * @param content 内容
     */
    public static void line(@NotNull String file, int line, String content) {
        try {
            Path path = Paths.get(file);
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.set(line - 1, content);
            Files.write(path, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 往后写
     * @param file 文件
     * @param content 内容
     */
    public static void proceed(@NotNull String file, String content) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
