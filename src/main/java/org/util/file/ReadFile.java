package org.util.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String[] intact(String file) {
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

    public static String line(String file, int line) {
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
