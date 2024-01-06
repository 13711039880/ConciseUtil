package org.util.file;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读文件内容
 * @author 8043
 */

public class ReadFile {
    /**
     * 整个
     * @param file 文件
     * @return 内容
     */
    public static String[] intact(@NotNull String file) {
        File ReadFile = new File(file.replace("*fsr*", File.separator));
        String line;
        int count = 0;
        String[] content = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file.replace("*fsr*", File.separator)))) {
            while ((line = br.readLine()) != null) {
                content[count] = line;
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * 指定行
     * @param file 文件
     * @param line 行数
     * @return 内容
     */
    public static String line(@NotNull String file, int line) {
        File ReadFile = new File(file);
        int count = 0;
        String[] content = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String lc;

            while ((lc = br.readLine()) != null) {
                content[count] = lc;
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content[line - 1];
    }
}
