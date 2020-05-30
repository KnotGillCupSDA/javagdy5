package com.sda.javagdy5.detectlanguage;

import com.detectlanguage.errors.APIError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LanguageDetector languageDetector = new LanguageDetector();

        try {
            Files.list(Paths.get("src\\main\\resources"))
                .forEach(path -> {
                    try {
                        String languageCode = languageDetector.detect(path);
                        Locale pl = new Locale("pl");
                        Locale locale = new Locale(languageCode);

                        System.out.println("Plik " + path + " jest w języku: " + locale.getDisplayLanguage(pl));
                    } catch (IOException | APIError e) {
                        e.printStackTrace();
                    }
                });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
