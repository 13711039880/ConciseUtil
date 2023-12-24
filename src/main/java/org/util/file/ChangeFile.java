package org.util.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ChangeFile {
    public static void intact(String file, String[] content) {
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

    public static void line(String file, int line, String content) {
        try {
            Path path = Paths.get(file);
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.set(line - 1, content);
            Files.write(path, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void proceed(String file, String content) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
