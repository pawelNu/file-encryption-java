package com.pawelnu.fileencryption.console;

import com.pawelnu.fileencryption.config.ConfigParser;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleInterface {
    public static void applicationInterface() {
        ConfigParser configParser = new ConfigParser();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Welcome to the File Encryption Console App!");
            System.out.println("To encrypt prepare config.properties file in the same directory as application.");
            System.out.println("1. Encrypt File");
            System.out.println("2. Exit");
            System.out.print("Please choose an option (1 or 2): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        configParser.loadConfigEncryptAndSaveToFile("config.properties");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "2":
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
    }

}
