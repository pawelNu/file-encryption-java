package com.pawelnu.fileencryption.logic;

import com.pawelnu.fileencryption.config.ConfigParser;

import java.io.IOException;

public class FileLogic {
    public static void main(String[] args) {

        // reading the encrypted file
//        try {
//            ConfigParser configParser = new ConfigParser();
//            configParser.loadConfig("config.properties");
//
//            String valueTest = configParser.getConfigValue("test.test");
//            String valueTest2 = configParser.getConfigValue("test.test2");
//
//            System.out.println("test.test: " + valueTest);
//            System.out.println("test.test2: " + valueTest2);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // file encryption
//        try {
//            ConfigParser configParser = new ConfigParser();
//            configParser.loadConfigEncryptAndSaveToFile("config.properties");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // reading the encrypted file
        try {
            ConfigParser configParser = new ConfigParser();
            configParser.loadEncryptedConfig("config.properties.encrypted");

            String valueTest = configParser.getConfigValue("test.test");
            String valueTest2 = configParser.getConfigValue("test.test2");

            System.out.println("test.test: " + valueTest);
            System.out.println("test.test2: " + valueTest2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
