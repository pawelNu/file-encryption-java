package com.pawelnu.fileencryption.config;

public class ConfigProperties {

    private static ConfigProperties instance;
    private String testTest;
    private String testTest2;

    public ConfigProperties() {
    }

    public static ConfigProperties getInstance() {
        if (instance == null) {
            instance = new ConfigProperties();
        }
        return instance;
    }

    public String getTestTest() {
        return testTest;
    }

    public void setTestTest(String testTest) {
        this.testTest = testTest;
    }

    public String getTestTest2() {
        return testTest2;
    }

    public void setTestTest2(String testTest2) {
        this.testTest2 = testTest2;
    }

    @Override
    public String toString() {
        return "ConfigProperties{" +
                "testTest='" + testTest + '\'' +
                ", testTest2='" + testTest2 + '\'' +
                '}';
    }
}
