# file-encryption-java

<!-- TOC -->
* [file-encryption-java](#file-encryption-java)
  * [Features](#features)
  * [Usage](#usage)
  * [Console interface](#console-interface)
  * [Result - example](#result---example)
<!-- TOC -->

## Features

Simple encryption app for encryption `config.properties` file.

Application has HARDCODED encryption password in `com.pawelnu.fileencryption.config.ConfigParser.password`.
CHANGE IT before package to `.jar`.

The application was created to encrypt configuration files to another application, 
because the configuration file is shared on a public server.

That's why the password is hard-coded in the encryption application 
and in the application for which the configuration file is encrypted.

The application uses a standard library for encryption and does not require a sign or certificate.

## Usage

1. Create `.jar` file `mvn clean package`.
2. Create directory for application.
3. Copy created `.jar` file (`fileEncryption-java-11-1.0.0.jar`) and `fileEncryption.bat` to application directory.
4. Copy to application directory `config.properties` file you want to encrypt.
5. Run `fileEncryption.bat`.
6. Choose 1 to encrypt file - result: `config.properties.encrypted`.
7. Choose 2 to exit application.

## Console interface

```shell
Welcome to the File Encryption Console App!
To encrypt prepare config.properties file in the same directory as application.
1. Encrypt File
2. Exit
Please choose an option (1 or 2): 1
Created file: config.properties.encrypted.

Welcome to the File Encryption Console App!
To encrypt prepare config.properties file in the same directory as application.
1. Encrypt File
2. Exit
Please choose an option (1 or 2): 2
Exiting the application.
```

## Result - example

config.properties
```properties
test.test=Test 1
test.test2=Test 2
```

config.properties.encrypted
```text
SYHRBiRbLCfHDrhfEUvdp1JyecJ7FP9JvKH36Ds4YSOI4y3TCvfgkUGXqXhXwbMx
```
