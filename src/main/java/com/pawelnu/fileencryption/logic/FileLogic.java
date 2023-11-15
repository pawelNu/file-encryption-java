package com.pawelnu.fileencryption.logic;

import com.pawelnu.fileencryption.config.ConfigParser;

import java.io.IOException;

public class FileLogic {
    public static void main(String[] args) {
        try {
            ConfigParser configParser = new ConfigParser();
            configParser.loadConfig("config.properties");

            String valueTest = configParser.getConfigValue("test.test");
            String valueTest2 = configParser.getConfigValue("test.test2");

            System.out.println("test.test: " + valueTest);
            System.out.println("test.test2: " + valueTest2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
