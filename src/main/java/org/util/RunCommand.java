package org.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunCommand {
    public static String[] ret(String command) {
        String[] content = new String[0];
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
