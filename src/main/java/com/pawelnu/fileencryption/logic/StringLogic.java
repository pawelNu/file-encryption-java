package com.pawelnu.fileencryption.logic;

import static com.pawelnu.fileencryption.config.ConfigEncryptor.decrypt;
import static com.pawelnu.fileencryption.config.ConfigEncryptor.encrypt;

public class StringLogic {
    public static void main(String[] args) {

        String password = "superSecretPassword";
        String plaintextConfig = "Wlazł kotek na płotek\ni mruga";
        System.out.println("Before encryption:");
        System.out.println(plaintextConfig);
        
        String encryptedConfig = null;

        try {
            encryptedConfig = encrypt(plaintextConfig, password);
            System.out.println("Encrypted Config:\n" + encryptedConfig);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String decryptedConfig;
        
        try {
            decryptedConfig = decrypt(encryptedConfig, password);
            System.out.println("Decrypted Config:\n" + decryptedConfig);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
