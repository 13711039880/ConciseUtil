package org.util;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 执行命令
 * @author 8043
 */

public class RunCommand {
    /**
     * 有返回
     * @param command 命令
     * @return Thread
     */
    public static String[] ret(@NotNull String command) {
        String[] content;
        String line;
        int LineI = 0;
        content = new String[0];

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            process.waitFor();

            while ((line = reader.readLine()) != null) {
                content[LineI] = line;
                LineI++;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * 无返回
     * @param command 命令
     */
    public static void NoRet(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
