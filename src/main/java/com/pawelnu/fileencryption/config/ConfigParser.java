package com.pawelnu.fileencryption.config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ConfigParser {

    private final Map<String, String> configMap;

    public ConfigParser() {
        configMap = new HashMap<>();
    }

    public void loadConfig(String filePath) throws IOException {
        String fileContent = loadFileContent(filePath);
        parseConfig(fileContent);
    }

    private void parseConfig(String configContent) {
        String[] lines = configContent.split("\n");

        for (String line : lines) {
            String[] keyValue = line.split("=", 2); // Podział tylko na pierwszym znaku "="
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                configMap.put(key, value);
            }
        }
    }

    public String getConfigValue(String key) {
        return configMap.get(key);
    }

    private String loadFileContent(String filePath) throws IOException {
        Path path = Path.of(filePath);
        byte[] encoded = Files.readAllBytes(path);
        return new String(encoded, StandardCharsets.UTF_8);
    }
}
