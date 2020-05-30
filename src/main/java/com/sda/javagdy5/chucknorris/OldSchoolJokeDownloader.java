package com.sda.javagdy5.chucknorris;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class OldSchoolJokeDownloader implements JokeDownloader {

    private final ObjectMapper objectMapper;

    public OldSchoolJokeDownloader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public Joke download(String address) throws IOException {
        URL url = new URL(address);
        URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Chrome");
        try (InputStream inputStream = urlConnection.getInputStream()) {
            try (Scanner scanner = new Scanner(inputStream)) {
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    sb.append(line);
                }

                return objectMapper.readValue(sb.toString(), Joke.class);
            }
        }
    }
}
