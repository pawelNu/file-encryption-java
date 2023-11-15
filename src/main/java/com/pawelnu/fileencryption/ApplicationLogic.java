package com.pawelnu.fileencryption;

import static com.pawelnu.fileencryption.ConfigEncryptor.encrypt;

public class ApplicationLogic {
    public static void main(String[] args) {

        String password = "superSecretPassword";
        String plaintextConfig = "Wlazł kotek na płotek\ni mruga";
        System.out.println("Before encryption:");
        System.out.println(plaintextConfig);

        try {
            String encryptedConfig = encrypt(plaintextConfig, password);
            System.out.println("Encrypted Config:\n" + encryptedConfig);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
