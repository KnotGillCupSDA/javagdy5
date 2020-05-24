package com.sda.javagdy5.detectlanguage;

import com.detectlanguage.errors.APIError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        LanguageDetector languageDetector = new LanguageDetector();

        try {
            Files.list(Paths.get("src\\main\\resources"))
                .forEach(path -> {
                    String languageCode = null;
                    try {
                        languageCode = languageDetector.detect(path);
                    } catch (IOException | APIError e) {
                        e.printStackTrace();
                    }
                    System.out.println("Plik " + path + " jest w języku: " + languageCode);
                });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
