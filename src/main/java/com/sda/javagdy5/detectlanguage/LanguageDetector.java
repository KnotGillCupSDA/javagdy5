package com.sda.javagdy5.detectlanguage;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LanguageDetector {

    public LanguageDetector() {
        DetectLanguage.apiKey = "6e4f850361c3d2eab677d3a794206ee8";
    }

    public String detect(Path path) throws IOException, APIError {
        return DetectLanguage.simpleDetect(Files.readString(path));
    }
}
