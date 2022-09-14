package lab3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YanGoTranslate {
    private final Map<String, String> dictionary = new HashMap<>();

    public YanGoTranslate(String path) {
        loadDictionary(path);
    }

    private void loadDictionary(String path) {
        if (path == null || path.isBlank()) {
            throw new RuntimeException();
        }
        File file = new File(path);
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new RuntimeException(path);
        }
        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            while (scanner.hasNext()) {
                String[] split = scanner.nextLine().split("\\|", 2);
                String key = split[0].trim().toLowerCase();
                String value = split[1].trim();
                String exist = dictionary.get(key);
                if (exist != null) {
                    value = value.length() > exist.length() ? value : exist;
                }
                dictionary.put(key, value);
            }
        } catch (IOException e) {
            throw new RuntimeException(path);
        }
    }

    public String translate(String path) {
        if (path == null || path.isBlank()) {
            throw new RuntimeException();
        }
        File file = new File(path);
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new RuntimeException(path);
        }
        ArrayList<String> strings = new ArrayList<>();
        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            while (scanner.hasNext()) {
                strings.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(path);
        }
        String text = String.join(" ", strings).toLowerCase();

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            text = text.replace(entry.getKey(), entry.getValue());
        }

        return text;
    }
}
