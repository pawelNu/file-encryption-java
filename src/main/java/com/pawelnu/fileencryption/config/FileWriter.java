package com.pawelnu.fileencryption.config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {
    public static void writeStringToFile(String content, String filePath) throws IOException {
        Path path = Path.of(filePath);
        Files.writeString(path, content, StandardCharsets.UTF_8);
    }
}
