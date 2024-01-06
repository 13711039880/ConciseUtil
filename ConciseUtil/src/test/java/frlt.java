import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class frlt {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\8043\\Desktop\\aaaaaef.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        lines.set(3 - 1, "data");
        Files.write(path, lines, StandardCharsets.UTF_8);
    }
}
